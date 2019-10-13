package p1;

import java.text.NumberFormat;

public class HarmonicSum {
	public HarmonicSum() {
		System.out.println("*****HarmonicSum******");
	}
	public void sum(int rang){
		NumberFormat nf=NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(2);
		double sumL2R =0.0;
		double sumR2L =0.0;
		for(int i =1;i<=rang;i++){
			sumL2R += (double)1/i;
		}
		for(int j =rang;j>0;j--){
			sumR2L +=(double)1/j;
		}
		System.out.println("Sum L2R :"+nf.format(sumL2R));
		System.out.println("Sum R2L :"+nf.format(sumR2L));
		double d =sumL2R-sumR2L;
		System.out.println("L2R-R2L :"+nf.format(d));
		
	}

}
