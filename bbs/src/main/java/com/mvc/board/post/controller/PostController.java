package com.mvc.board.post.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.board.post.domain.PostVo;
import com.mvc.board.post.service.PostService;
import com.mvc.board.common.util.PageMaker;

@Controller
public class PostController<httpServletRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	private PostService postService;
	
	@Inject
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute(value="postVo") PostVo postVo, Model model) throws Exception {
		
		PageMaker pageMaker = new PageMaker(postVo);
	    pageMaker.setPageSize(10);
	    pageMaker.setBlockSize(10);
	    pageMaker.setTotalCount(postService.listCount(postVo));

	    model.addAttribute("postList", postService.listAll(postVo));
	    model.addAttribute("postNews", postService.listNews(postVo));  
	    model.addAttribute("postCount", postService.listCount(postVo));
	    model.addAttribute("pageMaker", pageMaker);
	    model.addAttribute("searchType", postVo.getSearchType());
	    model.addAttribute("searchKeyword", postVo.getSearchKeyword());
	    
		return "/post/list";
	}
	
}
