package com.jdbc;

import java.util.ArrayList;
import com.subject.SubjectDAO;
import com.subject.SubjectVO;

/*
 * 모델2 패턴에서 DAO클래스는 Model기능을 수행하고 있다. 하지만 실제로는 Service 클래스를 만들어
 * DAO클래스를 가지전 Service클래스를 거치도록 구현한다. 
 * DAO 클래스는 데이터 베이스에 접근하는 기능을 수행하고
 * Service 클래스는 실제 프로그램을 업무에 적용하는 사용자 입장에서 
 * 업무단위(단위기능, 하나의 논지적인 기능)작업을 수행한다.
 * 
 */


public class SubjectService {
	private static SubjectService instance = null;
	
	private SubjectService() {};
	
	public static SubjectService getInstance() {
		if(instance == null) {
			instance = new SubjectService();
		}
		return instance;
	}
	
	public ArrayList<SubjectVO> subjectList(SubjectVO vo){
		ArrayList<SubjectVO> list = new SubjectDAO().getSubjectTotal(vo);
		return list;
	}
	
	public boolean subjectInsert(SubjectVO vo) {
		boolean result = new SubjectDAO().subjectInsert(vo);
		return result;
	}
	
	public boolean subjectDelete(SubjectVO vo) {
		
		
		boolean result = new SubjectDAO().subjectDelete(vo);
		return result;
	}
	
	public String subjectNumber() {
		String result = new SubjectDAO().getSubjectNum();
		return result;
	}
	


}
