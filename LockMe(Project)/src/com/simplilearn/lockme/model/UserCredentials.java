package com.simplilearn.lockme.model;

public class UserCredentials {
	
	private String siteName;
	private String  loggedInUser;
	private String username;
	private String password;
	
	public UserCredentials() {}

	public UserCredentials(String siteName, String loggedInUser, String username, String password) {
		this.siteName = siteName;
		this.loggedInUser = loggedInUser;
		this.username = username;
		this.password = password;
		
	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	/* public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}  */

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentials [siteName=" + siteName + ", loggedInUser=" + loggedInUser + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", username=" + username + ", password=" + password + "]";
	}


	}

}
