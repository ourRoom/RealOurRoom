package ourRoom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

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
		return "/home/home";
	}
	
	@RequestMapping("/project")
	public String project() {
		return "/project/project";
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
