package com.study.dao;

import com.study.dto.Myclass;
import com.study.dto.MyclassEnrol;

import java.util.List;

public interface MyclassMapper {
    public List<Myclass> myclassList(int userId);
    public List<MyclassEnrol> studentMyClassList(int userId);
    public void tempMyclass(Myclass myclass);
    public List<Myclass> allMyclassList(int userId);
    public void cancelMyclass (int userId, int fk_classId);
    public List<Myclass> getMyClassList (int fk_classId);
    public void myClassConfirm(int userId, int fk_classId);
    public void insertMyClass(Myclass myclass);
    public List<Myclass> operatorMyClass();
    public int isMyClass(int userId, int classId);
}
