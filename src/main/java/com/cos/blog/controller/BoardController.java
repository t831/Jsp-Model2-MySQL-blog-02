package com.cos.blog.controller;

import java.util.List; 

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cos.blog.model.Board;
import com.cos.blog.model.User;
import com.cos.blog.service.BoardService;

@Controller
@RequestMapping("/blog")
public class BoardController {

	@Autowired
	private BoardService bService;

	@GetMapping("/index")
	public String index(Model model) {
		List<Board> boards = bService.Three();
		model.addAttribute("boards", boards);
		return "index";
	}

	@GetMapping("/list")
	public String board(Model model) {
		List<Board> boards = bService.BoardList();
		model.addAttribute("boards", boards);
		return "list";
	}

	@GetMapping("/detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		Board result = bService.board(id);
		if (result != null) {
			model.addAttribute("board", result);
			return "detail";
		}
		return null;
	}

	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}

	@PostMapping("/write")
	public String write(Board board, HttpSession session) {
		User user = (User)session.getAttribute("user");
		board.setUserId(user.getId());
		int result = bService.save(board);
		if (result == 1) {
			return "redirect:/blog/list";
		} else {
			return "redirect:/blog/writeForm";
		}
	}

	@GetMapping("/updateForm/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		Board board = bService.board(id);
		model.addAttribute("board", board);
		return "updateForm";
	}

	@PostMapping("/update")
	public String update(Board board) {
		int result = bService.update(board);
		if (result == 1) {
			return "redirect:/blog/list";
		}
		return null;
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		int result = bService.delete(id);
		if (result == 1) {
			return "redirect:/blog/list";
		}
		return null;
	}
}
