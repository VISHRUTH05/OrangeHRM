package com.orangeHRM.generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Listenerimplementation extends Baseclass implements ITestListener
{

	

	@Override
	public void onTestSuccess(ITestResult result) {
		result.getName();
		TakesScreenshot t =(TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+result+".png");
		try{
			Files.copy(source, dest);
		}catch(IOException e){
		}
		
		
	}

	

	

	
	
}
