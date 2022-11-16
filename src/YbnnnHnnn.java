
public class YbnnnHnnn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b;//个位
		int t;//十位
		int h; //百位
		int s; //各位数字的立方之和
        int count=0;//统计水仙花的数量
        
        for (int i=100;i<=999;i++){
        	b=i % 10;
        	t=(i/10)%10;
        	h=i/100;
        	s=b*b*b+t*t*t+h*h*h;
        	if(i==s){
        		count++;
        		System.out.println("i="+i);
        	}
        }
        System.out.println("[100~999]的水仙花数有"+count+"个");
	}

}
