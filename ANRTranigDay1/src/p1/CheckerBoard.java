package p1;

public class CheckerBoard {
	public CheckerBoard() {
		System.out.println(" *****CheckBoard******");
	}
	public void printBoard(int l){
		for(int i =0;i<l;i++){
			for(int j =0;j<l;j++){
				if((i+j)%2==0)
					System.out.print("1 ");
				else
				System.out.print(" 0 ");
				
					
			}
			System.out.println();
		}
	}

}
