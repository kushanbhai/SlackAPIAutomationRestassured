package com.qa.Slack.tests;

public class Channeldetails {
	String name;
	String validate;
	
	public Channeldetails(){
		
	}
	public Channeldetails(String name, String validate) {
		
		this.name = name;
		this.validate = validate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValidate() {
		return validate;
	}
	public void setValidate(String validate) {
		this.validate = validate;
	}
	
}
