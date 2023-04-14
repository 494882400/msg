package com.msg_service.msg.controller.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class A {
    private String Flag;
    private String Result;

    //@JsonProperty("Flag")
    //public String getFlag() {
    //    return Flag;
    //}
    //
    //public void setFlag(String flag) {
    //    Flag = flag;
    //}
    //@JsonProperty("Result")
    //public String getResult() {
    //    return Result;
    //}
    //
    //public void setResult(String result) {
    //    Result = result;
    //}
}
