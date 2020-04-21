public class FirstTenTasks{
	public static void main(String[] args){
	}

	// task  1. остаток от деления
	public static int remainder(int val1, int val2){
		return val1 % val2;
	}

	// task  2.	площадь треугольника 
	public static int triArea(int osnovanie, int visota){
		return osnovanie*visota/2;
	}

	// task  3. курицы коровы свинюхи
	public static int animals(int chickens, int cows, int pigs){
		return 2*chickens + 4*cows + 4*pigs;
	}

	// task 4. проб прайз пей
	public static boolean profitableGamble(double prob, int prize, int pay){
		if (prob*prize > pay){
			return true;
		}
		else {
			return false;
		}
	}

	// task 5. калькулятор
	public static String operation(int result, int a, int b){
		String oper = "none";

		if (a + b == result){
			oper = "slojenie";
		}
		if (a - b == result ){
			oper = "vichitanie";
		}
		if (a / b ==  result){
			oper = "delenie";
		}
		if (a * b == result){
			oper = "umnojenie";
		}

		return oper;
	}

	// task 6. ASCII
	public static int ctoa(char bukva){
		return (int)bukva;
	}

	// task 7.	идеальное число
	public static int addUpTo(int k){
		int summa = 0;

		for (int i = k; i>= 0; i--){
			summa = summa + i;
		}

		return summa;

	}

	// task 8. ребра
	public static int nextEdge(int a, int b){
		return a+b-1;
	}

	// task 9. кубы массива
	public static int sumOfCubes(int[] arr){
		int summ = 0;
		for (int i = 0; i < arr.length; i++){
			summ = summ + (int)Math.pow(arr[i],3);
		}

		return summ;
	}



	// task 10. умножение и делимость
	public static boolean abcmath(int a, int b, int c){
		double s = a*Math.pow(2,b-1)*2;
		if (s % c == 0){
			return true;
		}
		else return false;
	}
}

	