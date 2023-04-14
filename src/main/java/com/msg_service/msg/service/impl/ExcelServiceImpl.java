package com.msg_service.msg.service.impl;

import com.msg_service.msg.mapper.HongzhaMapper;
import com.msg_service.msg.model.Hongzha;
import com.msg_service.msg.model.Result;
import com.msg_service.msg.service.ExcelService;
import com.msg_service.msg.utils.DistributedLock;
import com.msg_service.msg.utils.excel.ExcelUtils;
import org.apache.http.protocol.HTTP;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 */
@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private HongzhaMapper hongzhaMapper;
    @Autowired
    private DistributedLock distributedLock;

    public static ThreadPoolExecutor threadPoolExecutor;

    @Override
    public Result importExcel(MultipartFile multipartFile) {
        Result result = new Result();
        try {
            List<Hongzha> hongzhas = ExcelUtils.readMultipartFile(multipartFile, Hongzha.class);
            result.setFlag(false);
            result.setMsgInfo(hongzhas.toString());
        } catch (Exception e) {
            result.setFlag(false);
            result.setErrInfo(e.getMessage());
        }
        return result;
    }

    @Override
    public Result exportExcel(HttpServletResponse response) {
        Result result = new Result();
        try {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    // 表格数据
                    List<Hongzha> hongzhas = hongzhaMapper.selectAll();
                    hongzhas.forEach(t->t.setXingbie(t.getUid()%2==0 ? "男":"女"));
                    ExcelUtils.export(response,"用户表",hongzhas,Hongzha.class);
                }
            });
            result.setFlag(true);
            result.setMsgInfo(response.toString());
        } catch (Exception e) {
            result.setFlag(false);
            result.setErrInfo(e.getMessage());
        }
        return result;
    }

    @PostConstruct
    public ThreadPoolExecutor threadsRun(HttpServletResponse response){
        threadPoolExecutor = new ThreadPoolExecutor(10, 10, 30, TimeUnit.SECONDS, new PriorityBlockingQueue<>(), new ThreadPoolExecutorFactoryBean(), new ThreadPoolExecutor.DiscardOldestPolicy());
        return threadPoolExecutor;
    }

}
