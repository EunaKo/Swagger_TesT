package com.swagger.iam_ironMan.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.swagger.iam_ironMan.domain.BoardDTO;
import com.swagger.iam_ironMan.model.BoardDAOImpl;
@Service
public class BoardServiceImpl implements BoardService {


	@Inject
	BoardDAOImpl boardDao;

	@Override
	public void create(BoardDTO dto) throws Exception {
				boardDao.create(dto); 
	}

	@Override
	public BoardDTO read(int boNo) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.read(boNo);
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		boardDao.update(dto);		
	}

	@Override
	public void delete(int boNo) throws Exception {
		boardDao.delete(boNo); 		
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {

		return listAll();
	}
	
	
	

}
