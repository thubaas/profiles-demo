package dev.thubaas.profilesdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.thubaas.profilesdemo.conf.DataSourceConf;

@SpringBootTest
class ProfilesDemoApplicationTests {
	
	@Autowired
	DataSourceConf dataSourceConf;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void setupDataSource() {
		dataSourceConf.setup();
	}
	

}
