package com.cos.blog.repository;

import java.util.List;  
import com.cos.blog.model.Board;

public interface BoardRepository {
	List<Board> findAll(); // 전체보기
	List<Board> findThree(); // 3개 보기
	Board findById(int id); // 상세보기
	void save(Board board); // 게시글 작성
	void update (Board board); // 게시글 업데이트
	void delete (int id); // 삭제하기
}
