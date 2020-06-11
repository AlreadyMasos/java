import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;


public class task5{
	public static void main(String[] args){
	
		System.out.println();   //<-введите функцию 

	}


	//задача 1
	public static int[] encrypt(String str){
		int[] mas = new int[str.length() - 1];
        n[0] = str.charAt(0);
        for (int i = 1; i < str.length() - 1; i++){
            mas[i] = str.charAt(i - 1) -  str.charAt(i);
        }
        return mas;
	}

	public static String decrypt(int[] arr){
        String str = "";
        str += (char) arr[0];
        for (int i = 1; i < arr.length; i++){
            str += (char) (arr[i] - arr[i-1]);
        }
        return str;
    }

    //задача 2
    public static boolen canMove(String what, String start, String end){

    	boolean can = false;
        int first = Math.abs(start.charAt(0) - end.charAt(0));
        int second = Math.abs(start.charAt(1) - end.charAt(1));
        switch (piece){
            case "ладья":
                if((first == 0 && second != 0)
                        || (first != 0 && second == 0))can = true;
                break;
            
            case "слон":
          		if(first == second)can = true;
            	break;
                
          
           	case "ферзь":
                if((first == 0 && second != 0) ||(first != 0 && second == 0)|| first == second)can = true;
                break;      
               	
            
            case "Pawn":
                if((first == 1 && second <= 1) || (first == 2 && second == 0))can = true;
                break;

               	
            
            case "король":
                if(first <= 1 && second <= 1) can = true;
                break;
                
            
            case "конь":
            	if((first == 2 && second == 1) || (first == 1 && second == 2)) can = true;
                break;
            
               
            default:
            
                break;
        }
        return can;
    }


    //задача 3

    public static boolean canComplete(String firstWord, String secondWord){
        int i = 0;
        for (int j = 0; j < secondWord.length(); j++){
            if(firstWord.charAt(i) == secondWord.charAt(j)){
                i++;
            }
            if(i == firstWord.length())return true;
        }
        return  false;
    }

    //задача 4

    private int sumDigProd(int ... vals) {
    int result = 0;
    for (int i = 0; i < vals.length; i += 1) {
      result += vals[i];
    }
    while (String.valueOf(result).length() > 1) {
      int val = 1;
      for (int i = 0; i < String.valueOf(result).length(); i += 1) {
        val *= Character.getNumericValue(String.valueOf(result).charAt(i));
      }
      result = val;
    }
    return result;
  }

