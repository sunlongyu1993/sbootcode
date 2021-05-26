package cn.springboot;

import cn.springboot.config.MongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 孙珑瑜
 * @version 20210427
 * springboot 的启动类
 */
@SpringBootApplication
public class YamlSpringApplication implements ApplicationRunner {

    @Autowired
    private MongoConfig mongoConfig;

    @Autowired
    private MongoConfig.MongoDbPool mongoDbPool;

    @Autowired
    @Qualifier("mongoDBPoll1")
    private MongoConfig.MongoDbPool mongoDbPool1;


    public static void main(String[] args) {
        SpringApplication.run(YamlSpringApplication.class,args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MongoConfig tmc = new MongoConfig();
        System.out.println(tmc);
        System.out.println(mongoConfig);
        System.out.println(mongoDbPool.name);
        System.out.println(mongoDbPool1.name);
    }
}
