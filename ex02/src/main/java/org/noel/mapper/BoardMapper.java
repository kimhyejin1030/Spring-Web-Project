package org.noel.mapper;

import java.util.List;

import org.noel.domain.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);

}
