package ai.jobiak.threads;

public class Threading {

	public static void main(String[] args) {
		System.out.println("Started main....");
		
		MyThreads t1=new MyThreads("t1");
		MyThreads t2=new MyThreads("t2");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		//t1.run();
		//t2.run();
		t1.start();
		t2.start();
		
		System.out.println("exit main....");

	}

}