  		//задача 4
public static int sumDigProd(int[] arr){
        int k = 0;
        for (int value : a) k += value;
        int stand = k;
        while (k > 9) {
            stand = stand * (k % 10);
            k = k / 10;
            if (k < 10) {
                stand = stand * (k % 10);
                k = stand;
                stand = 1;
            }
        }
        return k;
    }
    	//Задача 5
    	public static Object[] sameVowelGroup(String[] input){
        String alphVowels = "aAeEiIoOuUyY";
        String[] check = new String[input.length];
        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < input.length; i++){
            check[i] = "";
            for (int j = 0; j < input[i].length(); j++) {
                if (alphVowels.indexOf(input[i].charAt(j)) != -1 && check[i].indexOf(input[i].charAt(j)) == -1) check[i] += input[i].charAt(j);
            }
        }
        for (int i = 0; i < check.length; i++){
            int stand = 0;
            for (int j = 0; j < check[i].length(); j++){
               if (check[0].indexOf(check[i].charAt(j)) != -1) stand++;
               if (stand == check[0].length()) result.add(input[i]);
            }
        }
        return result.toArray();
    }

    //Задача 7

    public static String numToEng(int num){
    	String a = "";
    	String b = "";
    	String c = "";
 		
    	switch(num % 10){
    		case 1:
    		a = "one";
    		break;
    		
    		case 2:
    		a = "two";
    		break;
    		
    		case 3:
    		a = "three";
    		break;

    		case 4:
    		a = "four";
    		break;

    		case 5:
    		a = "five";
    		break;

    		case 6:
    		a = "six";
    		break;

    		case 7:
    		a = "seven";
    		break;

    		case 8:
    		a = "eight";
    		break;

    		case 9:
    		a = "nine";
    		break;
    	}

    	num = num/10;
    	switch(num%10){
    		case 1:
                switch (first){
                    case "":
                        first = "ten";
                        break;


                    case "one":
                        first = "eleven";
                        break;


                    case "two":
                        first = "twelve";
                        break;


                    case "three":
                        first = "thirteen";
                        break;


                    case "four":
                        first = "fourteen";
                        break;


                    case "five":
                        first = "fifteen";
                        break;


                    case "six":
                        first = "sixteen";
                        break;
                    case "seven":
                        first = "seventeen";
                        break;


                    case "eight":
                        first = "eighteen";
                        break;


                    case "nine":
                        first = "nineteen";
                        break;


                }
                break;


            case 2:
                second = "twenty";
                break;


            case 3:
                second = "thirty";
                break;


            case 4:
                second = "forty";
                break;


            case 5:
                second = "fifty";
                break;


            case 6:
                second = "sixty";
                break;


            case 7:
                second = "seventy";
                break;


            case 8:
                second = "eighty";
                break;


            case 9:
                second = "ninety";
                break;


        }
        num = num / 10;
        switch (num % 10){
            case 1:
                third = "one hundred";
                break;


            case 2:
                third  = "two hundred";
                break;


            case 3:
                third  = "three hundred";
                break;


            case 4:
                third  = "four hundred";
                break;


            case 5:
                third  = "five hundred";
                break;


            case 6:
                third  = "sex hundred";
                break;


            case 7:
                third  = "seven hundred";
                break;


            case 8:
                third  = "eight hundred";
                break;


            case 9:
                third  = "nine hundred";
                break;


        }

        return third + second + first;
    
    }

    //задача 8

    public static String getSha256Hash(String message){
        StringBuffer result = new StringBuffer();
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(message.getBytes(StandardCharsets.UTF_8));
            for (int i = 0; i < hash.length; i++) {
                String str = Integer.toHexString(0xff & hash[i]);
                if(str.length() == 1) result.append('0');
                result.append(str);
            }
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result.toString();
    }

    //задача 9

    public static String correctTitle(String title){
        String[] result = title.split(" ");
        title = "";
        for (int i = 0; i < result.length; i++){
            if (i == 0 || i == 1 || i == 2 || i == result.length - 1) {
                result[i] = result[i].substring(0, 1).toUpperCase() + result[i].substring(1).toLowerCase();
                title += result[i] + " ";
            }
            else title += result[i].toLowerCase() + " ";
        }
        return title;
    }

    //задача 10

    public static String hexLattice(int num){
        double n = (3 + Math.sqrt(12 * num - 3)) / 6;
        int max = (int) Math.floor(num / n);
        if (max % 2 == 0) max--;
        String result = "";
        boolean check = false;
        if (n % 1 == 0) {
            int MAX = max;
            int MIN = (int) n;
            for (int j = 0; j < MAX; j++) {
                for (int i = 0; i < MAX - MIN; i++) result += " ";
                for (int i = 0; i < MIN; i++) result += "o ";
                result += "\n";
                if (MIN == MAX) check = true;
                if (check) MIN--;
                else MIN++;
            }
        }
        else result += "Invalid";
        return result;
    }

    //задача 6

    public static boolean validateCard(String num){
        if(num.length() > 19 || num.length() < 14)return false;
        int checkDigit = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));
        int sum = 0;
        for (int i = 0; i < num.length() - 1; i++){
            int temp = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1 - i)));
            if(i % 2 != 0)temp = temp * 2;
            if(temp > 10){
                sum += temp % 10;
                temp = temp / 10;
                sum += temp % 10;
            }
            else sum += temp;
        }
        if(10 - (sum % 10) == checkDigit)return true;
        return false;
    }

}
    





