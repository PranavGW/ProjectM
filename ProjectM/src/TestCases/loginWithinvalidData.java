package TestCases;

import AppUtils.lunchApp;
import Liabrary.login;

public class loginWithinvalidData {

	public static void main(String[] args)
	{


		lunchApp.Lunch("https://www.naukri.com/");
		
		login.Login("suja@gmail.com", "Sangita@123");
		 
		login lg = new login();
		
	boolean Mg =lg.isErrorMsgDisplyed();
		
		if(Mg)
		{
			
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
		lunchApp.closeApp();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
