package com.study.controller;

import com.study.dto.*;
import com.study.dto.Class;
import com.study.service.BoardManagementService;
import com.study.service.BoardService;
import com.study.service.ClassService;
import com.study.service.MyClassService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {
	@Autowired
	BoardService boardService ;
	@Autowired
	BoardManagementService boardManagementService;
	@Autowired
	MyClassService myClassService;

	final static int NOTICECOUNT = 6;
	final static int NOTICENUMBOARD = 11;
	final static String NOTICENM = "공지사항";

	@RequestMapping("/home")
	public String home(Model model, HttpSession session) throws Exception {
		Users user = (Users)session.getAttribute("user");
		/*
		if (user !=null){
			if(user.isPs()==true) {
				System.out.println("교수님");
			}else if(user.isPs()==false){
				System.out.println("학생");
			}
		}
*/
		if (user == null) {
			return "redirect:signin";
		} else if (user.isPs() == true) {
			return "redirect:home";
		}

		List<Boards> boardsList = boardService.boardListService(NOTICENUMBOARD);
		if(boardsList.size()<NOTICECOUNT){
			model.addAttribute("list",boardsList);
		}else{
			boardsList = boardsList.subList(0,NOTICECOUNT);
			model.addAttribute("list",boardsList);
		}
		model.addAttribute("boardNm",NOTICENM);


		List<MyclassEnrol> m_class = myClassService.studentMyClassList(user.getUserId());
		model.addAttribute("myClassList", m_class);

		return "home";	
	}


	@RequestMapping("/header")
	public String header(Model model, HttpSession session) {

		return "header";	
	}
	
	@RequestMapping("/menu")
	public String menu(Model model, HttpSession session) {

		return "menu";
	}

	@RequestMapping("/logout")
	public String logout(Model model, HttpSession session) {

		session.removeAttribute("user");
		return "redirect:/home";
	}


}
