package dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties; 
	private final String propertyFilePath = "configs/Configuation.properties"; 
	
//	public void configReader() throws IOException {
//		BufferedReader reader; 
//		reader = new BufferedReader(new FileReader(propertyFilePath)); 
//		properties = new Properties(); 
//		properties.load(reader);
//		reader.close();
//		
//	}
	
	public ConfigFileReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Configuration.properties file not found at " + propertyFilePath);
        }
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
	
	public DriverType getBrowser() {
		String browsername = properties.getProperty("browser"); 
		if(browsername == null ||browsername.equals("chrome")) return DriverType.CHROME; 
		else if (browsername.equalsIgnoreCase("firefox")) return DriverType.FIREFOX; 
		else if (browsername.equalsIgnoreCase("internetexplorer")) return DriverType.INTERNETEXPLORER; 
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browsername); 
		
	}
	
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	

}
