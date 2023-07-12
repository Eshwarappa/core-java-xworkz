class IceCreamTester{

public static void main(String  cream[]){

IceCream.intoFlavors("venilla");
IceCream.intoFlavors("strawberry");
IceCream.intoFlavors("chacolate");
IceCream.intoFlavors("buttered pecan");
IceCream.intoFlavors("cookies");
IceCream.intoFlavors("kulfi");

         IceCream.getFlavorsName();

         boolean updateName = IceCream.updateFlavorsName("strawberry","redberry");
         System.out.println(updateName);
    IceCream.getFlavorsName();
    
    System.out.println("Before deleting");
    IceCream.getFlavorsName(); 
    int newIndexLength =  IceCream.deleteFlavorName("cookies");
    System.out.println("After deleting");
    IceCream.getFlavorsName(); 
        //System.out.println(newIndexLength);
    //IceCream.getFlavorsNamePostDeletion();
}

}