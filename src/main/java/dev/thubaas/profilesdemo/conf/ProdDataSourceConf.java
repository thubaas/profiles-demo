package dev.thubaas.profilesdemo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDataSourceConf implements DataSourceConf {
	
	@Autowired
	private final DatabaseConf databaseConf;
	
	public ProdDataSourceConf(DatabaseConf databaseConf) {
		this.databaseConf = databaseConf;
	}

	@Override
	public void setup() {
		System.out.println("Setting up data source for Prod Environment");
		System.out.println("Database Configuration");
		System.out.println(
				"[" + databaseConf.getUrl() 
				+ " | " 
				+ databaseConf.getUsername() 
				+ " | " 
				+ databaseConf.getPassword() + "]");
	}

}
