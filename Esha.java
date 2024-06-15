class Esha{
	
	
	
	String arr[] = {null,null, null,null};
	int index=0;
	
	public void get()
	{
		System.out.println("Before add");
		for(int index=0; index<arr.length; index++)
		{
			System.out.println(arr[index]);
		}
	}
	
	 public void add(String name)
	 {
	
		
		 if(name!=null)
		 {
			if(index<arr.length)
			{
	     		arr[index] = name;
				index++;
			}
				 
		}
			
	 }
	 
	 
	 public String read(String name)
	 {
		 String read = null;
		 if(name!=null)
		 {
			 for(int index=0; index<arr.length; index++)
			 {
				 if(arr[index]==name)
				 {
					 
					 System.out.println("available : "+name);
					 return read;
				 }
				 else
				 {
					  System.out.println("not available : " +name);
					  break;
				 }
			 }
		 }
		return read ;
	 }
	 
	
	 
	 public static void main(String[] args)
	 {
		 Esha es = new Esha();
		 es.get();
		es.add("MANJU");
		es.add("ESHA");
		es.add("KEERTHI");
		es.add("VENKI");
		 System.out.println("After adding : ");
		es.get();
		
		es.read("VENKI");
		
		//System.out.println(null);
		//System.out.println(Object(null));
		
		 
	 }
	
	
}