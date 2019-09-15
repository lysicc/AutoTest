package com.Course.testng.MultThread;

import org.testng.annotations.Test;

public class MultTheadTest {
    @Test
    public  void  test1(){
        System.out.println("这是test1："+Thread.currentThread().getId());
    }
    @Test
    public  void  test2(){
        System.out.println("这是test2："+Thread.currentThread().getId());
    }
    @Test
    public  void  test3(){
        System.out.println("这是test3："+Thread.currentThread().getId());
    }
}
