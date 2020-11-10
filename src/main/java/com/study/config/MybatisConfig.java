package com.study.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(
//		annotationClass=Mapper.class,
        basePackages="com.study.dao",
        sqlSessionFactoryRef="sqlSessionFactoryBean")
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(
            DataSource dataSource, ApplicationContext context
    ) throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(context.getResource("classpath:mybatis/configuration.xml"));
        factoryBean.setMapperLocations(context.getResources("classpath*:mybatis/mappers/**/*.xml"));
        factoryBean.setTypeAliasesPackage("com.lge.apip.mgmt.ocpo.policy.model");
        return factoryBean;
    }

    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
