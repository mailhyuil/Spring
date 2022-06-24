package com.callor.naver.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
<<<<<<< HEAD

=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
public class NaverXMLParent {
	
	public String title;
	public String link;
	public String description;
	public String lastBuildDate;
	public String total;
	public String start;
	public String display;
	
	@JacksonXmlElementWrapper(useWrapping = false)
<<<<<<< HEAD
	public List<Object> item; //-XML 포멧에서는 item 태그로, JSON 포멧에서는 items 속성으로 표현된다. 개별 검색 결과이며 title, link, description을 포함한다.
	
}
=======
	public List<Object> item;	//	-	XML 포멧에서는 item 태그로, JSON 포멧에서는 items 속성으로 표현된다. 개별 검색 결과이며 title, link, description을 포함한다.

}




>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
