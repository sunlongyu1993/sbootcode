package cn.springboot.controller;

import cn.springboot.model.OwnerProperties;
import cn.springboot.model.ValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
@RestController
//@EnableConfigurationProperties(OwnerProperties.class)
public class ValidatedController {


    @Autowired
    private OwnerProperties ownerProperties;


    @RequestMapping("owner")
    public String owner(){
        System.out.println(ownerProperties);
        return "owner";
    }
    @Autowired
    private ValueProperties valueProperties;

    @RequestMapping("valuetest")
    public String ValueTest(){
        System.out.println(valueProperties);
        return "valueProperties";
    }
}
