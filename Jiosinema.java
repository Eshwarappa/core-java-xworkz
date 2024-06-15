 class Jiosinema {
  
  
   String kannadaMovies []= {"Kantara","Nathicharami","Govida Govinda","Minchu Muruli","Sakath"};
  static String teluguMovies []= {"DJ","Vaathi","Virupaksha","Dasara","Sir","Beast"};
  static String tamilMovies []={"Abhimanyudu","Aaryan","japan","Revolver Rita","Irugapatru"};
  static String hindiMovies []={"Kathal","Khufiya","Guns and Gulaabs","Tu Jhoothi Main Makkaar","Chakda Xpress",};
  static String englishMovies []={"Kill Boksoon","Murder Mystery 2","Luther","The Magician’s Elephant","Dear David"};
  
  
  public static void main(String[] platforms){
    
   // System.out.println(kannadaMovies[0] +" "+kannadaMovies[1]+" "+kannadaMovies[2]+" "+kannadaMovies[3]+kannadaMovies[4]);
    
	
	//getKannadaMovies();
	//getTeluguMovies();
	
	
  Jiosinema jio = new Jiosinema();
  
	System.out.println(jio.kannadaMovies.length);
	
    for(int kannadaIndex=0;  kannadaIndex<jio.kannadaMovies.length; kannadaIndex++ ) {
    System.out.println(jio.kannadaMovies[kannadaIndex]);
  }
 
  
  for(int teluguIndex=0; teluguIndex<Jiosinema.teluguMovies.length; teluguIndex++){
    System.out.println("teluguMovies++++++++++"+Jiosinema.teluguMovies[teluguIndex]);
  }
  
  for(int tamilIndex=0; tamilIndex<tamilMovies.length; tamilIndex++){
    System.out.println(tamilMovies[tamilIndex]);
  }
  
  for(int hindiIndex=0; hindiIndex<hindiMovies.length;  hindiIndex++){
  System.out.println(hindiMovies[hindiIndex]);
  }
  
  for(int englishIndex=0; englishIndex<englishMovies.length; englishIndex++){
  System.out.println(englishMovies[englishIndex]);
  }
}

}