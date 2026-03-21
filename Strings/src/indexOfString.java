import java.util.Scanner;

public class indexOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();


        char t = in.next().charAt(0);
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == t){
                System.out.print(i);
            }
        }
    }
}
