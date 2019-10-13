package p1;

public class SumOf7Divisor {
	public SumOf7Divisor() {
		System.out.println("***** Sum Of 7Divisor*****");
	}
	public void sum(int rang){
		int s =0;
		for(int i=1;i<=rang;i++)
			if(i%7==0)
				s +=i;
		System.out.println(s);
	}

}
