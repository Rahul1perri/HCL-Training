package excercise1;

public class CheckStrings {

	public  String concatString(String a,String b) {
	String c=a+".";
	String s3=c.concat(b);
	return s3;
	}
	
	public  boolean stringFound(String a,String b) {
		boolean c=a.contains(b);
		return c;
	}
	
	public String stringReverse(String a) {
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		return sb.toString();
		}
	
	public String replaceString(String a,String b,String c) {
	 a=a.replaceAll(b,c);
		return a;
		}
	
	public boolean locationEqual(String a, String b) {
		 String l=a;
		 String L=b;
		 boolean c;
		 if(l==L){
			 c=true;
		 }else {
		 c=false;}
		return  c;
	} 
	
	public String editString(String a,String b) {
	 a=a.replaceAll(b,"");
	 return a;
		}
	
	public String insertData(String a,String b,int pos) {
		StringBuilder sb=new StringBuilder(a);
		sb.insert(pos," "+ b+" ");
		String s=sb.toString();
		return s;
	}
	
	public int checkCount(String a, String b) {
		int word1=0,word2=0,Z=0;
		if(a==null|| a.equals("")) {
			return word1;
		}for (int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				word1++;
			}else {
				if(i==a.length()-1)
					word1++;
			}
		}
		if(b==null||b.equals("")) {
			return word2;
		}
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==' ') {word2++;}
			else {if(i==b.length()-1)
				word2++;}
		}
		if (word1>word2)
			Z=1;
		else if(word2>word1)
			Z=2;
		else
			Z=0;
		return Z;
	}
	
	public String  convertString(String a) {
		int i=a.charAt(0);
		String q=null;
		if(i>=97 && i<=122) {
			q=a.toUpperCase();}
		else {
		q=a.toLowerCase();}
		    return q;
	}
	
public boolean checkUpperCase(String a) {
	boolean q=false;
	for(int i=0;i<a.length();i++) {
	int x=a.charAt(i);
	if (x>=97&&x<=122)
		q=false;
	else {
		q=true;}
			}
	
	return q;
}
}
