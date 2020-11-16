/******************************************************************************

Take two strings, check if one string is a substring of another.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the string");
	    String entrdString = scanner.nextLine();
        entrdString = entrdString.toLowerCase();
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for(int i = 0; i < entrdString.length(); i++) {
            if(hs.contains(entrdString.charAt(i))) {
                hs.remove(entrdString.charAt(i));
                count++;
            } else {
                hs.add(entrdString.charAt(i));
            }
        }
        if(count != 0)
            System.out.println(count * 2 + 1);
        else
            System.out.println("No palindrome substring");
	}
}
