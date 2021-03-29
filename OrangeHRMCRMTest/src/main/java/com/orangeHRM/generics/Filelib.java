package com.orangeHRM.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Filelib {


	public String getPropertyvalue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
	
		String value = p.getProperty(key);
		return value;
	}

	
	

}
