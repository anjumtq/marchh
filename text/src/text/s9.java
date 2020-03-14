//*program to find the count of numbers in string*//

package text;
public class s9 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	String l = "Welcome  2  programs  1 to 9 and 10 to 15";
	int k = l.length();
	int count =0;
	for(int j =0;j<k;j++) {
		char c =l.charAt(j);
		if(c>=48 && c<=57) {
			count++;
		}
	}
	System.out.println(count);

	}

}
