class Materials{
	
	static String material [] = {"Iron","Cast Iron","Steel","High carbon Steel","low CarbalSteel",};
	
	
	public static void main(String[] esha)
	{
		
		System.out.println(material.length);
		System.out.println(material[0]+"\n"+material[1]+"\n"+material[2]+"\n"+material[3]);
		
		for(int MaterialIndex=material.length-1;MaterialIndex<material.length;MaterialIndex--)
		{
			System.out.println(material[MaterialIndex]);
		}
		
		
		
	}
	
	
}