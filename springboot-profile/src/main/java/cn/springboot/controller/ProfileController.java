package cn.springboot.controller;

import cn.springboot.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
@RestController
public class ProfileController {
    @Autowired
    private AcmeProperties acmeProperties;

    @GetMapping("profiletest")
    public AcmeProperties test(){
        return acmeProperties;
    }
}
