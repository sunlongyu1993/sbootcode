package cn.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author 孙珑瑜
 */
@Configuration
public class MongoConfig {

    /**
     * Spring可以理解为Bean容器
     * Spring的Bean都有一个Order标记
     * 理解了Bean跟Component，Component是注解到类，自动实例化，Bean手动实例化
     * Bean的冲突解决->定义一个主Bean Primary
     * Spring Boot的runner
     * Spring Bean容器默认是单例的
     */

    @Value("${mogno.pool-size}")
    private int poolSize;

    @Autowired
    private TimerConfig timerConfig;

    @Bean(name = "mongoDBPoll")
    @Primary
    public MongoDbPool createPool(){
        return new MongoDbPool("a");
    }

    @Bean(name = "mongoDBPoll1")
    public MongoDbPool createPool1(){
        return new MongoDbPool("b");
    }


    public static class MongoDbPool{
        public MongoDbPool(String n){
            this.name = n;
        }
        public String name;
        public int getPoolConnectionSize(){
            return 0;
        }
    }

}
