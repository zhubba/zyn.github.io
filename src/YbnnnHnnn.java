
public class YbnnnHnnn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b;//��λ
		int t;//ʮλ
		int h; //��λ
		int s; //��λ���ֵ�����֮��
        int count=0;//ͳ��ˮ�ɻ�������
        
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
        System.out.println("[100~999]��ˮ�ɻ�����"+count+"��");
	}

}
