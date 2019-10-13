package p1;

public class SumOfSquear {
	public SumOfSquear(){
		System.out.println("*****Sum of Squear &largest divisor *******");
	}
	public void sum(int rang){
		int sum =0;
		for(int i =1;i<=rang;i++){
			sum =sum+i*i;
		}
		System.out.println("Sum of Squear: " +sum);
		int temp  =sum;
		while(temp-->1){
			if(sum%temp==0){
				System.out.println("Larger divisor: "+temp);
				break;
			}
			temp--;
		}
	}

}
