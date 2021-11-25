// java program to reverse a word

import java.io.*;
import java.util.Scanner;

class abc {
	public static void main (String[] args) {
	
		String str= "workhard for best future", nstr="";
		char ch;
	
	System.out.print("Original word: "+str);
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("\n Reversed word:\n "+ nstr);
	}
}

//Contributed by Tiyasa
