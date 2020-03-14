//program for finding and counting vowels in a String//

package text;

public class s13 {
public static void main(String[] args) {
	String a ="Communication is important";
	int count =0;
	for(int l=0;l<a.length();l++) {
		char c =a.charAt(l);
		if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u') {
		System.out.print(c);	
		count++;
		}
	}
		
	System.out.println(count);				
} 
}
