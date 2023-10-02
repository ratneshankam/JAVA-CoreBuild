import java.util.*;

public class Lec_16_strings {
    public static void stringBasics(String str) {
        // char c[] = {'a', 'b', 'c', 'd'};
        // String s = "abcd";
        // String st = new String("Ratnesh");

        // // String is immutable (unable to be changed)
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();        // sc.nextLine();       -> It prints the entire sentence rather than the one word
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());               // -> length function of String with parenthesis


        // // Concatenation
        String firstName = "Ratnesh";
        String lastName = "Ankam";
        // System.out.println(firstName + " " + lastName);
        System.out.println(firstName.charAt(1));

        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {               //North
                y++;
            } else if (dir == 'S') {        //South
                y--;
            } else if (dir == 'W') {        //West
                x--;
            } else {                        //East
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)(Math.sqrt(x2 + y2));
        // String path = "WNEENESENNN";
    }

    public static void equalsStrings(String str) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        if (s1==s2) {
            System.out.println("true");
        } 
        if (s1==s3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (s1.equals(s3)) {
            System.out.println("with using functions -> true");
        }
    }

    public static String substring(String str, int si, int ei) {
        String subStr = "";
        for (int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;

        // inbuilt functions
        // System.out.println(str.substring(0,5));
    }
    
    public static String compareString(String str[]) {
        String largest = str[0];
        for (int i=0; i<str.length; i++) {
            if ((largest.compareTo(str[i])) < 0 ) {
                largest = str[i];
            }
        }
        return largest;
    }   
    
    public static void buildingString(String str) {
        StringBuilder sb = new StringBuilder("");
        // String sb = new String("");
        for (char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
            // sb += ch;
        }   //abcdefghijklmnopqrstuvwxyz        //O(26)          //O(n^2)
        System.out.println(sb.length());
    }

    public static String toUpperCaseString(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        String newStr = "";
        for (int i=0; i<str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count >1) {
                newStr += count.toString();
            }
        }
        return newStr;

    }

    public static String compressBuilder(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i=0; i<str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count.toString());
            }
        }

        return newstr.toString();
    }

    public static int vowelCount(String str) {
        {String st="ApnaCollege".replace("l","");
        System.out.println(st);}
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean anagrams(String str1, String str2) {
        for (int i=0; i<str1.length(); i++) {
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="earth";String str2="heart";
        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        str1=str1.toLowerCase();str2=str2.toLowerCase();
        // First check - if the lengths are the same
        if(str1.length() ==str2.length())  {
            // convert strings into char array
            char[]str1charArray=str1.toCharArray();
            char[]str2charArray=str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are sameor identical then the strings are anagram
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result) {
                System.out.println(str1+" and "+str2+" are anagrams of eachother.");
            } else {
                System.out.println(str1+" and "+str2+" are not anagrams ofeach other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
        }
    }
}
