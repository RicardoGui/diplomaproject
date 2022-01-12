package com.DiplomaProject.Test.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
//@ComponentScan({"com.DiplomaProject","com.Test"}) 扫描多个包的写法
@ComponentScan("com.DiplomaProject")
@SpringBootApplication
public class TestApplication {
	private  static final Logger LOG = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {

			SpringApplication app = new SpringApplication(TestApplication.class);
			Environment env = app.run(args).getEnvironment();
			LOG.info("启动成功！！");
			LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
