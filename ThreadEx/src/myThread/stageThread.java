package myThread;

public class stageThread extends Thread {
	
	public void run(){
		ArmyThread army=new ArmyThread();
		ArmyThread farmer=new ArmyThread();
		Thread armyThread=new Thread(army, "�峯����");
		Thread farmerThread=new Thread(farmer,"ũ�������");
		chengHeroThread cheng=new chengHeroThread();
		cheng.setName("��ҧ��");

		farmerThread.start();
		armyThread.start();
		try {
			Thread.sleep(30);//��̨�߳��������������߳�������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		army.stop=true;
		farmer.stop=true;
		System.out.println(cheng.getName()+"�ǳ�");

		cheng.start();
	    try {
			cheng.join();//�ȴ����߳���ֹ�Ž������̡߳�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
     public static void main(String[] args) {
 		System.out.println("��̨��Ļ�������������ʺ�Ϸ��Ҫ��ӳ!");

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
