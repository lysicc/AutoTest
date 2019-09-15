package com.Course.testng;

import org.testng.annotations.*;

public class BasicAnootation {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类开始运行之前执行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类开始运行之前执行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite这是测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite这是测试套件");
    }



}
