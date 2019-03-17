package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream str = new FileInputStream(src);
			pro = new Properties();
			pro.load(str);
		} catch (Exception e) {
			System.out.println("Not loaded Properly");
		}
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getAppURL() {
		return pro.getProperty("qaURL");
	}

}
