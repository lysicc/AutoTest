package com.Course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void test1(String name,int age){
        System.out.println("name ="+name+"; age ="+age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProviderTest(){
        Object[][] o = new Object[][]{
            {"zhangsan",18},
            {"lisi",20}
        };
        return  o;
    }
    @Test(dataProvider = "metaData")
    public void test2(String name,int age){
        System.out.println("test2   :"+name+";age:"+age);
    }
    @Test(dataProvider = "metaData")
    public void test3(String name,int age){
        System.out.println("test2   :"+name+";age:"+age);
    }

    @DataProvider(name = "metaData")
    public Object[][] dataprovider(Method method){  //这里注意。要传method进来
         Object[][] result =null;
         if (method.getName().equals("test2")){
             result = new Object[][]{
                     {"laochao",10},
                     {"laocong",15}
             };
         }else if (method.getName().equals("test3")){
             result =new Object[][]{
                     {"laoming",20},
                     {"laodong",30}
             };
         }
             return  result;
    }






}
