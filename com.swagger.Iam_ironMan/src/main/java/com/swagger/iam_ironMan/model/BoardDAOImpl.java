package com.swagger.iam_ironMan.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.swagger.iam_ironMan.domain.BoardDTO;

@Repository
public class BoardDAOImpl {
	
	private static final Logger logger
	=LoggerFactory.getLogger(BoardDAOImpl.class);
	
	@Autowired //의존관계 주입(Dependency Injection, DI)
	SqlSession sqlSession;
	
// 게시물 추가
	public void create(BoardDTO dto) throws Exception {
		sqlSession.insert("board.insert", dto); 
	}

	// 게시물 삭제
	public void delete(int boNo) throws Exception {
		sqlSession.delete("board.delete", boNo); 
	}
	
//게시물 조회
	public BoardDTO read(int boNo) throws Exception {
		return sqlSession.selectOne("board.read", boNo); 
	}
//레코드 수정	
	
	public void update(BoardDTO dto) throws Exception {
		sqlSession.update("board.update", dto); 
	}
	
	//게시물 리스트 조회
	public List<BoardDTO> listAll() throws Exception {
		
		return sqlSession.selectList("board.list");
	}
	
}
//게시물 목록 리턴
//	@Override
//	public List<BoardDTO> listAll(
//String search_option, String keyword,int start, int end) 
//				throws Exception {
//		Map<String,Object> map=new HashMap<>();
//		map.put("search_option", search_option);
//		map.put("keyword", "%"+keyword+"%");
//		map.put("start", start); //맵에 자료 저장
//		map.put("end", end);
// mapper에는 2개 이상의 값을 전달할 수 없음(dto 또는 map 사용)		
//		return sqlSession.selectList("board.listAll",map); 
//	}
	
//조회수 증가 처리
//	@Override
//	public void increateViewcnt(int bno) throws Exception {
//		sqlSession.update("board.increaseViewcnt", bno);

//레코드 갯수 계산 
//	@Override
//	public int countArticle(
//			String search_option, String keyword) throws Exception {
//		Map<String,String> map=new HashMap<>();
//		map.put("search_option", search_option);
//		map.put("keyword", "%"+keyword+"%");
//		return sqlSession.selectOne("board.countArticle",map);
//	}
	
// 첨부파일 레코드 삭제	
//	@Override
//	public void deleteFile(String fullName) {
//		sqlSession.delete("board.deleteFile", fullName); 
//	}
// //첨부파일 리스트
//	@Override
//	public List<String> getAttach(int bno) {
//		return sqlSession.selectList("board.getAttach", bno); 
//	}
//
//	@Override
//	public void addAttach(String fullName) {
//		sqlSession.insert("board.addAttach", fullName); 
//	}
//첨부파일 정보 수정
//	@Override
//	public void updateAttach(String fullName, int bno) {
//		Map<String,Object> map=new HashMap<>();
//		map.put("fullName", fullName); //첨부파일 이름
//		map.put("bno", bno); //게시물 번호
//		sqlSession.insert("board.updateAttach", map); 
//	}




