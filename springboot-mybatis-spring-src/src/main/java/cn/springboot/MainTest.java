package cn.springboot;

import cn.springboot.config.MybatisSpringConfig;
import cn.springboot.mapper.PersonMapper;
import cn.springboot.module.Person;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author 孙珑瑜
 * springboot 的启动类
 */

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MybatisSpringConfig.class);
        PersonMapper personMapper = (PersonMapper) ctx.getBean(PersonMapper.class);

        Person person = personMapper.selectById(1);
        System.out.println(person);
    }
}
