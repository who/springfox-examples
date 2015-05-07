package com.github.who.springfoxexample.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value="SampleModel")
public class SampleModel{
    private String sampleValue;

    @ApiModelProperty(value = "get getSampleValue")
    public String getSampleValue() {
        return sampleValue;
    }

    public void setSampleValue(String sampleValue) {
        this.sampleValue = sampleValue;
    }
}
