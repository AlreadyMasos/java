public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length;i++){
            String k = args[i];
            if (lePalendrome(k))
            {
                System.out.println(k+"");}
        }
    }
    public static String reverseString(String k){
        String tape = "";       //создаем пустую строку
        for (int i = k.length()-1;i>=0;i--) tape+=k.charAt(i);
        return tape;
    }
    public static Boolean lePalendrome(String tape){
        return tape.equals(reverseString(tape));
    }
}
