package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/") // 해당 RequestMapping과 컨트롤러의 RequestMapping의 url이 결합되어 페이지를 출력한다. ex) "/customer/notice/" + "list"
public class NoticeController {
	
	// DI를 servlet-context.xml에 설정할 필요없이 어노테이션(=@Autowired)으로 설정 가능하다
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam(value="p", defaultValue = "1") Integer page) throws ClassNotFoundException, SQLException {
//		String p = request.getParameter("p");
		System.out.println("page : " + page);
		
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		return "notice.detail";
	}
}
