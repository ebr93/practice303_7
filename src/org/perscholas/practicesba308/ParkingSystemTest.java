package org.perscholas.practicesba308;

public class ParkingSystemTest {

	public static void main(String[] args) {
		HospitalParking hospitalTwenty = new HospitalParking(4);
		MallParking mallTwenty = new MallParking(0);
		
		HospitalParking hospitalMorning = new HospitalParking(5);
		MallParking mallMorning = new MallParking(16);
		
		HospitalParking hospitalNight = new HospitalParking(17);
		MallParking mallNight = new MallParking(23);
		
		System.out.println("Twenty Four----------------");
		System.out.println(hospitalTwenty.toString());
		System.out.println(mallTwenty.toString());
		
		System.out.println("Morning--------------------");
		System.out.println(hospitalMorning.toString());
		System.out.println(mallMorning.toString());
		
		System.out.println("Night----------------------");
		System.out.println(hospitalNight.toString());
		System.out.println(mallNight.toString());
	}

}

interface ParkingSystem {
	public static final double NIGHTLY = 30;
	public static final double MORNING = 20;
	public static final double TWENTY_FOUR = 45;

	public default double processTicket() {
		return MORNING;
	}
}

class HospitalParking implements ParkingSystem {
	private int time;
	private double surcharge;

	public HospitalParking(int time) {
		this.time = time;
		this.surcharge = 1.20;
	}

	@Override 
	public double processTicket() {
		if (this.time >= 0 && this.time < 5) return this.surcharge * TWENTY_FOUR;
		else if (this.time >= 5 && this.time < 17) return this.surcharge * MORNING;
		else if (this.time >= 17 && this.time <= 24) return this.surcharge * NIGHTLY;
		else return -1;
	}
	
	
	@Override
	public String toString() {
		return String.format("Price for hospital parking is $%,.2f", processTicket());
	}

}

class MallParking implements ParkingSystem {
	private int time;
	private double surcharge;

	public MallParking(int time) {
		this.time = time;
		this.surcharge = 1.10;
	}

	@Override 
	public double processTicket() {
		if (this.time >= 0 && this.time < 5) return this.surcharge * TWENTY_FOUR;
		else if (this.time >= 5 && this.time < 17) return this.surcharge * MORNING;
		else if (this.time >= 17 && this.time <= 24) return this.surcharge * NIGHTLY;
		else return -1;
	}
	
	@Override
	public String toString() {
		return String.format("Price for mall parking is $%,.2f", processTicket());
	}

}
