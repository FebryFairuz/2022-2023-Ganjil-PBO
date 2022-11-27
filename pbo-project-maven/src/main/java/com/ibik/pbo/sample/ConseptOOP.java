package com.ibik.pbo.sample;

//sample of Encapsulation
class Person{
	private Integer NIK;
	private String Fullname;
	private String Gender;
	private String PlaceBirth;
	private String BirthDate;
	private Double Weight;
	private Integer Height;
	
	public Integer getNIK() { //getter => method untuk menangkap nilai baru pada atribute
		return NIK;
	}
	public void setNIK(Integer nIK) { //setter => method untuk mengisi nilai pada atribute
		NIK = nIK;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPlaceBirth() {
		return PlaceBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		PlaceBirth = placeBirth;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	public Double getWeight() {
		return Weight;
	}
	public void setWeight(Double weight) {
		Weight = weight;
	}
	public Integer getHeight() {
		return Height;
	}
	public void setHeight(Integer height) {
		Height = height;
	}
	
	public void Outfit() {
		System.out.print("Shirtless");
	}
}


//sample inheritance
class Children extends Person{
	private Integer position;
	private String etnic;
	
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getEtnic() {
		return etnic;
	}
	public void setEtnic(String etnic) {
		this.etnic = etnic;
	}
	
}


class Student extends Person{
	public void Outfit() {
		System.out.print("Jas + Kemeja + Celana panjang");
	}
}

class HomeBoys extends Person{
	public void Outfit() {
		System.out.print("Baju oblong");
	}
}


public class ConseptOOP {

	public static void main(String[] args) {
		Children mychild = new Children();
		//input data
		mychild.setNIK(123456);
		mychild.setFullname("Febri D Fairuz");
		mychild.setGender("Male");
		mychild.setPlaceBirth("Bogor");
		mychild.setBirthDate("29-02-1992");
		mychild.setWeight(65.8);
		mychild.setHeight(170);
		mychild.setPosition(1);
		mychild.setEtnic("Sunda");
		
		//output
		System.out.println("\tSample of Inheritance and Encapsulation\n");
		System.out.println("=From class Person=");
		System.out.println("NIK: "+mychild.getNIK());
		System.out.println("Fullname: "+mychild.getFullname());
		System.out.println("Gender: "+mychild.getGender());
		System.out.println("Place/Birthdate: "+ mychild.getPlaceBirth()+"/"+mychild.getBirthDate()  );
		System.out.println("Weight/Height: "+ mychild.getWeight()+"/"+mychild.getHeight());
		System.out.println("\n=From class Children (inheritance from Person)=");
		System.out.println("Position of child: "+ mychild.getPosition());
		System.out.println("Etnic: "+mychild.getEtnic());
		System.out.print("Outfit: ");
		mychild.Outfit();
		
		
		
		//Sample Polymorpish
		System.out.println("\n\n\tSample of Polymorphism\n");
		Person anakSekolah = new Student();
		anakSekolah.setNIK(321456);
		anakSekolah.setFullname("Febri D Fairuz");
		
		//output
		System.out.println(anakSekolah.getFullname()+" as Student");
		System.out.println("NPM: "+anakSekolah.getNIK());
		System.out.print("Outfit: ");
		anakSekolah.Outfit();System.out.println();
		
		Person anakRumahan = new HomeBoys();
		anakRumahan.setFullname("Febri D Fairuz");
		
		//output
		System.out.println("\n"+anakRumahan.getFullname() + " as Homeboy");
		System.out.print("Outfit:");
		anakRumahan.Outfit();
		
	}

}
