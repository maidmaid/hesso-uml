package hotel;

import java.util.ArrayList;

public class Room
{
	private int number;
	private boolean isAvailable;
	private Hotel hotel;
	private ArrayList<Booking> bookings;
	
	public Room(int number)
	{
		
	}
	
	public Room(Hotel hotel)
	{
		this.hotel = hotel;
	}
}
