package com.HostelMS.serviceImpl;

import java.util.Scanner;

import com.HostelMS.dao.UserDao;
import com.HostelMS.daoImpl.UserDaoImpl;
import com.HostelMS.exception.GlobalException;
import com.HostelMS.model.User;
import com.HostelMS.service.userDashboard;

import org.apache.log4j.Logger;

public class userDashboardImpl implements userDashboard{

	static Logger log=Logger.getLogger(userDashboardImpl.class);
	
	// CREATING SCANNER OBJECT
	static Scanner scan=new Scanner(System.in);
	
	// CREATING USER DASHBOARD IMPL OBJECT
	static userDashboardImpl udimpl=new userDashboardImpl();
	
	// CREATING USER DAO OBJECT
	static UserDao udao = new UserDaoImpl();
	static int userId;
	
	@Override
	// METHOD 1
	// METHOD TO IMPLEMENT DASHBOARD
	// GIVE USER CHOICE TO PERFORM DIFFERENT ACTION
	public void dashboard(int uId) throws GlobalException {
		// TODO Auto-generated method stub
		log.info("\n\nUSER DASHBOARD\n");
		int choice=0;
		userId=uId;
		
		// CREATING LOOP
		while(choice<6) {
			
			// USER CAN PERFORM THESE ACTIONS
			log.info("\nPress 1 - View Your Room\nPress 2 - Due Amount \nPress 3 - View  Your Profile\nPress 4 - Change Contact Number \nPress 5 - Change password \nPress 6 - Exit");
			
			choice=scan.nextInt();
			
			switch(choice) {
		
				case 1->udimpl.viewRoom();
				
				case 2->udimpl.viewDueAmount();
				
				case 3->udimpl.viewProfile();
				
				case 4->udimpl.changeContactnumber();
				
				case 5->udimpl.changePassword();
			}
		}
		
	}

	
	// METHOD 2
	// TO SHOW ROOM DETAILS OF USER
	@Override
	public void viewRoom() {
		// TODO Auto-generated method stub
		User u= udao.userRoom(userId);// FETCHING USER ROOM DETAILS
		log.info("Hello "+u.getUserName()+"\nRoom number : "+u.getUserRoom().getRoomId()+"\nRoom Name : "+u.getUserRoom().getRoomName()+"\nRoom Type : "+u.getUserRoom().getRoomType());
	}

	// METHOD 3
	// TO SHOW DUE AMOUNT OF USER
	@Override
	public void viewDueAmount() {
		// TODO Auto-generated method stub
		int amount= udao.userDueAmount(userId);// FETCH DUE AMOUNT DETAILS
		log.info("Fees Due : "+amount);
	}

	// METHOD 4
	// FETCH AND SHOW PROFILE DETIALS TO USER
	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		User u= udao.userProfile(userId);// FETCHING USER DETAILS
		log.info(u);
	}

	@Override
	// METHOD 5
	// TO CHANGE CONTACT NUMBER
	public void changeContactnumber() {
		// TODO Auto-generated method stub
		log.info("Enter New Contact number");
		String contact = scan.next();
		int res=udao.changeContact(userId, contact);// UPDATING CONTACT NUMBER
		if(res==1) {
			log.info("Phone number updated");
		}
	}

	@Override
	// METHOD 6
	// TO CHANGE PASSWORD
	public void changePassword() throws GlobalException {
		// TODO Auto-generated method stub
		log.info("Enter Current Password");
		String oldpswrd = scan.next();
		log.info("Enter New Password");
		String newpswd = scan.next();
		int res = udao.changePassWord(userId, oldpswrd, newpswd);// CHANGING ACCOUNT PASSWORD
		if(res==1) {
			log.info("password changed");
		}
	}

	
}
