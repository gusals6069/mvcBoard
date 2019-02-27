package com.mvc.board.post.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mvc.board.post.domain.CategoryVo;
import com.mvc.board.post.domain.PostVo;

@Repository
public class PostDAOImpl implements PostDAO {
	
	private static final String NAMESPACE = "com.mvc.board.mappers.post.PostMapper";
	private SqlSession sqlSession;
	
	@Inject
	public void setSqlSession(SqlSession sqlSession) {
	   this.sqlSession = sqlSession;
	}
	
	@Override
	public void create(PostVo postVo) throws Exception {		
		sqlSession.insert(NAMESPACE + ".postCreate", postVo);
	}
	
	@Override
	public PostVo view(String postNo) throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("postNo", postNo);
		
		return sqlSession.selectOne(NAMESPACE + ".postView", parameter);
	}
	
	@Override
	public void update(PostVo postVo) throws Exception {
		sqlSession.update(NAMESPACE + ".postUpdate", postVo);	
	}
	
	@Override
	public void delete(String postNo) throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("postNo", postNo);
		 
		sqlSession.delete(NAMESPACE + ".postDelete", parameter);	
	}
	
	@Override
	public List<CategoryVo> cateList(String bbsNo) throws Exception {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("bbsNo", bbsNo);
		 
		return sqlSession.selectList(NAMESPACE + ".cateList", param);
	}

	@Override
	public List<PostVo> listAll(PostVo postVo) throws Exception {
		return sqlSession.selectList(NAMESPACE + ".postList", postVo);
	}

	@Override
	public List<PostVo> listNews(PostVo postVo) throws Exception {
		return sqlSession.selectList(NAMESPACE + ".postNews", postVo);
	}

	@Override
	public int listCount(PostVo postVo) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".postCount", postVo);
	}

	
}
