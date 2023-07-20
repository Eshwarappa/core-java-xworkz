class Materialss{
	
	static String materialName[] = {"Iron","Steel","Brass","Bronz","Titanium"};
	
	
	public static void getmaterials()
	{
		
		for(int materialIndex=materialName.length-1;materialIndex<materialName.length;materialIndex--)
		{
			
			System.out.println(materialName[materialIndex]);
			
		}
		
	}
	
	public static void main(String[] esha)
	{
		Materialss.getmaterials();
		
		
	}
	
	
	
}