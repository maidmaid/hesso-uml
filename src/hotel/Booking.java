package hotel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;

public class Booking
{
	private int number;
	private Calendar bookingDate;
	private Calendar arrivalDate;
	private Calendar departureDate;
	private int personNbr;
	private Hotel hotel;
	private ArrayList<Room> rooms;
	
	public Booking(Hotel hotel, ArrayList<Room> rooms)
	{
		this.hotel = hotel;
		this.rooms = rooms;
	}
	
	public Booking(int number)
	{
		
	}
	
	private double calculateRoomPrice()
	{
		return 0;
	}
	
	private double calculateExtraPrive()
	{
		return 0;
	}
	
	private double calculateTotal()
	{
		// Ok c'est cool 
		return 0;
	}
}
