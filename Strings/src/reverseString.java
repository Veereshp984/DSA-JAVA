public class reverseString {
    public static void main(String[] args) {
        String s = "veeru";
        StringBuilder v = new StringBuilder(s);

        int i =0;
        int j = v.length()-1;
        while(i <j){
            // SWAP -- s[i] and s[j]
            char temp = v.charAt(i);
            v.setCharAt(i ,s.charAt(j));
            v.setCharAt(j , temp);
            i++;
            j--;
        }
        System.out.println(v);
    }
}
