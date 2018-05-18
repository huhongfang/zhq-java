package com.service.zhqjava05181.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestZhqjava05181 {

        Zhqjava05181Delegate zhqjava05181Delegate = new Zhqjava05181Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = zhqjava05181Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}