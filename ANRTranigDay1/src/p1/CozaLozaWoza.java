package p1;

public class CozaLozaWoza {
	public CozaLozaWoza() {
		System.out.println("*****CozaLozaWoza*****");
	}
	public void print(){
	for(int i=0;i<10;i++){
		for(int j =1;j<=11;j++){
			int num =(i*10)+j+i;
			if(num%15==0)
				System.out.print("CozaLoza");
			
			if(num%3==0)
				System.out.print("Coza");
			
			if(num%5==0)
				System.out.print("Loza");
			
			if(num%7==0)
				System.out.print("Woza");
			
			else
			System.out.print(num+" ");
			
		}
		System.out.println();
		}	
	}

}
