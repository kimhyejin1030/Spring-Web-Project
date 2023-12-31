package org.noel.service;

import java.util.List;

import org.noel.domain.BoardVO;
import org.noel.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		
		log.info("register...."+board);
		
		mapper.insertSelectKey(board);
		
	}

	@Override
	public List<BoardVO> getList() {

		log.info("getList...........");
		
		return mapper.getList();
	}
	
	@Override
	public BoardVO get(Long bno) {
		
		log.info("get........" + bno);
		
		return mapper.read(bno);
	}


	@Override
	public boolean modify(BoardVO board) {
		
		log.info("modify......." + board);
		
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		
		log.info("remove......." + bno);
		
		return mapper.delete(bno) == 1;
	}



}
