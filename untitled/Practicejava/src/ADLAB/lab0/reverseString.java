package ADLAB.lab0;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("Reverse of abc is  "+reverseString("abc"));
    }

    static String reverseString(String str) {
        if(str.isEmpty()){
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
