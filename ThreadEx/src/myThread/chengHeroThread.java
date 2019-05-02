package myThread;

public class chengHeroThread extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		 for(int i=1;i<10;i++)
		   System.out.println("程咬金发起对隋朝军队的攻击"+i+"次！");
		   System.out.println("程咬金停止进攻！");
		   System.out.println("战争结束，农民起义军打败隋朝军队！");
	}
}
