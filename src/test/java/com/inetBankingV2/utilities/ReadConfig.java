package com.inetBankingV2.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src=new File("./Configuration/config.properties");
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public String getApplicationUrl() {
		String url=pro.getProperty("baseUrl");
		return url;
	}

	public String getUsername() {
		String username=pro.getProperty("userName");
		return username;
	}
	public String getPassword() {
		String password=pro.getProperty("passWord");
		return password;
	}
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getiePath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}



}
