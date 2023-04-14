package com.msg_service.msg.service;

import com.msg_service.msg.model.Result;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 *
 */
public interface ExcelService {
    Result importExcel(MultipartFile multipartFile);

    Result exportExcel(HttpServletResponse response);

}
