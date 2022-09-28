package com.HostelMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Getter
//@Setter
//@ToString
public class User {

	@Id
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String userContact;
	private String userPassword;
	private String userAddress;
	private String userRole;
	private int userFee;
	
	@ManyToOne
	private Room userRoom;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getUserFee() {
		return userFee;
	}

	public void setUserFee(int userFee) {
		this.userFee = userFee;
	}

	public Room getUserRoom() {
		return userRoom;
	}

	public void setUserRoom(Room userRoom) {
		this.userRoom = userRoom;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userContact=" + userContact + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + ", userRole=" + userRole + ", userFee=" + userFee + ", userRoom=" + userRoom + "]";
	}
	
	
	
	
}
