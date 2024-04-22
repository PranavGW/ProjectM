package TestCases;

import AppUtils.lunchApp;
import Liabrary.login;

public class loginWithValidData {

	public static void main(String[] args)
	{
		

		lunchApp.Lunch("https://www.naukri.com/");
		login.Login("gawande.pranav606@gmail.com", "Sangita@123");
		
		login lg = new login();
		
		boolean Pg = lg.isNameDisplay();
		
		if(Pg)
		{
			System.out.println("Test Case Pass");
		}
		
		else {
			
			System.out.println("Test Case Failed");
		}
		
		
		lunchApp.closeApp();
		
		
	}

}
