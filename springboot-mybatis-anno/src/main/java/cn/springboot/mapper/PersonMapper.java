package cn.springboot.mapper;

import cn.springboot.module.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 孙珑瑜
 * 通过MapperScan 的方式扫描到mybatis 提供的dao 层的map的接口
 */
//方法一在PersonMapper这个类上添加@Mapper这个注解
//@Mapper //添加这个注解，可以被MapperScan扫描到
//public interface PersonMapper {
//    //接口查询
//    @Select("SELECT * FROM person where pid =#{pid}")
//    public Person selectById(int pid);
//
//    //接口查询所有数据
//    @Select("SELECT * FROM person")
//    public List<Person> personAll();
//
//    //接口插入数据
//    @Options(useGeneratedKeys =true,keyProperty ="pid")
//    @Insert("INSERT INTO person(pid,pname,addr,gender,birth) VALUES (#{pid},#{pname},#{addr},#{gender},#{birth})")
//    public void insertnum(Person person);
//
//    @Delete("delete  FROM person where pid =#{pid}")
//    public void delete(int pid);
//}
//方法二：在PersonMapper这个类上不添加@Mapper这个注解
public interface PersonMapper {
    //接口查询
    @Select("SELECT * FROM person where pid =#{pid}")
    public Person selectById(int pid);

    //接口查询所有数据
    @Select("SELECT * FROM person")
    public List<Person> personAll();

    //接口插入数据
    @Options(useGeneratedKeys =true,keyProperty ="pid")
    @Insert("INSERT INTO person(pid,pname,addr,gender,birth) VALUES (#{pid},#{pname},#{addr},#{gender},#{birth})")
    public void insertnum(Person person);

    @Delete("delete  FROM person where pid =#{pid}")
    public void delete(int pid);
}
