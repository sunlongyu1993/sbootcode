package cn.springboot.controller;

import cn.springboot.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
//@Configuration
@RestController
public class NewController {

    @Bean//做一个bean的定义
    public Dep getDepdep(){
        return new Dep();
    }


    @Autowired//注入bean的内容
    private Dep dep;


    @GetMapping("dep")
    public String test(){
        System.out.println(dep);//检查是否注入成功，如果打印出来，就注入成功，Bean定义成功
        return "dep";
    }
}
