package com.xueershangda.xueservice;

import com.vteba.tx.dao.spi.BasicDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.xueershangda", markerInterface = BasicDao.class)
@SpringBootApplication
public class XueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XueServiceApplication.class, args);
	}
}
