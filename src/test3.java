import java.util.Random;
import java.util.Scanner;


public class test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int random = ran.nextInt(1000);
		System.out.println("random=" + random);
		Scanner scan = new Scanner(System.in);
		int num;
		int i = 0;
		while (true) {
			i++;
			if (i == 999) {
				System.out.println(i + ":" + "Exit");
				break;
			}
			System.out.println(i + "st " + "Input num:");
			num = scan.nextInt();
			if (num < random) {
				System.out.println("Too small");
			} else if (num > random) {
				System.out.println("Too big");
			} else {
				System.out.println("All right");
				break;
				// System.exit(0);
			
			}
		}

	}

}
