package cn.item.springBoot.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@MapperScan("cn.item.springBoot.data.dao")
public class DataConfiguration {


}
