package com.nus.cs5248.team2.videoServer.videoServer.controller;

import com.nus.cs5248.team2.videoServer.videoServer.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestModel testModel;

    @RequestMapping(path = "/testData", method = RequestMethod.GET)
    public TestModel getTestData(){
        testModel.setName("xiao ming");
        testModel.setAge(23);
        return testModel;
    }
}
