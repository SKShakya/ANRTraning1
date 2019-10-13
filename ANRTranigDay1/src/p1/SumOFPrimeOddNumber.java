package p1;

public class SumOFPrimeOddNumber {
	public SumOFPrimeOddNumber(){
		System.out.println("*****SumOfPrimeOddNumber******");
	}
	public void sumOfOddPrime(int start,int end){
		int sum =0;
		for(int i =start;i<=end;i++){
			if(isPrime(i)&&isOdd(i)){
					sum =sum+i;
				
			}
				
		}
		System.out.println("Sum of Odd Prime in Given Rang is :"+sum);
	}
	public static boolean isPrime(int n){
		if(n==0||n==1)
			return false;
		for(int i =2;i*i<=n;++i)
			if(n%i==0){
				//System.out.println(i);
				return false;
			}
		return true;
		
	}
	public static boolean isOdd(int n){
		boolean b =false;
		if(n%2!=0)
			b =true;
		return b;
	}

}
