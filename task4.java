public class task4 {


    public static void main(String[] args){
            System.out.println()            //<-вставьте функцию
    }

    //Задача 1
    public static String textProc(int n, int k, String text){
        String[] tmp = text.split(" ");
        String result = "";
        result += tmp[0];
        int currentLength = tmp[0].length();
        for (int i = 1; i < tmp.length; i++){
            if (currentLength + tmp[i].length() <= k) {
                result += " " + tmp[i];
                currentLength += tmp[i].length();
            }
            else {
                result += "\n" + tmp[i];
                currentLength = tmp[i].length();
            }
        }
        return result;
    }

    //Задача 2
     public static String[] splited(String string){
        String ans = "";
        int otkr = 0;
        int zakr = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '(')otkr++;
            if(string.charAt(i) == ')')zakr++;
            ans += string.charAt(i);
            if(otkr == zakr)ans += " ";
        }
        return ans.split(" ");
    }

    //Задача 3
    public static String toCamelCase(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '_') {
                String tmp = "";
                tmp += str.charAt(i + 1);
                result += tmp.toUpperCase();
                i += 2;
            }
            result += str.charAt(i);
        }
        return result;
    }

    
    public static String toSnakeCase(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))) {
                String tmp = "";
                tmp += str.charAt(i);
                result += '_' + tmp.toLowerCase();
                i++;
            }
            result += str.charAt(i);
        }
        return result;
    }


    //Задча 4
     private String overTime(double[] money) {
        double regular = 0;
        double overReg = 0;
        if (money[0] < 17 && money[1] > 17) {
            regular = 17 - money[0];
            overReg = money[1] - 17;
            } 
        if (money[0] < 17 && money[1] < 17) {
            regular = money[1] - money[0];
            overReg = 0;
            }
        if (money[0] > 17) {
            regular = 0;
            overReg = money[1] - money[0];
            }
            String result = "$" + String.valueOf(regular * money[2] + overReg * money[2] * money[3]);
            return result;
    }

    //Задача 5
    public static String BMI(String weight, String height){
        String[] w = weight.split(" ");
        String[] h = height.split(" ");
        double WEIGHT = Double.parseDouble(w[0]);
        double HEIGHT = Double.parseDouble(h[0]);
        if (w[1].equals("pounds")) WEIGHT *= 0.4536;
        if (h[1].equals("inches")) HEIGHT *= 0.0254;
        double bmi = WEIGHT / (HEIGHT * HEIGHT);
        String result = "";
        if (bmi < 18.5) result += String.format("%.1f", bmi) + " Underweight";
        else if (bmi < 24.9) result += String.format("%.1f", bmi) + " Normal weight";
        else result += String.format("%.1f", bmi) + " Overweight";
        return result;
    }

    //Задача 6
    public static int bugger(int a){
        int count = 0;
        String tmp = Integer.toString(a);
        while (tmp.length() != 1){
            int num = 1;
            for (int i = 0; i < tmp.length(); i++){
                num *= Integer.parseInt(Character.toString(tmp.charAt(i)));
            }
            tmp = Integer.toString(num);
            count++;
        }
        return count;
    }

    //Задача 7
    public static String toStarShorthand(String str){
        if (str.equals("")) return "";
        char c = str.charAt(0);
        String result = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) != c){
                if (count != 1) result += c + "*" + Integer.toString(count);
                else result += c;
                c = str.charAt(i);
                count = 1;
            }
            else count++;
        }
        if (count != 1) result += c + "*" + Integer.toString(count);
        else result += c;
        return result;
    }

    //Задача 8
    public static boolean doesRhyme(String string1, String string2){
        char t1 = string1.charAt(string1.length() - 1)
                , t2 = string2.charAt(string2.length() - 1);
        if (!Character.isAlphabetic(string1.charAt(string1.length() - 1))) t1 = string1.charAt(string1.length() - 2);
        if (!Character.isAlphabetic(string2.charAt(string2.length() - 1))) t2 = string2.charAt(string2.length() - 2);
        return t1 == t2;
    }

    //Задача 9
    public static boolean trouble(long a, long b){
        String A = Long.toString(a);
        String B = Long.toString(b);
        String tmp = "";
        for (int i = 2; i < A.length(); i++){
            if (A.charAt(i) == A.charAt(i - 1) && A.charAt(i) == A.charAt(i - 2)) tmp += A.charAt(i);
        }
        for (int i = 0; i < tmp.length(); i++){
            for (int j = 1; j < B.length(); j++){
                if (B.charAt(j) == B.charAt(j - 1) && B.charAt(j) == tmp.charAt(i)) return true;
            }
        }
        return false;
    }

    //Задача 10
    private int countUniqueBooks(String book, String uniq) {
    int count = 0;
    boolean bookStart = false;
    String books = "";
    for (int i = 0; i < book.length(); i += 1) {
      if (book.substring(i, i + 1).equals(uniq)) {
        bookStart = !bookStart;
        if (!bookStart) {
          books = "";
        }
        continue;
      }
      if (bookStart) {
        if (!books.contains(book.substring(i, i + 1))) {
          count += 1;
          books += book.substring(i, i + 1);
        }
      }
    }
    return count;
  }
}
