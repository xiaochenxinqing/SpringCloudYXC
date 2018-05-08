package com.yxc.springcloud.configserver.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 激活该应用为配置文件服务器(分布式配置中心)：读取远程配置文件，转换为rest接口服务
public class CloudGitConfigServerApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=gitsimple";//设置读取应用配置的文件名
		SpringApplication.run(CloudGitConfigServerApplication.class, args);
	}
}