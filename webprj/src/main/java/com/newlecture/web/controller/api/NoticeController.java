package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController") // Ưȭ�� ��Ʈ�ѷ�
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired // @Autowired �� ���� ��ü�� ���ε�ȭ
	private NoticeService service;
	
	@RequestMapping("list")
	public Notice getList() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "title", "");
		
		return list.get(0);
		// ���ڰ� �ƴ� ��ü ��°�� ��ȯ
		
		//return "�������� list";
		// ReponseBody ���� �ʾƵ� @RestController�� ���� ���ڷ� ��ȯ
		
		// NoticeController noticeController = new NoticeController
		//<bean id="noticeController" class="...NoticeController" />
	}
}
