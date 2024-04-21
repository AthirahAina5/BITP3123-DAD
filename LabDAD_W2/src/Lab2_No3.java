import java.util.Scanner; 
public class Lab2_No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		System.out.println("How many mark you want to insert: ");
		int numMarks = scanner.nextInt();
		
		
		double sum = 0 ;
		for(int i = 1 ; i <= numMarks ; i++) {
		System.out.println("Please enter mark no "+ i + ":");
		double mark = scanner.nextDouble();	
		sum += mark;
		
		System.out.println("Mark : "+mark + " has been inserted");
		
		
		}
		
		System.out.println("Total mark is :"+sum);
		
		
		

	}

}
