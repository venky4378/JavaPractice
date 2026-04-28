class Vehicle{
	String brand;
	Vehicle(String brand){
		this.brand = brand;
//		System.out.println("Brand : "+ this.brand);
		
	}
}

class Car extends Vehicle{
	Car(String brand,int price){
		super(brand);
		//System.out.println("Price: "+price);
	}
}

class ElectricCar extends Car{
	ElectricCar(String brand,int price,String battery){
		super(brand,price);
		System.out.println("Brand : "+ brand);
		System.out.println("Price : "+ price);
		System.out.println("battery : "+battery);
		
		
	}
	
	
}



public class CarDetails {

	public static void main(String[] args) {
		System.out.println("main method called");
		
		ElectricCar e = new ElectricCar("Tata",500000,"150000kwh");
	
		
		// TODO Auto-generated method stub

	}

}
