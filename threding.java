import java.util.Random;
class Sample extends Thread
{
	public void run(){
		int num;
		Random r = new Random();
		try{
			for(int i=1;i<5;i++){
				num=r.nextInt(100);
				System.out.println("Main thread:"+num);
				if(num%2==0){
					Thread t1=new Thread(new xsqure(num));
					t1.start();
				}
				else{
					Thread t2=new Thread(new xcube(num));
					t2.start();
				}
				Thread.sleep(1000);
				System.out.println("---------------------------------");
			}

		}catch(Exception e){
				System.out.println(e);
				e.getMessage();
			}
	}
}
class xsqure implements Runnable
{
	public int x;
	public xsqure(int x){
		this.x=x;
	}
	public void run(){
		System.out.println("Child Thread: xsqure of " +x+ " = "+(x*x));
	}
}

class xcube implements Runnable
{
	public int x;
	public xcube(int x){
		this.x=x;
	}
	public void run(){
		System.out.println("Child Thread: xcube of " +x+ " = "+(x*x*x));
	}
}
class Main7{
	public static void main(String args[]){
		Sample s = new Sample();
		s.start();
	}
}