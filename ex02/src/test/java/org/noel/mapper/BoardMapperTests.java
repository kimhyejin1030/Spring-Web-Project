package org.noel.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.noel.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		
		log.info("---------------------");
		boardMapper.getList();
	}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("Test 테스트");
		board.setContent("Content 테스트");
		board.setWriter("tester");
		
		boardMapper.insert(board);
		log.info("-----------------------------------");
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("AAA 테스트");
		board.setContent("AAAContent 테스트");
		board.setWriter("tester");
		
		boardMapper.insertSelectKey(board);
		log.info("-----------------------------------");
		log.info(board);
		
	}

}
