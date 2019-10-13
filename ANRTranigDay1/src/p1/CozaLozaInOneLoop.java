package p1;

public class CozaLozaInOneLoop {
	public void print(){
	for(int j =1;j<=110;j++){
		
		if(j%15==0)
			System.out.print("CozaLoza");
		
		if(j%3==0)
			System.out.print("Coza");
		
		if(j%5==0)
			System.out.print("Loza");
		
		if(j%7==0)
			System.out.print("Woza");
		if(j%11==0)
			System.out.println();
		
		else
		System.out.print(j+" ");
		
	}
	
	}	
}


