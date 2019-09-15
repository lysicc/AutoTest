package com.Course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"name","age"}) //注意这里的写法
    public void pramterTest(String name,int age){
        System.out.println("name ="+name+"; age ="+age);
    }

}
