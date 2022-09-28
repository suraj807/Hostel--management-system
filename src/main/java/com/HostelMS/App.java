package com.HostelMS;
import org.apache.log4j.Logger;

import java.util.Scanner;

import com.HostelMS.exception.GlobalException;
import com.HostelMS.serviceImpl.LoginRegisterImpl;


public class App 
{
	static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args ) throws GlobalException
    {
    		// Creating Scanner Object
         	Scanner scan=new Scanner(System.in);
        	log.info("Hostel Management System");
        	LoginRegisterImpl loginReg=new LoginRegisterImpl();
        	log.info("\nPress 1 - Register New Profile \nPress 2 - Profile Login \nEnter Your Choice : ");
        	int choice =scan.nextInt();
        	
        	switch(choice) {
        	
        	// First Case
        	// TO Register New Profile
        	case 1->loginReg.Register();
        	
        	// Second Case
        	// TO Login to Existing Profile
        	case 2->loginReg.Login();
        	}
        	
        	scan.close();
    }
}
