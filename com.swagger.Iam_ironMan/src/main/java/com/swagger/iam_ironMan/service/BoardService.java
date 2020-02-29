package com.swagger.iam_ironMan.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.swagger.iam_ironMan.domain.BoardDTO;

public interface BoardService {


	public void create(BoardDTO dto) throws Exception;
	public BoardDTO read(int boNo) throws Exception;
	public void update(BoardDTO dto) throws Exception;
	public void delete(int boNo) throws Exception;
	public List<BoardDTO> listAll() throws Exception; 
	
	
	
	
	
//	public List<String> getAttach(int bono);
//	public void deleteFile(String fullName);
//	public List<BoardDTO> listAll(
//String search_option, String keyword,int start, int end) 
//				throws Exception;
//	public void increaseViewcnt(int bno, HttpSession session) 
//			throws Exception; 
//	public int countArticle(
//			String search_option, String keyword) throws Exception;
}
