package org.noel.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate From dual")
	String getTime();

}
