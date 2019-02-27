package com.mvc.board.post.service;

import java.util.List;
import java.util.Map;

import com.mvc.board.post.domain.CategoryVo;
import com.mvc.board.post.domain.PostVo;

public interface PostService {	
	void create(PostVo postVo) throws Exception;
	PostVo view(String postNo) throws Exception;
    void update(PostVo postVo) throws Exception;
    void delete(String postNo) throws Exception;
    List<PostVo> listAll(PostVo postVo) throws Exception;
    List<PostVo> listNews(PostVo postVo) throws Exception;
    int listCount (PostVo postVo) throws Exception;
    List<CategoryVo> cateList(String bbsNo) throws Exception;
}
