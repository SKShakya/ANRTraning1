package p1;

public class SquareBoard {
	public SquareBoard(){
		System.out.println("*****SquarBoard******");
	}
	public void printBord(int limit){
		for(int i=1;i<=limit;i++){
			for(int j =1;j<=limit;j++){
				if(i==1 ||i==limit)
					System.out.print("*");
				
				else
					if(j<3 ||j>4)
						System.out.print("*");
					
					else
						System.out.print(" ");
					
					
				
			}
			System.out.println();
		}
	}

}
