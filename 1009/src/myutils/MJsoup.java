package myutils;					
					
import java.io.IOException;					
import org.jsoup.Jsoup;					
import org.jsoup.nodes.Document;					
import org.jsoup.select.Elements;					
import org.jsoup.nodes.Element;					
public class MJsoup {					
	public static void getMethod() {				
		String URL = "https://www.daum.net";
		String selector = "a .link_issue";
		try {			
			Document doc = Jsoup.connect(URL).get();		
			Elements elem = doc.select(selector);		
			  for(Element element: elem) { // 3.Elemntes 길이만큼 반복한다.
		            System.out.println(element.text()); // 4. 원하는 요소가 출력된다
			  }
		        //    String str = elem.text();		
			
		//	System.out.println(str);		
			  
		} catch (IOException e) {			
			// TODO Auto-generated catch block		
			e.printStackTrace();		
		}			
					
	}				
}										