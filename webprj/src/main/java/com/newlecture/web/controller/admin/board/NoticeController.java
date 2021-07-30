package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController { // <bean name="adminNoticeController" class="com.newlecture.web.controller.admin.board">

	@RequestMapping("list")
	public String list() {
		return "notice.list";
	}

	@RequestMapping("reg")
	@ResponseBody
	// ����ڰ� �Է��� ���� Ȯ���ϴ� ������� ���
	public String reg(String title, String content, String category, String[] foods, String food) {
		System.out.println(category);
			for(String f : foods) {
				System.out.println(f);
			}
		return String.format("title:%s<br>content:%s<br>category:%s", title, content, category);
	}

	@RequestMapping("edit")
	public String edit() {
		return "";
	}

	@RequestMapping("del")
	public String del() {
		return "";
	}

}
