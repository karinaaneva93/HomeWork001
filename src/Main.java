import java.util.Scanner;

public class Main {
	/*
	 * Напишете вашата първа програма на Java, която да извежда на екрана
	 * следния текст: Hello World! This is my first program!
	 */
	public static void task1() {

		System.out.println("Hello World! This is my first program!");

	}

	/*
	 * Напишете програма, която чете от конзолата 2 числа от тип int и отпечатва
	 * тяхната сума.
	 */
	public static void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first number");
		int firstNum = sc.nextInt();
		System.out.println("Insert second number");
		int secondNum = sc.nextInt();
		int sum = firstNum + secondNum;
		System.out.println("Sum of numbers is: " + sum);

	}

	/*
	 * Напишете програма, която приема две цели числа - съответно страната и
	 * височината на триъгълник. Пресметнете лицето на дадения триъгълник и я
	 * изведете на конзолата.
	 */
	public static void task3(int a, int h) {
		int face = (a * h) / 2;
		System.out.print("Face is: " + face);

	}

	/*
	 * Напишете проргама която приема 2 целочислени числа за вход и извежда
	 * остатъка от делението на числата.
	 */
	public static void task4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert dividend ");
		int dividend = sc.nextInt();
		System.out.print("Insert divisor ");
		int divisor = sc.nextInt();
		int remainder = dividend % divisor;
		System.out.print("remainder of division is: " + remainder);

	}

	/*
	 * Напишете програма, която приема 2 символни низа (string) като вход, и
	 * изведете като резултат конкатениран string със „_“ между двата входни
	 * низа.
	 */
	public static void task5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string1 ");
		String niz1 = sc.nextLine();
		System.out.print("Insert string2 ");
		String niz2 = sc.nextLine();
		System.out.println(niz1 + "_" + niz2);

	}

	/*
	 * Напишете програма, която приема реално число като вход, и изкарва на
	 * конзолата резултата от делението му с цяло число.
	 */
	public static void task6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert real number ");
		float dividend = sc.nextFloat();
		System.out.print("Insert divisor ");
		int divisor = sc.nextInt();
		float result = dividend / divisor;
		System.out.print("Result: " + result);

	}

	// Напишете програма, която приема два стринга като вход. След това
	// проверява дали 2рия стринг се съдържа в 1вия. Покажете резултата от
	// проверката на конзолата
	public static void task7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string1 ");
		String niz1 = sc.nextLine();
		System.out.print("Insert string2 ");
		String niz2 = sc.nextLine();
		Boolean result = niz1.contains(niz2);
		System.out.println(result);

	}

	/*
	 * Напишете програма, която приема стринг от конзолата, и извежда N-тия
	 * символ от стринга, като резултат. *
	 */
	public static void task8(int index) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert string ");
		String niz1 = sc.nextLine();
		char indexS = niz1.charAt(index);
		System.out.print("Symbol number  " + index + " of string is: " + indexS);

	}

	/*
	 * Напишете булев израз, който да проверява дали даден низ от символи
	 * (String) е равен на „Hello”. Отпечатайте в конзолата резултата от
	 * проверката. *
	 */
	public static void task9() {
		String string = "Hello";
		String string1 = "HelloWorld";

		System.out.println("string equals to Hello:" + string.equals("Hello"));
		System.out.println("string1 equals to Hello:" + string1.equals("Hello"));

	}

	public static void main(String[] args) {

		task1();
		task2();
		task3(5, 6);
		task4();
		task5();
		task6();
		task7();
		task8(2);
		task9();

	}

}
