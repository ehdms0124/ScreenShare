package com.study.dao;

import com.study.dto.Comment;

import java.util.List;

public interface CommentMapper {
    public int addComment(Comment comment);
    public List<Comment> getCommentList (int PostNo);
    public void deleteComment(int commentNo);
    public Comment getCommentByNo (int commentNo);
}
