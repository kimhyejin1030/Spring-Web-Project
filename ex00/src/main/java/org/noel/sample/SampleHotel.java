package org.noel.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;

// 1. 필드 주입, 2. 세터 주입, 3. 생성자 주입
@Component
@ToString
public class SampleHotel {
	
	private Chef chef;

	public SampleHotel(Chef chef) {
		super();
		this.chef = chef;
	}
	
	

}
