package cn.springboot.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author 孙珑瑜
 */
@Data
@Component
public class ValueProperties {
    @Value("${acme.my-person.person.first-name}")
    private String firstName;

    @Value("#{12*4}")
    private int age;

    @Value("${acme.my-person.person.email}")
    private String email;

    @Value("${acme.favor}")
    private String favor;
}
