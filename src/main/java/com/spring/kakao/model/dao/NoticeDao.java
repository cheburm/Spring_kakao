package com.spring.kakao.model.dao;

import java.util.List;

import com.spring.kakao.model.dto.NoticeDto;

public interface NoticeDao {
// 2
	public List<NoticeDto> getNoticeListAll();
}
