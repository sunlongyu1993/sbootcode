package cn.springboot.module;

import lombok.Data;

import java.util.Date;

/**
 * @author 孙珑瑜
 * 映射数据库中的字段
 */
@Data
public class Person {
    private int pid;
    private String pname;
    private String addr;
    private int gender;
    private Date birth;
}
