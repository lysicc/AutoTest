package com.testng.extend;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentReportTest {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals("qq","qq");
    }
    @Test
    public void test3(){
        Assert.assertEquals("qq","22");
    }
    @Test
    public void test4(){
        Reporter.log("这是我的日志信息");
        throw  new  RuntimeException("这是我的报错信息");
    }
}
