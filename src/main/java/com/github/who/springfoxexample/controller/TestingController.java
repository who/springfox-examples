package com.github.who.springfoxexample.controller;

import com.github.who.springfoxexample.model.AnotherSampleModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.who.springfoxexample.model.SampleModel;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(value = "/testing")
public class TestingController {

    @RequestMapping(value = "/foo", method = RequestMethod.POST, produces = "application/json")
    public AnotherSampleModel foo(@ApiParam(value = "ComplexRequest") @RequestBody(required = true) SampleModel request) {
        AnotherSampleModel model = new AnotherSampleModel();
        model.setSampleValue(request.getSampleValue());
        return model;
    }
    
    @RequestMapping(value = "/bar", method = RequestMethod.POST, produces = "application/json")
    public AnotherSampleModel bar(@ApiParam(value = "ComplexRequest") @RequestBody(required = true) SampleModel request) {
        AnotherSampleModel model = new AnotherSampleModel();
        model.setSampleValue(request.getSampleValue());
        return model;
    }
}
