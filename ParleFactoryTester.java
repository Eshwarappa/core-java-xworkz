class ParleFactoryTester{
	
	
	public static void main(String[] esha)
	{
		
		ParleFactory parle = new ParleFactory(20,10,50);
		
		System.out.println(parle.name+"\n"+parle.quantity+"\n"+parle.price+"\n"+parle.noOfBiscuits);
		
		ParleFactory M = new ParleFactory(50,25,75);
		
		System.out.println(M.name+"\n"+M.quantity+"\n"+M.price+"\n"+M.noOfBiscuits);
		
		ParleFactory S = new ParleFactory(100,50,200);
		
		System.out.println(ParleFactory.name+"\n"+S.quantity+"\n"+S.price+"\n"+S.noOfBiscuits);
		
	}
	
}