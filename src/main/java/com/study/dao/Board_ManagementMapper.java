package com.study.dao;

import com.study.dto.Board_Management;

import java.util.List;

public interface Board_ManagementMapper {
	public List<Board_Management> loadGradeList();
	public List<Board_Management> loadCommonMenuList();
	public List<Board_Management> loadOtherMenuList();
	public List<Board_Management> loadClassMenuList();
	public List<Board_Management> loadAllList();
	public int getfk_classId(int boardNo);
	public Board_Management getBoard_Management(int boardNo);
	public void insertClassBoardList(Board_Management board_management);
	public void insertCommonBoard(Board_Management board_management);
}
