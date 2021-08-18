package ragini_test;

import java.util.Arrays;

public class RaginiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample_text="Today the S&P 500 had its best performance in ten years";
		String[] blacklist= {"S&P","had"};
		String replaceWith="";
		for(String blacklisted:blacklist) {
			if(sample_text.contains(blacklisted)) 
			{
			sample_text=sample_text.replaceAll(blacklisted, "");	
			}
		}
		System.out.println("sample_text: "+sample_text);
	}

}
