package com.zuoqiang.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println("dubbo服务启动！");
        System.in.read(); //  为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
