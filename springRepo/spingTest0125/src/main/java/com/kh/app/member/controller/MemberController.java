package com.kh.app.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*")
@RequestMapping("member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

	private final MemberService service;
	
	@PostMapping
	public Map<String, String> join(@RequestBody MemberVo vo) throws Exception {
		
		int result = service.join(vo);
		
		Map<String, String> map = new HashMap<String, String>();
		if(result == 1) {
			map.put("msg", "good");
		}else {
			map.put("msg", "bad");
		}
		
		log.info("result::: " + result);
		
		return map;
	}
}
