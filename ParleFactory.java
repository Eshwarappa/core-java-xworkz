class ParleFactory{
	
		static String name = "Parle-G";
		   int quantity ;
		   double price ;
		   int noOfBiscuits ;
		   
		   public ParleFactory(int quantity , double price , int noOfBiscuits)
		   {
			   
			   this.quantity = quantity ;
			   this.price = price ;
			   this.noOfBiscuits = noOfBiscuits ;
			   
			   
		   }
		   
	
		public void produceBiscuits()
		
		{
			
			System.out.println("biscuits");
			
		}
	
	
	
}