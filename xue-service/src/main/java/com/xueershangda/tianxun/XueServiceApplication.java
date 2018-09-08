package com.xueershangda.tianxun;

import com.vteba.tx.dao.spi.BasicDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:application-dubbo-provider.xml")
@MapperScan(value = "com.xueershangda", markerInterface = BasicDao.class)
@SpringBootApplication(scanBasePackages = "com.xueershangda")
public class XueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XueServiceApplication.class, args);
	}
}
