package com.msg_service.msg.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */

public class TestC {



    private String Bill_Hdr_Id;


    private String Ldc_Id;

    @JsonProperty("Bill_Hdr_Id")
    public String getBill_Hdr_Id() {
        return Bill_Hdr_Id;
    }

    public void setBill_Hdr_Id(String bill_Hdr_Id) {
        Bill_Hdr_Id = bill_Hdr_Id;
    }
    @JsonProperty("Ldc_Id")
    public String getLdc_Id() {
        return Ldc_Id;
    }

    public void setLdc_Id(String ldc_Id) {
        Ldc_Id = ldc_Id;
    }

}
