package com.oops.projects;

public class Players {

	String name;
	int position;

	public Players(String username) {
		this.name = username;
	}

	public void setName(String username) {
		this.name = username;
	}

	public String getName() {
		return name;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

}
