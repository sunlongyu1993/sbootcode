package cn.springboot.controller;

import cn.springboot.model.YamlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙珑瑜
 * @version 20210427
 *
 */
@RestController
public class YamlController {
    @Autowired
    private YamlModel yamlModel;

    @RequestMapping("yaml")
    public YamlModel yaml(){
        System.out.println(yamlModel);
        return yamlModel;
    }
}
