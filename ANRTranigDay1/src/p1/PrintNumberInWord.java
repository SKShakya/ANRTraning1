package p1;

public class PrintNumberInWord {
	public PrintNumberInWord(){
		System.out.println("******PrintNumberInword*******");
	}
	public void print(int number){
		switch(number){
		case 1:System.out.println("One");break;
		case 2:System.out.println("Two");break;
		case 3: System.out.println("Three");break;
		case 5: System.out.println("Five");break;
		case 6: System.out.println("Six");break;
		case 7: System.out.println("Sevian");break;
		case 8: System.out.println("Eight");break;
		case 9: System.out.println("Nine");break;
		default: System.out.println("Other");break;
		
		}
	}

}
