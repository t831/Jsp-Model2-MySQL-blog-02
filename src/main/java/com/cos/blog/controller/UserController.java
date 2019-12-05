package com.cos.blog.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.cos.blog.model.User;
import com.cos.blog.service.UserService;

@Controller
@RequestMapping("/blog")
public class UserController {

	@Autowired
	private UserService uService;

	@GetMapping("")
	public String home() {
		return "index";
	}

	@GetMapping("/user/loginForm")
	public String userLoginForm() {
		return "loginForm";
	}

	@PostMapping("/user/login")
	public String userLogin(User user, HttpSession session) {
		User u = uService.userLogin(user);
		if (u != null) {
			session.setAttribute("user", u);
			return "redirect:/blog/index";
		} else {
			return null;
		}
	}

	@GetMapping("/user/joinForm")
	public String userJoinForm() {
		return "joinForm";
	}

	@PostMapping("/user/join")
	public String userJoin(User user) {
		int result = uService.userJoin(user);
		if (result == 1) {
			return "redirect:/";
		} else {
			return "redirect:/blog/user/joinForm";
		}
	}

	@GetMapping("/user/logout")
	public String userLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/user/updateForm/{id}")
	public String userUpdateForm(@PathVariable int id, HttpSession session) {
		User user = (User)session.getAttribute("user");
		user.setId(user.getId());
		return "userUpdateForm";
	}
	
	  @Value("${file.path}")
	   private String resourcePath;

	   @PostMapping("/user/update/{id}")
	   public String imageUpload(@PathVariable int id, @RequestParam("userProfile") MultipartFile file) {
	      UUID uuid = UUID.randomUUID();
	      String uuidFileName = uuid + "_" + file.getOriginalFilename();
	      Path filePath = Paths.get(resourcePath + uuidFileName);
	      try {
	         Files.write(filePath, file.getBytes());
	         uService.update(id, "/resources/images/user/"+uuidFileName);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      return "redirect:/blog/index";

	   }
}
