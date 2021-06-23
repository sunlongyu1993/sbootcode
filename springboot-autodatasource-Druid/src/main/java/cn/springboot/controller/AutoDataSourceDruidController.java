package cn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author 孙珑瑜
 */
@RestController
public class AutoDataSourceDruidController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("dataSourceDruidTest")
    public String dataSourceDruidTest(){
        System.out.println(dataSource);
        return "dataSourceDruidTest";
    }
}
