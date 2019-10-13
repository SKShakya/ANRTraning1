package p1;

public class CheckGrade {
	int marks;
	public CheckGrade(){
		System.out.println("*****CheckGrade******");
		
	}
	public void check(int marks){
		if(marks<60)
			System.out.println("F");
		
		if(71<=marks&&marks<=80)
			System.out.println("B");
		
		if(81<=marks&&marks<=100)
			System.out.println("A");
		
		if(61<=marks&&marks<=70)
			System.out.println("C");
		else
			System.out.println("Invelid Marks ");
		
	}

}
