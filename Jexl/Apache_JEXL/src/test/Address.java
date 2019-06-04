package test;

public class Address {

	private int addressNum;
	private String city;
	
	public Address(int addressNum, String city) {
		super();
		this.addressNum = addressNum;
		this.city = city;
	}
	
	public int getAddressNum() {
		return addressNum;
	}
	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addressNum=");
		builder.append(addressNum);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	
}
