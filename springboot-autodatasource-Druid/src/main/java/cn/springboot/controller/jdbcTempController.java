package cn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 孙珑瑜
 */
@RestController
public class jdbcTempController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("query")
    public List<Map<String, Object>> query(){
        List<Map<String, Object>> listmap = jdbcTemplate.queryForList("select * from tx_user");
        return listmap;
    }
}
