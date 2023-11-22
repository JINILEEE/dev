package com.kh.app.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
				
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);  // 기본적으로 필터에 막혀서 다음으로 안넘어 가는데 이 코드 작성하면 넘겨줄수 있다.
		
	}

	
	
}
