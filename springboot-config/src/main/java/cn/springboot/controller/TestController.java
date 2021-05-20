package cn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello,springboot_config!!!!";
    }
}
