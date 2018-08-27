package ourRoom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ourRoom.service.ProjectService;

@Controller
public class PageController {
	
	@Autowired
	ProjectService projectSvc;

	@RequestMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("test2");
		return "test2";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home");
		return "/home/home";
	}
	
	@RequestMapping("/project")
	public String project() {
		return "/project/project";
	}
	
	@RequestMapping("/project/gantt")
	public ModelAndView project_gantt(String mNum, int pNum) {
		System.out.println("멤버 : " + mNum);
		System.out.println("프로젝트 : " + pNum);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/project/project_gantt");
		mav.addObject("project_gantt", projectSvc.projectView(pNum));
		
		return mav;
	}
	
	@RequestMapping("/address")
	public String address() {
		return "/address/address";
	}
	
	@RequestMapping("/myPage")
	public String myPage() {
		return "/myPage/myPage";
	}
}
