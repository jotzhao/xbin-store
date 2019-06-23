package cn.binux;

import com.alibaba.dubbo.container.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration

@SpringBootApplication
public class XbinStoreServiceRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServiceRedisApplication.class, args);

		Main.main(args);
	}
}
