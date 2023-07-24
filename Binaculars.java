class Binaculars{
	
	String typeOfLense ;
	String brandName ;
	double price ;
	
	public Binaculars()
	{
		
		System.out.println("Binaculars constructore is invoked");
		
	}
	
	public Binaculars(String typeOfLense,String brandName)
	{
		
		this(1500.00);
		this.brandName = brandName ;
		this.typeOfLense = typeOfLense ;
	}
	
	public Binaculars(double price)
	{
		
		this.price = price ;
		
		
	}
	
}