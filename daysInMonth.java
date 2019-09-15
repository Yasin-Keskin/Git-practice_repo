import java.util.Scanner;

public class daysInMonth {

	public static void main(String[] args) {

		/*
		 * Write a Java program to find the number of days in a month. Assume February
		 * has 29 days. Input: Input a month number: 2 Output : February has 29 days
		 */
		int month, days = 0;
		String monthInWord;

		Scanner input = new Scanner(System.in);
		System.out.println("Input a month number: ");
		month = (input.nextInt());
		switch (month) {
		case 1:
			monthInWord = "January";
			break;
		case 2:
			monthInWord = "Fabruary";
			break;
		case 3:
			monthInWord = "March";
			break;
		case 4:
			monthInWord = "April";
			break;
		case 5:
			monthInWord = "May";
			break;
		case 6:
			monthInWord = "June";
			break;
		case 7:
			monthInWord = "July";
			break;
		case 8:
			monthInWord = "August";
			break;
		case 9:
			monthInWord = "September";
			break;
		case 10:
			monthInWord = "October";
			break;
		case 11:
			monthInWord = "November";
			break;
		case 12:
			monthInWord = "December";
			break;
		default:
			System.out.println("INVALID INPUT");
			return;

		}

		for (int i = month; i <= 12; i++) {

			if (i == 2) {
				days = 29;
				break;
			} else if (i == 8) {

				days = 31;
				break;
			} else if (i > 8) {

				if (i % 2 == 0) {

					days = 31;
					break;

				} else {

					days = 30;
					break;

				}

			} else if (i < 8) {

				if (i % 2 == 0) {

					days = 30;
					break;

				} else {

					days = 31;
					break;

				}

			}

		}

		System.out.println(monthInWord + " has " + days + " days.");

	}

}