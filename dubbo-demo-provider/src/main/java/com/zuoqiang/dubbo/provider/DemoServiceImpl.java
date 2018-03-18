package com.zuoqiang.dubbo.provider;

import com.zuoqiang.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("输出的名字为：" + name);
        return name;
    }
}
