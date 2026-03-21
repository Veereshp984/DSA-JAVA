import java.util.Scanner;

public class indexOfWord {
    public static boolean match(String s , String t , int startIndex){
        int i =startIndex; // s string
        int j =0; // t string
        while(i< s.length() && j<t.length()){
            if(s.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "i love programming and love";
        String t = "love";
        int l = s.length();
        for(int i =0;i<l;i++ ){ // start point
            if(match(s,t,i)==true){
                System.out.println(i + " ");
            }
        }
    }
}
