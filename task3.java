public class task3{
	public static void main(String[] args){
		System.out.println(checkPerfect(97));
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
	/*Задача
	3. Создайте функцию, которая проверяет, является ли целое число совершенным
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