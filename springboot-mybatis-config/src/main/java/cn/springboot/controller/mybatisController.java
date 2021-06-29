package cn.springboot.controller;

import cn.springboot.mapper.PersonMapper;
import cn.springboot.module.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author 孙珑瑜
 *
 */
@RestController
public class mybatisController {
    @Autowired //注入
    private PersonMapper personMapper;

    //查询单条信息
    @RequestMapping("selectByid")
    public Person dataSourceTest(){
        return personMapper.selectById(1);
    }
    //查询所有数据
    @RequestMapping("selectAll")
    public List<Person> selectAll(){
        return personMapper.personAll();
    }

    //插入数据
    @RequestMapping("insert")
    public  String insert(Person person){
        personMapper.insertnum(person);
        return "success";
    }

    //插入数据
    @RequestMapping("delete")
    public  String delete(){
        personMapper.delete(3);
        return "success";
    }
}
