package com.blogging.query.dto;

public class SearchDto {

	private String uid;
	private String role;
	private boolean superUser;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isSuperUser() {
		return superUser;
	}
	public void setSuperUser(boolean superUser) {
		this.superUser = superUser;
	}
	
	public SearchDto() {
		super();
	}
	
	public SearchDto(String uid, String role, boolean superUser) {
		super();
		this.uid = uid;
		this.role = role;
		this.superUser = superUser;
	}
}
