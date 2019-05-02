package myThread;

public class ArmyThread implements Runnable {
   public boolean stop=false;
   public void run() {
		// TODO Auto-generated method stub
	   while(!stop){
	   for(int i=1;i<6;i++){
	       System.out.println(Thread.currentThread().getName()+"进攻对方"+i+"次！");
	 	   Thread.yield();//暂停当前正在执行的线程对象，并执行其他线程。
	       }
	   }
	   System.out.println(Thread.currentThread().getName()+"停止进攻！");
	}
    
}
