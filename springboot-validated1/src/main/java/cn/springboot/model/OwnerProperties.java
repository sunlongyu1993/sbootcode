package cn.springboot.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;

/**
 * @author 孙珑瑜
 */
@Data
@ConfigurationProperties(prefix = "acme.my-person.person")
//将属性和yaml配置文件中内容绑定
@Component //加入到ioc容器中
@Validated//属性校验注解
public class OwnerProperties {
//    @NonNull
    private String firstName;

    @Max(35)
    private int age;

//    @Email
    private String email;

    @Valid
    private School school=new School();

    @Data//内部类
    class School{
        public School() {
        }
        @NonNull
        private String sname;
    }

}
