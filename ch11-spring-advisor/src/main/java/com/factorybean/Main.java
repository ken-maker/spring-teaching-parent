package com.factorybean;

import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cj
 * @date 2019/10/28
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factoryBean.xml");
        EmployeeService employeeService = context.getBean("empFactory", EmployeeService.class);
        int result = employeeService.add(5, 6);
        System.out.println(result);

    }
}
