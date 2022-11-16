
public class test2 {
	public static void main(String[] args) {
		System.out.println("Outputs 1-50 divisible by 5:");
		for (int i = 1; i <= 50; i++) {
			if (i % 5 != 0)
			continue;//using continue
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
