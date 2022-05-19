import java.util.*;
public class AmusementPark {
	static void AmusementPark(){
		Scanner sc=new Scanner(System.in);
		int ticket_price=400;
		System.out.println("#########-Welcome To Amusement Billing Counter-########" );
		System.out.println("\nDay Pass       :INR 400/Person.");
		System.out.print("Num of Ticket  : ");
		int num=sc.nextInt();
		if(num<=9) {
			System.out.println("Purchase ticket: "+num+"\nFinal Price    :INR "+(int)(num*400));
		}else if(num>=10) {
			float d=(int)(0.01*(num*400));	
			float dp=(int) (num*400-d);
			System.out.println("You qualify for 10% discount!");
			System.out.println("Final Price is  : INR "+dp);
		}
	}
	public static void main(String[] args) {
		AmusementPark();
		}
	}


