package com.kh.opendata.run;

import java.io.IOException;
import java.net.URLEncoder;

public class AirPollutionJavaApp {

	public static final String serviceKey = "JHf3ucgXigu";
	
	public static void main(String[] args) throws IOException{
		
		String url = "https://apis.data.go.kr/B552584/ArpltnInfoInqireSvc";
		url += "?serviceKey=" + "서비스키";
		url += "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
		url += "&returnType=json";
		
		
	}
	
}
