package beans;

public class Address {
	private String village,thana,district;

	public Address(String village, String thana, String district) {
		super();
		this.village = village;
		this.thana = thana;
		this.district = district;
	}
	@Override
	public String toString() {
		return "Village: "+village+"\nThana: "+thana+"\nDistrict: "+district ; 
	}
}
