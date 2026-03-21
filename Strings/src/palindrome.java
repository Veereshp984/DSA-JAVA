public class palindrome {
    public static void main(String[] args) {
        String s  = "malayalam";
        int i =0;
        int j = s.length()-1;
        Boolean isFlag = true;
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isFlag = false;
                break;
            }
            i++;
            j--;
        }
            if(isFlag == true){
                System.out.println("it is a palindrome");
            }else{
                System.out.println("not palindrome");
            }

    }
}
