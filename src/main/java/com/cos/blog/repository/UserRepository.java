package com.cos.blog.repository;
import com.cos.blog.model.User;

public interface UserRepository {
	User findByEmailAndPassword(String username, String password); // 로그인
	void userJoin(User user); // 회원가입
	void userUpdate(int id , String userProfile); // 회원 업데이트
}
