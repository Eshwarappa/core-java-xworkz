class Aeroplane{
	
	//Instance variable  
	
	String name ;
	String noOfSeats ;
	double cast ;
	
	public Aeroplane()
	{
		
		System.out.println("invoked Aeroplane");
		
	}
	
	public Aeroplane(String name,String noOfSeats)
	{
	this(599.99);
	this.name = name ;
	this.noOfSeats =noOfSeats ;
	}
	
	public Aeroplane(double cast)
	{
		
		this.cast = cast ;
		
	}

	
	
}