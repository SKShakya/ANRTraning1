package p1;

public class SumAndAverage {
	public SumAndAverage(){
		System.out.println("******SumAndAverage*******");
	}
	public void sumAvg(int lower,int higer){
		int sum =0;
		double avg =0.0;
		int e =(higer-lower)+1;
		for(int i =lower;i<=higer;i++){
			sum =sum+lower++;
			
		}
		//int e =(higer-lower)+1;
		avg =sum/e;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}
	public void sumAvgByWhile(int lower,int higer){
		System.out.println("****Whileloop*****");
		int sum=0;
		double avg=0.0;
		int e =(higer-lower)+1;
		while(higer>=lower){
			
			sum =sum+lower++;
			
		}
		avg =sum/e;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}
	public void sumAvgByDoWhile(int lower,int higer){
		System.out.println("****DoWhileloop*****");
		int sum=0;
		double avg=0.0;
		int e =(higer-lower)+1;
		do {
			   sum += lower;
			   lower++;
			} while (lower <= higer);
		avg =sum/e;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		
		
	}

}
