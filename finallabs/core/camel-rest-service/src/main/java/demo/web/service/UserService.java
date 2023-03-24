package demo.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import demo.web.model.User;

@Component("userService")
public class UserService {

	List<User>  users;
	
	public UserService()
	{
		users = new ArrayList<User>();
	}
	
	public User addUser(User user)
	{
		users.add(user);
		return user;
	}
	
	public List<User> getUsers()
	{
		return users;
	}
}
