import java.util.Random;
import java.util.Scanner;


public class test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int random=ran.nextInt(1000);
		
		int i=0;
		while(true){
			i++;
			if(i==11){
				System.out.print("�㲻��Ŷ��");
				break;
				
			}
			System.out.print("pelase����һ��0~1000�����֣�");
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			if(num<random)
				System.out.print("̫С�ˣ����ģ�");
			else if(num>random)
				System.out.print("̫���ˣ�ɵ����");
			
			
			else{
				System.out.print("GOOD!��ϲ�������");
				System.exit(4);
			}
		}
	}

}
