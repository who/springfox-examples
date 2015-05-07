package com.github.who.springfoxexample.controller;

import com.github.who.springfoxexample.model.AnotherSampleModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.who.springfoxexample.model.SampleModel;
import com.wordnik.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(value = "/testing")
public class TestingController {

    @RequestMapping(value = "/withDefaultResponses", method = RequestMethod.POST, produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = AnotherSampleModel.class)
    public Object withDefaultResponses(@RequestBody(required = true) SampleModel request) {
        AnotherSampleModel model = new AnotherSampleModel();
        model.setSampleValue(request.getSampleValue());
        return model;
    }
    
    @RequestMapping(value = "/withoutDefaultResponses", method = RequestMethod.POST, produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = AnotherSampleModel.class)
    public Object withoutDefaultResponses(@RequestBody(required = true) SampleModel request) {
        AnotherSampleModel model = new AnotherSampleModel();
        model.setSampleValue(request.getSampleValue());
        return model;
    }
}
