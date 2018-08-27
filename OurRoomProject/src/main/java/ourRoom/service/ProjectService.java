package ourRoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ourRoom.model.Project;
import ourRoom.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository pr;
	
	//해당 프로젝트로 페이지 이동?
	public void projectView(int pNum) {
	}
	
	//해당 로그로 이동
	public void logLocationView() {

	}
	
	//프로젝트 명 변경
	public void projectNameChange() {
		
	}
	
	//프로젝트 배경 변경
	public void projectBgUpdate() {
		
	}
	
	//프로젝트 기간 설정
	public void projectDateSet() {
		
	}
	
	//프로젝트 생성
	public void projectAdd() {
	
	}
	
	//프로젝트 회원 추가
	public void projectAddressAdd() {
		
	}
	
	//즐겨찾기 등록 / 취소 토글
	public void favoriteToggle() {
		
	}
	
	//프로젝트 멤버 리스트 
	public void projectMemberList() {
		
	}
	
	//프로젝트 삭제
	public void projectDelete() {
		
	}

	
}
