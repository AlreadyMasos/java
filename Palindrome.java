public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length;i++){
            String k = args[i];
            if (lePalendrome(k))
            {
                System.out.println(k+"");}  //вывод результата
        }
    }
    public static String reverseString(String k){
        String tape = "";       //создаем пустую строку
        for (int i = k.length()-1;i>=0;i--) { //пробегаем по изначальной строке
            tape += k.charAt(i);
        }
        return tape;
    }
    public static Boolean lePalendrome(String tape){ //возвращаем тру или фолс
        return tape.equals(reverseString(tape));     //в случае полного совпадения
    }
}
