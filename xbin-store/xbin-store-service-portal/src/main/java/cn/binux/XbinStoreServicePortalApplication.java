package cn.binux;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.binux.mapper")
public class XbinStoreServicePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServicePortalApplication.class, args);

	}
}
