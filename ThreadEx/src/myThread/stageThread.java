package myThread;

public class stageThread extends Thread {
	
	public void run(){
		ArmyThread army=new ArmyThread();
		ArmyThread farmer=new ArmyThread();
		Thread armyThread=new Thread(army, "隋朝军队");
		Thread farmerThread=new Thread(farmer,"农民起义军");
		chengHeroThread cheng=new chengHeroThread();
		cheng.setName("程咬金");

		farmerThread.start();
		armyThread.start();
		try {
			Thread.sleep(30);//舞台线程休眠让另两个线程运行完
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		army.stop=true;
		farmer.stop=true;
		System.out.println(cheng.getName()+"登场");

		cheng.start();
	    try {
			cheng.join();//等待该线程终止才结束本线程。
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
     public static void main(String[] args) {
 		System.out.println("舞台大幕徐徐拉开，精彩好戏将要上映!");

    	stageThread stage=new stageThread();
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	stage.start();
    	
     }
}
