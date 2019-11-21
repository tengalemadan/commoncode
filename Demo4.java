package lambda;

public class Demo4 {
	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("thread 1");
				}
				
			}
		};
		
		Runnable r= ()->{for (int i = 0; i < 5; i++)
					System.out.println("thread 2");};
					
					r.run();
					r1.run();
	}

}
