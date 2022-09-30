package com.HostelMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
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

	
	
	
	
	
}
