package cn.springboot.config;

import cn.springboot.mapper.PersonMapper;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙珑瑜
 * 数据源的配置类
 */
@Configuration
@MapperScan("cn.springboot.mapper")
public class MybatisSpringConfig1 {

    @Bean //数据源
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        return druidDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }


//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
//        sqlSessionTemplate.getConfiguration().addMapper(PersonMapper.class);//将PersonMapper添加
//        return sqlSessionTemplate;
//    }
//
//    @Bean
//    public PersonMapper personMapper() throws Exception {
//        return sqlSessionTemplate().getMapper(PersonMapper.class);
//    }

}
