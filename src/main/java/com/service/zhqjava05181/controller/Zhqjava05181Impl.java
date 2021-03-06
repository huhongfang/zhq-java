package com.service.zhqjava05181.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-18T09:22:22.642Z")

@RestSchema(schemaId = "zhqjava05181")
@RequestMapping(path = "/zhqjava05181", produces = MediaType.APPLICATION_JSON)
public class Zhqjava05181Impl {

    @Autowired
    private Zhqjava05181Delegate userZhqjava05181Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userZhqjava05181Delegate.helloworld(name);
    }

}
