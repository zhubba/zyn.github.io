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
				System.out.print("你不行哦！");
				break;
				
			}
			System.out.print("pelase输入一个0~1000的数字：");
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			if(num<random)
				System.out.print("太小了，甜心！");
			else if(num>random)
				System.out.print("太大了，傻狗！");
			
			
			else{
				System.out.print("GOOD!恭喜答对啦！");
				System.exit(4);
			}
		}
	}

}
