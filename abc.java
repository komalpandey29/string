
//string 

import java.util.*;
public class abc{
public static void main(String args[]) {
String initial="hard work will provide you success", rev="";
int length=initial.length();
for(int i=length-1;i>=0;i--)
  rev=rev+initial.charAt(i);
System.out.println("Reversed string: "+rev);
}
}