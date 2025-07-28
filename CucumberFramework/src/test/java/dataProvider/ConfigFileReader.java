package dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties; 
	private final String propertyFilePath = "configs/Configuation.properties"; 
	
	public void configReader() throws IOException {
		BufferedReader reader; 
		reader = new BufferedReader(new FileReader(propertyFilePath)); 
		properties = new Properties(); 
		properties.load(reader);
		reader.close();
		
	}
	
	public long getImplicitWait() {
		String implicitWait = properties.getProperty("implicitwait"); 
		if (implicitWait != null ) {
			return Long.parseLong(implicitWait);
		}else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");	
		}
	}
	
	public String getuRL() {
		String url = properties.getProperty("url"); 
		if (url != null ) {
			return url; 
		}else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");	
		}
	}
	

}
