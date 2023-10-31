package org.noel.mapper;

import org.apache.ibatis.annotations.Select;

// org.noel.mapper.TimeMapper.getTime2 -> 

public interface TimeMapper {
	
	// ; 없어야 한다
	@Select("SELECT sysdate From dual")
	String getTime();
	
	String getTime2();

}
