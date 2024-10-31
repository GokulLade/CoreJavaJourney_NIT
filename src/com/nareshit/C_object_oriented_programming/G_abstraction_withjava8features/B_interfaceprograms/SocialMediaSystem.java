package com.nareshit.C_object_oriented_programming.G_abstraction_withjava8features.B_interfaceprograms;

interface Post{
	public void publish();
	public void like();
}

class TextPost implements Post{
	String textContent;
	static int like;
	
	TextPost(String textContent){
		this.textContent=textContent;
		like=0;
	}
	
	@Override
	public void publish() {
		System.out.println(textContent);
	}
	
	@Override
	public void like() {
		like++;
		
	}
}
public class SocialMediaSystem {

	public static void main(String[] args) {
		
		
	}

}
