package com.msg_service.msg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.msg_service.msg.utils.excel.ExcelExport;
import com.msg_service.msg.utils.excel.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hongzha implements Serializable {
    @ExcelImport("用户ID")
    @ExcelExport(value = "用户ID")
    private Integer uid;
    @ExcelImport("用户key")
    @ExcelExport(value = "用户key")
    private String touser;
    @ExcelImport("用户名称")
    @ExcelExport(value = "用户名称")
    private String username;
    @ExcelImport("用户性别")
    @ExcelExport(value = "用户性别")
    @JsonIgnore
    private String xingbie;
}