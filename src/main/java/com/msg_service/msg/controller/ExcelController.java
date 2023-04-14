package com.msg_service.msg.controller;

import com.alibaba.fastjson.JSONArray;
import com.msg_service.msg.model.Hongzha;
import com.msg_service.msg.model.Result;
import com.msg_service.msg.service.ExcelService;
import com.msg_service.msg.utils.excel.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    ExcelService excelService;

    @GetMapping("/import")
    public Result importExcel(@RequestPart("file") MultipartFile multipartFile){
        return excelService.importExcel(multipartFile);
    }

    @GetMapping("/export")
    public Result exportExcel(HttpServletResponse response){
        return excelService.exportExcel(response);
    }

}
