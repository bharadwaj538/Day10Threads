package ai.jobiak.threads;

public class MyThreads  extends Thread{
	String name;
	
	MyThreads(String name){
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<10;i++)
			System.out.println(this.name+"#entered run()="+i);
	}
}
