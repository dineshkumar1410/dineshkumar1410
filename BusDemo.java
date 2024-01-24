package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,52));
		buses.add(new Bus(3,false,25));
		int UserOption=1;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusInfo();
		}

		while(UserOption==1) {
			System.out.println("Enter 1 to booking and 2 to exit");
			UserOption=scanner.nextInt();
			if(UserOption==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("your booking is conformed");
				}
				else {
					System.out.println("sorry,bus if full.Try another bus or date");
				}
			}
		}
	}

}
