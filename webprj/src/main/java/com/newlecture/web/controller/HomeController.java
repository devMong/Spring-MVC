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
	@ResponseBody // �� ��ü�� ����ڿ��� ������(�������).
	public String index() {
		
		return "Hello Index * 1";
		
		// �������� ��ȯ, �ݵ�� root.index ��� �����ؾ� tiles�� ����ȴ�.
		//return "root.index";
	}

	
	/**
	 * @Controller �� indexController�� ��üȭ
	 * @RequestMapping �� �ش� url�� ���ε� �Լ��� ����
	 * 
	 * �� ��, indexController -> HomeController �� �̸� ����
	 * HomeController ��� ū �׸�(Ŭ����) �ȿ� index(), help() ��� ���� ���� controller �� ����� �ִ�.
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
