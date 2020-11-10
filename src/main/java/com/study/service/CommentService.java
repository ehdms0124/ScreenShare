package com.study.service;

import com.study.dto.Comment;

import java.util.List;

public interface CommentService  {
    public int addCommentService(Comment comment);
    public List<Comment> getCommentListService (int postNo);
    public void  deleteCommentService (int commentNo);
    public Comment getCommentByNoService(int commentNo);
}
