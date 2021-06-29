package cn.springboot.mapper;

import cn.springboot.module.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 孙珑瑜
 * 通过MapperScan 的方式扫描到mybatis 提供的dao 层的map的接口
 */
public interface PersonMapper {
    //接口查询
     public Person selectById(int pid);

    //接口查询所有数据
    public List<Person> personAll();

    //接口插入数据
    public void insertnum(Person person);

    public void delete(int pid);
}
