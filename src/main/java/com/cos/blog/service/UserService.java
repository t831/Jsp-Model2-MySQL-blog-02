package com.cos.blog.service;
import java.util.List;   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	public User userLogin(User user) {
		User u = uRepo.findByEmailAndPassword(user.getUsername(), user.getPassword());
		return u;
	}
	
	public int userJoin(User user) {
		try {
			uRepo.userJoin(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update(int id , String userProfile) {
		try {
			uRepo.userUpdate(id , userProfile);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
