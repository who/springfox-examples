package com.github.who.springfoxexample.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value="AnotherSampleModel")
public class AnotherSampleModel {
    private String sampleValue;

    @ApiModelProperty(value = "get getSampleValue")
    public String getSampleValue() {
        return sampleValue;
    }

    public void setSampleValue(String sampleValue) {
        this.sampleValue = sampleValue;
    }
}
