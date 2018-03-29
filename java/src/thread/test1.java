package thread;

public class test1 extends Thread{
	private int num;
	@Override
	public void run() {
		//
		while(num<1000)
		System.out.println(num++);
		try {
		Thread.sleep(500);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		super.run();
		}
	public test1(int num)
	{
		this.num=num;
	}
	
	public static void main(String[] args)
	{
		test1 a = new test1(1);
		a.start();
		test1 b = new test1(2);
		b.start();
		
	}
}
