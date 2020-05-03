public class task3{
	public static void main(String[] args){
		System.out.println(isKaprekar(297));
	}

	//Задача 1
	/*
	Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
	решения для действительных значений x. учитывая a, b и c, вы должны вернуть
	число решений в уравнение. 
	*/
	public static int solutions(int a, int b, int c){
		double d = b*b - 4 * a * c;
		if (d > 0) return 2;
		if (d == 0) return 1;
		if (d < 0) return 0;
	return 0;
}
	/*Задача 2
	Напишите функцию, которая возвращает позицию второго вхождения " zip " в
	строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
	быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
	произойти в строке.  
	*/
	public static int findZip(String str){
		str =  str.replaceFirst("zip","");
		if (str.contains("zip")) return str.indexOf("zip") + 3; 
		else return -1;
	}
	/*Задача 3 
	Создайте функцию, которая проверяет, является ли целое число совершенным
	числом или нет. Совершенное число - это число, которое можно записать как
	сумму его множителей, исключая само число.
	*/
	public static boolean checkPerfect(int a){

		int count = 0;
		for (int i = 1; i < a - 1; i++){
			if ((a % i) == 0) count += i;
		}
		if (count == a) return true;
		else return false;

	}
	/*Задача 4
	Создайте функцию, которая принимает строку и возвращает новую строку с
	заменой ее первого и последнего символов, за исключением трех условий:
	– Если длина строки меньше двух, верните "несовместимо".".
	– Если первый и последний символы совпадают, верните "два-это пара.". 
	*/
	public static String flipEndChars(String str){
		
		if (str.length() == 1) return "Incompatible";
		
		if (str.charAt(0) == str.charAt(str.length() - 1)) return "Two is a pair";
		
		return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
	}
	/*Задача 5
	Создайте функцию, которая определяет, является ли строка допустимым
	шестнадцатеричным кодом.
	*/
	public static boolean isValidHexCode(String str){
		
		if (str.length() > 7) return false;
		
		if (str.matches("#[a-fA-F0-9]+")) return true;
		
		else return false;
	}
	/*Задача 6
	Напишите функцию, которая возвращает true, если два массива имеют одинаковое
	количество уникальных элементов, и false в противном случае.  
	*/
	 public static boolean same(int[] a, int[] b){
        int unique1 = 0;
        int unique2 = 0;
        for (int i = 0; i < a.length; i++){
            int temp = -1;
            for (int j = 0; j < a.length; i++){
                if(a[i] == a[j])temp++;
            }
            unique1 += temp;
        }
        for (int i = 0; i < b.length; i++){
            int temp = -1;
            for (int j = 0; j < b.length; i++){
                if(b[i] == b[j])temp++;
            }
            unique2 += temp;
        }
        return a.length - unique1 == b.length - unique2;
    }

	//Задача 7
    //Числа Капрекара

    public static boolean isKaprekar(int a){
    	if (a == 1) return true;
    	int sq_a = a * a;
    	int count_digits = 0;
    	while (sq_a != 0){
    		count_digits++;
    		sq_a = sq_a / 10;
    	}
    	sq_a = a * a;

    	for (int r_digits = 1; r_digits < count_digits; r_digits++){

    		int equal_parts = (int) Math.pow(10,r_digits);

    		if (equal_parts == a) continue;

    		int sum = sq_a / equal_parts + sq_a % equal_parts;
    		if (sum == a) return true;
    	
    	}
    	return false;
    }
	

	/*Задача 8
	Напишите функцию, которая возвращает самую длинную последовательность
	последовательных нулей в двоичной строке. 
	*/

	public static String longestZero(String str){
		String[] tmp = str.split("1");
        String max = "";
        for (int i = 0; i < tmp.length; i++){
            if (tmp[i].length() > max.length()) max = tmp[i];
        }
        return max;
    }
	

 	/*Задача 9
	Если задано целое число, создайте функцию, которая возвращает следующее
	простое число. Если число простое, верните само число. 
	*/
	public static int nextPrime(int num){
		for (int i = 2; i < num; i++){
			if ((num % i) == 0){
				num ++;
				}
		}
		return num;
	}
	
	/*Задача 10
	Учитывая три числа, x, y и z, определите, являются ли они ребрами
	прямоугольного треугольника. 
	*/
	public static boolean rightTriangle(int a, int b, int c){
		if ((a * a == b * b + c * c) || (a * a + b * b == c * c) || (b * b == a * a + c * c)) return true;
		else return false;
	}
}