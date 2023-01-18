package com.jdc.mkt.ocp;

public class OpenClosedPrinciples {

	public static void main(String[] args) {
		
		HotelCharges hc = new HotelCharges();
		
		Room sg = new SingleRoom();
		sg.setCharge(3000);
		double sig = sg.getHotelCharges();
		System.out.println(sig);
		
		Room dr =new DoubleRoom();
		dr.setCharge(4000);	
		double dou = dr.getHotelCharges();
		System.out.println(dou);
		
	}
}

class HotelCharges{
	
//	public double getHotelCharges(Room room) {
//		return room.getCharge();
//	}
	
	
//	public double getHotelCharges(Room room) {
//		
//		if(room instanceof SingleRoom) {
//			return room.getCharge()*3;
//		}else if(room instanceof DoubleRoom) {
//			return room.getCharge()*5;
//		}else {
//			return room.getCharge();
//		}
//	}

}

class Room {
	
	private double charge;

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	public double getHotelCharges() {
		
		return getCharge();
	}
	
}

class SingleRoom extends Room{
	
	@Override
	public double getHotelCharges() {
		
		return getCharge()*3;
	}
}

class DoubleRoom extends Room{
	@Override
	public double getHotelCharges() {
		
		return getCharge()*4;
	}
}

class FamilyRoom extends Room{
	
	@Override
	public double getHotelCharges() {
		
		return getCharge()*5;
	}
}
