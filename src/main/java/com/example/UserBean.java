package com.example;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@Named("user") // or @ManagedBean(name="user")
@SessionScoped

public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String redirect() {
			return "welcome";
	}
}
