package p1;

public class Fibonacci {
	public Fibonacci(){
		System.out.println("******Fibonaci*****");
	}
	public void printSeries(int limit){
		int e =limit;
		int t1 =1;
		int t2= 1;
		int sum =t1+t2;
		System.out.print(t1+" "+t2+" ");
		while(limit-->2){
			int s =t1+t2;
			sum =sum+s;
			System.out.print(s+" ");
			t1 =t2;
			t2 =s;
			
		}
		System.out.println();
		double avg =sum/e;
		System.out.println("Avg :"+avg);
	}

}
