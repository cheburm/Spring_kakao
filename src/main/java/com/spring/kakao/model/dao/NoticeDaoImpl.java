package com.spring.kakao.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.kakao.model.dto.NoticeDto;

@Repository
public class NoticeDaoImpl implements NoticeDao{ // <- 이경로

	@Autowired
	private SqlSession session;
	// 왜필요하지요? 세션?
	
	private static final String NAME_SPACE = "com.spring.kakao.model.dao.NoticeDao."; // <-이게 
	
	@Override
	public List<NoticeDto> getNoticeListAll() {
		return session.selectList(NAME_SPACE + "getNoticeListAll");
	}

}
