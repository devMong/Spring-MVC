package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

// http://.../aa/
@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody // 이 자체를 사용자에게 보낸다(문서출력).
	public String index() {
		
		return "Hello Index * 1";
		
		// 뷰페이지 반환, 반드시 root.index 라고 기입해야 tiles가 적용된다.
		//return "root.index";
	}

	
	/**
	 * @Controller 는 indexController를 객체화
	 * @RequestMapping 은 해당 url로 매핑된 함수가 실행
	 * 
	 * 이 후, indexController -> HomeController 로 이름 변경
	 * HomeController 라는 큰 그릇(클래스) 안에 index(), help() 라는 여러 개의 controller 가 담겨져 있다.
	 */
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
	
}
