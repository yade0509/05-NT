package com.bjpowernode.mulitdatasources;

import com.bjpowernode.mulitdatasources.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * @auto admin
 * @data 2019/3/25 17:11
 */
public class Test {

    public static void main(String[] args) {

        // 创建sprign容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);

        System.out.println("这是3307-->>" + userServiceImpl.queryUserById3307(1).getName());
        System.out.println("这是3308-->>" + userServiceImpl.queryUserById3308(1).getName());
        System.out.println("这是3309-->>" + userServiceImpl.queryUserById3309(1).getName());
        System.out.println("这是3310-->>" + userServiceImpl.queryUserById3310(1).getName());
    }

}
