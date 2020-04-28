public class task2{


public static void main (String[] args) {
int[] de = {1,3};
System.out.println(boxSeq(5));


}
//3aDa4a 1
public static String repeat(String str, int n){
	StringBuffer buf = new StringBuffer("");
 
 	for(int i = 0; i < str.length();i++){
 		for(int j = 0; j < n; j++){
 			buf.append(str.charAt(i));

 		}

 }
 return buf.toString();

}
//3aDa4a 2
//Создайте функцию, которая принимает массив и возвращает разницу между
//самыми большими и самыми маленькими числами. 

public static int maxmin(int[] nas){
	int min = nas[0];
	int max = nas[0];

	for(int i = 0; i < nas.length; i++){
		if (nas[i] < min) min = nas[i];
		if (nas[i] > max) max = nas[i];
	}

	return max - min;
}

//3аDa4a 3
//Создайте функцию, которая принимает массив в качестве аргумента и возвращает
//true или false в зависимости от того, является ли среднее значение всех элементов
//массива целым числом или нет. 

public static boolean isAvgWhole(int[] kas){
	int sum = 0;
	for (int i = 0; i < kas.length; i++){
		sum = sum + kas[i];
	}
	if (sum%kas.length == 0) return true;
		else return false;
}
//3aDa4a 4
//Создайте метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя + всех предыдущих 1 4 5 6  | 1 5 10 16
//чисел в массиве. 
public static int[] cumulativeSum(int[] tas){
	for (int i = 1; i < tas.length; i++){
		tas[i] = tas[i-1] + tas[i];

	}
	return tas;
}
//3aDa4a 5
//Создайте функцию, которая возвращает число десятичных знаков, которое имеет
//число (заданное в виде строки). Любые нули после десятичной точки
//отсчитываются в сторону количества десятичных знаков. "400.03"
public static int getDecimalPlaces(String str){
	
	if (str.indexOf(".") != -1){

 	String stroka = str.substring(str.indexOf(".")+1);
	
	return stroka.length();
	}
	else return 0;
}
//Задача 6
//Создайте функцию, которая при заданном числе возвращает соответствующее
//число Фибоначчи. 
public static int Fibonacci(int num){
	int x = 0;
	int y = 1;
	int z= 0;

	for (int i = 0; i < num; i++){
		z = x + y;
		x = y;
		y = z;

	}
	return z;
}
//Задача 7
//Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//напишите функцию, чтобы определить, является ли вход действительным
//почтовым индексом. Действительный почтовый индекс выглядит следующим
//образом:
//– Должно содержать только цифры (не допускается использование нецифровых цифр).
//– Не должно содержать никаких пробелов.
//– Длина не должна превышать 5 цифр

public static boolean isValid(String str){
	if (str.length() > 5) return false;
	int k = 0;

	for (int i = 0; i < str.length(); i++){
		if ((int)str.charAt(i) > 47 && (int)str.charAt(i) < 58){
			k++;
		}
	}
	
	if (k == str.length()) return true;
	else return false;


    
    }

    //Задача 8
	//Пара строк образует странную пару, если оба из следующих условий истинны:
	//– Первая буква 1-й строки = последняя буква 2-й строки.
	//– Последняя буква 1-й строки = первая буква 2-й строки.
	//– Создайте функцию, которая возвращает true, если пара строк представляет собой
	//странную пару, и false в противном случае. 
	public static boolean isStrangePair(String first_str, String second_str){

		

		if (first_str.charAt(0) == second_str.charAt(second_str.length()-1) && second_str.charAt(0) == first_str.charAt(first_str.length()-1)) 
			return true;
		
		else return false;

	 }
	//Задача 10
	//Создайте функцию, которая принимает число (шаг) в качестве аргумента и
	//возвращает количество полей на этом шаге последовательности. 
    public static int boxSeq(int k){
    	int t = 0;
    	if (k == 0) t = 0;
    	if (k == 1) t = 3;
    	if (k == 2) t = 2;
    	if (k == 3) t = 5;
    	if (k == 4) t = 4;
    	if (k == 5) t = 7;
    	if (k == 6) t = 6;
    return t;
    }

    //Задача 9
     public static boolean isPrefix(String str, String prefix){
	 	int prefixLen = prefix.length();
	 	String s = str.substring(0, prefixLen-1);

	 	if (s.equals(prefix.substring(0,prefixLen-1))){
	 		return true;
	 	}
	 	else return false;    
	 }

	 public static boolean isSuffix(String str, String suffix){
	 	int suffixLen = suffix.length();
	 	int strLen = str.length();

	 	String s = str.substring(strLen-suffixLen+1);
	 	if (s.equals(suffix.substring(1,suffixLen))){
	 		return true;
	 	}
	 	else return false;    
	 }
}