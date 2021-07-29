package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController") // 특화된 컨트롤러
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired // @Autowired 로 서비스 객체를 바인딩화
	private NoticeService service;
	
	@RequestMapping("list")
	public Notice getList() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "title", "");
		
		return list.get(0);
		// 문자가 아닌 객체 통째로 반환
		
		//return "공지사항 list";
		// ReponseBody 하지 않아도 @RestController로 인해 글자로 변환
		
		// NoticeController noticeController = new NoticeController
		//<bean id="noticeController" class="...NoticeController" />
	}
}
