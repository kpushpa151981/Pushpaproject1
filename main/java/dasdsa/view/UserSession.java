package dasdsa.view;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import dasdsa.model.User;


/**
 * This represents the users session and stores their {@link User} instance if
 * they are logged in. It includes help methods to return a flag for if they are
 * logged in or not.
 * 
 * @author Andy Gibson
 * 
 */
@Named("userSession")
@SessionScoped
public class UserSession implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;

	public void logout() {
		user = null;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isLoggedIn() {
		return user != null;
	}

	public User getUser() {
		return user;
	}
}
