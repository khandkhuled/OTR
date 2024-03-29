package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1_HomePageNavigation extends BaseClass {
	
	@Test
	public void verify_HomePageNavigation () {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	
		Library.custom_click(login.get_Helpline());
		Library.custom_sendkeys(login.getTxt_email(),excel.getStringDataFrom_Excel("Login_Page", 1, 0),"Email ID");
		Library.custom_sendkeys(login.getTxt_password(), excel.getStringDataFrom_Excel("Login_Page", 1, 1),"Password");
		//Library.custom_click(login.getBtn_login(),"Login Button");
		
		//Verify
		 String title=driver.getTitle();  // Actual Title
		 System.out.println(title);
		 String Expected_title="Helpline";
		 
		 SoftAssert softAssert = new SoftAssert();
		 
		 softAssert.assertEquals(title, Expected_title);
		 
		 
//		Call assertAll() at the end to mark the test as failed if any soft assert fails
		 softAssert.assertAll();
		//Verify
/*		String title=driver.getTitle();  // Actual Title
		String Etitle="Facebook";  
		
		Assert.assertEquals(title, Etitle);          */
	}

}
