package cn.springboot.service;

import cn.springboot.model.AnotherComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 孙珑瑜
 */
@Component
public class MyService {
    @Bean
    @ConfigurationProperties(prefix = "acme")//因为这个注解的启用，可以读取yaml文件中的内容
    public AnotherComponent getAnotherComponent(){
        return new AnotherComponent();
    }
}
