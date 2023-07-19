class HarlyDevidsons{
	
	String name ;
	double price ;
	String type ;
	 String engCapacity ;
	 String mileageArai;
	 String transmission;
	
	
	
	
	
	public HarlyDevidsons(String name,double price,String type,String engCapacity ,String  mileageArai,String transmission)
	{
		this.name = name;
		this.price = price;
		this.type = type;
		this.engCapacity  = engCapacity;
		this. mileageArai =  mileageArai;
		this.transmission = transmission;
		
		System.out.println("invoke characters");
		
	}
	
	
	public static void main(String[] esha)
	{
		
		HarlyDevid Character = new HarlyDevid("HarlyDevidson",200000.00,"Hero","440cc","35kmph","6speed");
		HarlyDevid Character1 = new HarlyDevid("HarlyDevidson X-44",300000.00,"Hero","440","30kmph","5speed");
		
		System.out.println(Character.name+"\n"+Character.price+"\n"+Character.type+"\n"+Character. engCapacity+"\n"+Character.mileageArai+"\n"+Character.transmission);
		System.out.println(Character1.name+"\n"+Character1.price+"\n"+Character1.type+"\n"+Character. engCapacity+"\n"+Character.mileageArai+"\n"+Character.transmission);
		
	}
	
	
	
	
}