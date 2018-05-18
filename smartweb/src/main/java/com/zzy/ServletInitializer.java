package com.zzy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
/**
 * @author zeus
 * @date 2016年6月11日
 * @version 1.0
 * @description: Tomcat初始化时调用自定义类 spring boot要用tomcat启动tomcat启动会调用一个webinit类 继承该类就能实现tomcat启动调用
 */
public class ServletInitializer extends SpringBootServletInitializer {  
    @Override    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        return builder.sources(Main.class);      
    }    
 
}  
