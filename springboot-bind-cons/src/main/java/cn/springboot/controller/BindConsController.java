package cn.springboot.controller;

import cn.springboot.model.AcmeProperties;
import cn.springboot.model.AnotherComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
@RestController
//@Component
@EnableConfigurationProperties(AcmeProperties.class)
public class BindConsController {
//    @Autowired
    private AnotherComponent anotherComponent;

    public BindConsController(AnotherComponent anotherComponent) {
        this.anotherComponent = anotherComponent;
    }

    @RequestMapping("another")
    public String another(){
        System.out.println(anotherComponent);
        return "anotherclass";
    }
}
