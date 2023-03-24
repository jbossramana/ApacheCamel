package demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ServiceBean {

	List<User> users = new ArrayList<User>();
	
    public User addUser(User user) {
        user.setName(user.getName().toUpperCase());
        users.add(user);
        return user;
    }
    
    
    public ServiceBean()
    {
    	User user = new User();
    	user.setName("Test user");
    	users.add(user);
    	
    }

    public ArrayList<User> getUser()
    {
    	return (ArrayList<User>) users;
    }
}