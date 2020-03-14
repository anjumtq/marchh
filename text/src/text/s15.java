//*program to print words of a string in reverse order*//

package text;
public class s15 {
	public static void main(String[] args) {
	String s = "Hello HOW Are You";
			String[] arr = s.split(" ");
			int l = arr.length;
			//System.out.println(l);
			for(int i =l-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
			
		}

	}

	
	
	
	
	