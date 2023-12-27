package com.kh.app.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data						// @Getter + @Setter + @ToString + @RequiredArgsConstructor + @EqualsAndHashCode
//@NoArgsConstructor   		//기본 생성자 만드는 어노테이션
//@AllArgsConstructor  		//모든 파라미터를 받는 생성자를 만드는 어노테이션
//@RequiredArgsConstructor	//필요한 것만 (final이 있는 것은 제외) 파라미터로 받아서 생성자를 만드는 어노테이션   	
public class BoardVo {

	private final String no;
	private String title;
	private String content;
	private String enrollDate;
	
}

