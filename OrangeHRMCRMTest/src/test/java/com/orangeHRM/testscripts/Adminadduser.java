package com.orangeHRM.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRM.generics.Baseclass;
import com.orangeHRM.generics.Listenerimplementation;
import com.orangeHRM.objectreposirtory.Addusers;
import com.orangeHRM.objectreposirtory.Admin;
import com.orangeHRM.objectreposirtory.Logout;
import com.orangeHRM.objectreposirtory.Systemusers;

@Listeners(com.orangeHRM.generics.Listenerimplementation.class)
public class Adminadduser extends Baseclass {

	@Test
	public void adminm() throws InterruptedException, IOException
	{
		Admin a = new Admin(driver);
		Thread.sleep(3000);
		a.clickAdmin();
		Thread.sleep(3000);
		a.clickUm();
	    a.clickU(); 
		Systemusers s = new Systemusers(driver);
		s.clickAdd();
		Addusers a1 = new Addusers(driver);
		a1.setEname("VISHRUTH");
		a1.setUname("VISHRUTH");
		a1.setPwd("VISHU@5697");
		a1.setCpwd("VISHU@5697");
		a1.clickSave();
		
	
		
		
		
	
	}
	
	
	
}
