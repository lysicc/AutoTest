package com.Course.testng.TimeOutT;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 2000) //假如报错了，不等了，给他跑过去
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("验证超时失败测试");
    }
    @Test(timeOut = 4000) //单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("验证超时成功测试");
    }
}
