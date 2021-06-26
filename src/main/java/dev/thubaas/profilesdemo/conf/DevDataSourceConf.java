package dev.thubaas.profilesdemo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSourceConf  implements DataSourceConf{
	
	@Autowired
	private final DatabaseConf databaseConf;
	
	public DevDataSourceConf(DatabaseConf databaseConf) {
		this.databaseConf = databaseConf;
	}

	@Override
	public void setup() {
		System.out.println("Setting up data souce for Dev Environment");
		System.out.println("Database Configuration");
		System.out.println(
				"[" + databaseConf.getUrl() 
				+ " | " 
				+ databaseConf.getUsername() 
				+ " | " 
				+ databaseConf.getPassword() + "]");
		
		
	}

}
