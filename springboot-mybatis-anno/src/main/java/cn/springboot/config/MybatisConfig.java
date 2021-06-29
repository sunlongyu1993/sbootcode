package cn.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙珑瑜
 *
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer getCustomizer(){
        return new ConfigurationCustomizer() {//采用匿名内部类的方式
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
