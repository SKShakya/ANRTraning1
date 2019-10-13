package p1;

public class ComputePI {
	public ComputePI(){
		System.out.println("******ComputePI********");
	}
	public void sum(int range){
		double sum =0.0;
		for(int i=1;i<=range;i++){
			if(i%4==1)
				sum +=(double)1/i;
			else if(i%4==3)
				sum -=(double)1/i;
			
			
		}
		sum =sum*Math.PI;
		System.out.println("Compute PI Sum is :"+sum);
	}

}
