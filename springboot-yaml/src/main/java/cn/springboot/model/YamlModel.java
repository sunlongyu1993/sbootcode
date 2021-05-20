package cn.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author 孙珑瑜
 * @version 20210519
 */
@Component
@ConfigurationProperties(prefix = "yaml")
public class YamlModel {
    private String str;
    private int num;
    private double Dnum;
    private Date birth;
    private String specialStr;
    private List<String> list = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();
    private Map<String,String> map = new HashMap<>();
    private List<User> user = new ArrayList<>();

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getSpecialStr() {
        return specialStr;
    }

    public void setSpecialStr(String specialStr) {
        this.specialStr = specialStr;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getDnum() {
        return Dnum;
    }

    public void setDnum(double dnum) {
        Dnum = dnum;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "YamlModel{" +
                "str='" + str + '\'' +
                ", num=" + num +
                ", Dnum=" + Dnum +
                ", birth=" + birth +
                ", specialStr='" + specialStr + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", user=" + user +
                '}';
    }
}
