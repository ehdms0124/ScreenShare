package com.study.dao;

import com.study.dto.Class;

import java.util.List;

public interface ClassMapper {
    public List<Class> classList(int userId);
    public List<Class> classListAll();
    public int createClass(Class class_);
    public Class getClass(int classId);
    public void deleteClass(int classId);
}
