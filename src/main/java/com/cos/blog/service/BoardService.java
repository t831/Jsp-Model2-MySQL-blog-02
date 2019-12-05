package com.cos.blog.service;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.blog.model.Board;
import com.cos.blog.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository bRepo;

	public List<Board> BoardList() {
			List<Board> boards = bRepo.findAll();
		return boards;
	}
	
	public List<Board> Three() {
		List<Board> boards = bRepo.findThree();
		return boards;
	}

	public int update(Board board) {
		try {
			bRepo.update(board);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public Board updateForm(int id) {
		Board board = bRepo.findById(id);
		return board;
	}

	public int delete(int id) {
		try {
			bRepo.delete(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int save(Board board) {
		try {
			bRepo.save(board);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public Board board(int id) {
		try{
			Board board = bRepo.findById(id);
			return board;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
