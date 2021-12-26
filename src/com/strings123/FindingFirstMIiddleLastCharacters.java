package com.strings123;

public class FindingFirstMIiddleLastCharacters {
	public static void main(String[] args) {
		
		FindingFirstMIiddleLastCharacters f = new FindingFirstMIiddleLastCharacters();
		String s="Likith";
		f.getInfo(s);
	}

	private void getInfo(String s) {
		if(s!=null){
			int length = s.length();
			System.out.println("Length is " + length);
			System.out.println(s.charAt(0));
			System.out.println("Last character is " + (s.charAt(length-1))  );
			if(length %2==0){
				System.out.println(s.charAt(length/2  ));
				System.out.println(s.charAt(length/2-1));
			}else{
				System.out.println("String is having odd characters");
			}
		}
		
	}
}
