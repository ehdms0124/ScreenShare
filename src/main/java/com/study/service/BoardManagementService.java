package com.study.service;

import com.study.dto.Board_Management;
import com.study.dto.Myclass;

import java.util.List;

public interface BoardManagementService {
    public List<Board_Management> loadGradeList();
    public List<Board_Management> loadCommonMenuList();
    public List<Board_Management> loadOtherMenuList();
    public List<Board_Management> loadClassMenuList();
    public List<Board_Management> loadAllMenuList();
    public boolean isMyclssBoard(int boardNo, List<Myclass> myclassList);
    public Board_Management getBoard_Management(int boardNo);
    public void insertClassBoardList(List<Board_Management> board_managementList);
    public void insertCommonBoardService (Board_Management board_management);
}
