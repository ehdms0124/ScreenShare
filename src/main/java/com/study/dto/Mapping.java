package com.study.dto;

import java.util.HashMap;
import java.util.List;

public class Mapping {
    HashMap<Integer, Board_Management> boardMapping ;
    List<Board_Management> board_managementList;
    public Mapping(List<Board_Management> board_managementList){
        this.board_managementList = board_managementList;
        for(int i = 0; i < board_managementList.size() ; i++){
            Board_Management board =  board_managementList.get(i);
            boardMapping.put(board.boardNo, board);
        }
    }

    public Board_Management getBoardNm(int boardNo){
        return boardMapping.get(boardNo);
    }
}
