package myThread;

public class ArmyThread implements Runnable {
   public boolean stop=false;
   public void run() {
		// TODO Auto-generated method stub
	   while(!stop){
	   for(int i=1;i<6;i++){
	       System.out.println(Thread.currentThread().getName()+"�����Է�"+i+"�Σ�");
	 	   Thread.yield();//��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
	       }
	   }
	   System.out.println(Thread.currentThread().getName()+"ֹͣ������");
	}
    
}
