package Project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	int busno;
	String passengerName;
	Date date;
	Booking(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger");
		passengerName = scanner.next();
		System.out.println("Enter bus no:");
		busno = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
		public boolean isAvailable(ArrayList<Booking>Bookings,ArrayList<Bus>buses) {
			int capacity = 0 ;
			for(Bus bus:buses) {
				if(bus.getBusno()==busno) {
					capacity = bus.getCapacity();
				}}
				
				int booked = 0; 
				for(Booking b:Bookings) {
					if(b.busno==busno && b.date.equals(date)) {
						booked++;
					}}
				
			return booked<capacity?true:false;
		}
	}


