import java.util.Scanner;

public class swapTheValue {

	public static void main(String[] args) {

		/*
		 * Write a program that prompts user to enter to enter the numbers till the user
		 * wants (by asking if user wants to continue) and at the end the program should
		 * display the largest and smallest numbers entered.
		 */

		double num, largestNum, smallestNum = 0;

		Scanner user = new Scanner(System.in);
		// boolean keepAsk = true;
		String keepGoing;

		System.out.println("Enter the number: ");

		num = user.nextDouble();

		largestNum = num;
		// container = num;

		System.out.println("Do you want to continue y/n");

		keepGoing = user.next();

		if (keepGoing.equals("y")) {

			System.out.println("Enter the number: ");
			num = user.nextDouble();
			if (num > largestNum) {
				smallestNum = largestNum;
				largestNum = num;
			} else if (num < largestNum) {
				smallestNum = num;
			}else if (num == largestNum) {
				smallestNum = num;
			}

			System.out.println("Do you want to continue y/n");
			keepGoing = user.next();

			while (keepGoing.equals("y")) {

				System.out.println("Enter the number: ");
				num = user.nextDouble();
				if (num > largestNum) {
					largestNum = num;
				} else if (num < smallestNum) {
					// largestNum = smallestNum;
					smallestNum = num;
				}else if (num == smallestNum) {
					smallestNum = num;
				}else if (num == largestNum) {
					largestNum = num;
				}
				System.out.println("Do you want to continue y/n");
				keepGoing = user.next();
				if (keepGoing.equals("y")) {
					continue;
				} else if (keepGoing.equals("n")) {

					System.out.println(largestNum);
					System.out.println(smallestNum);
					return;
				}

			}

		} else if (keepGoing.equals("n")) {

			largestNum = smallestNum;
			System.out.println(largestNum);
			System.out.println(smallestNum);

		}

	}

}
