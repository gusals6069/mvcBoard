package com.mvc.board.post.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mvc.board.post.domain.CategoryVo;
import com.mvc.board.post.domain.PostVo;
import com.mvc.board.post.persistence.PostDAO;

@Service
public class PostServiceImpl implements PostService{

	private PostDAO postDAO;
	
	@Inject
    public PostServiceImpl(PostDAO postDAO) {
        this.postDAO = postDAO;
    }
	
	@Override
	public void create(PostVo postVo) throws Exception {
		postDAO.create(postVo);
	}

	@Override
	public PostVo view(String postNo) throws Exception {
		return postDAO.view(postNo);
	}

	@Override
	public void update(PostVo postVo) throws Exception {
		postDAO.update(postVo);
		
	}

	@Override
	public void delete(String postNo) throws Exception {
		postDAO.delete(postNo);
	}
	
	@Override
	public List<CategoryVo> cateList(String bbsNo) throws Exception {
		return postDAO.cateList(bbsNo);
	}

	@Override
	public List<PostVo> listAll(PostVo postVo) throws Exception {
		return postDAO.listAll(postVo);
	}

	@Override
	public List<PostVo> listNews(PostVo postVo) throws Exception {
		return postDAO.listNews(postVo);
	}

	@Override
	public int listCount(PostVo postVo) throws Exception {
		return postDAO.listCount(postVo);
	}
	
}
