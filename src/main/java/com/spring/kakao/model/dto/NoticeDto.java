package com.spring.kakao.model.dto;

public class NoticeDto {

	private int notice_code;
	private String notice_title;
	private String notice_writer;
	private String notice_date;
	private int notice_count;
	private String notice_content;

	public int getNotice_code() {
		return notice_code;
	}

	public void setNotice_code(int notice_code) {
		this.notice_code = notice_code;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_writer() {
		return notice_writer;
	}

	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}

	public String getNotice_date() {
		return notice_date;
	}

	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}

	public int getNotice_count() {
		return notice_count;
	}

	public void setNotice_count(int notice_count) {
		this.notice_count = notice_count;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	@Override
	public String toString() {
		return "NoticeDto [notice_code=" + notice_code + ", notice_content=" + notice_content + ", notice_count="
				+ notice_count + ", notice_date=" + notice_date + ", notice_title=" + notice_title + ", notice_writer="
				+ notice_writer + "]";
	}

}
