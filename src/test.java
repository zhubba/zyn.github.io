
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100-999�е�ˮ�ɻ���:");
		for (int i = 100; i < 1000; i++) {
			if ((i / 100) * (i / 100) * (i / 100) + (i / 10 % 10)
					* (i / 10 % 10) * (i / 10 % 10) + (i % 10) * (i % 10)	* (i % 10) == i) {
				System.out.println(i);
				System.out.println("��");
			}
		}

	}

}
