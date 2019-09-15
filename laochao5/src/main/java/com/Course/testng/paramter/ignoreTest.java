package com.Course.testng.paramter;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test(enabled = true)
    public void test1(){
        System.out.println("忽略测试");
    }

    @Test(enabled = false) //enable已经忽略该测试用例
    public void test2(){
        System.out.println("不忽略测试");
    }
}
