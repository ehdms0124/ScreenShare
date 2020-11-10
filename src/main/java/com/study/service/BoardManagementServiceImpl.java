package com.study.service;

import com.study.dao.Board_ManagementMapper;
import com.study.dto.Board_Management;
import com.study.dto.Myclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardManagementServiceImpl implements com.study.service.BoardManagementService {

	@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
	@Autowired
	Board_ManagementMapper board_ManagementMapper;
	
	// CommonMenuList 는 DB board_management 의 boardNo 가 1000 을 초과하는 메뉴.
	// 나중에 Commonlist및 다른 리스트를 나누는 테이블을 만드는게 좋아보임.
	
	public List<Board_Management> loadGradeList() { return board_ManagementMapper.loadGradeList();}
	public List<Board_Management> loadCommonMenuList(){
		return board_ManagementMapper.loadCommonMenuList();
	}
	public List<Board_Management> loadOtherMenuList(){
		return board_ManagementMapper.loadOtherMenuList();
	}
	public List<Board_Management> loadClassMenuList() {return  board_ManagementMapper.loadClassMenuList();}
	public List<Board_Management> loadAllMenuList() {return board_ManagementMapper.loadAllList();}
	public boolean isMyclssBoard(int boardNo, List<Myclass> myclassList){
		int fk_classId;
		try {
			fk_classId = board_ManagementMapper.getfk_classId(boardNo);
		}catch (Exception e){
			fk_classId = 0;
		}

		for (int i = 0; i < myclassList.size(); i++) {
			if (myclassList.get(i).getFk_classId() == fk_classId)
				return true;
		}

		return false;
	}

	public Board_Management getBoard_Management(int boardNo){
		return board_ManagementMapper.getBoard_Management(boardNo);
	}

	@Override
	public void insertClassBoardList(List<Board_Management> board_managementList) {
		if(board_managementList.size() != 0) {
			for (Board_Management b : board_managementList) {
				board_ManagementMapper.insertClassBoardList(b);
			}
		}
	}

	public void insertCommonBoardService(Board_Management board_management){
		board_ManagementMapper.insertCommonBoard(board_management);
	}
}
