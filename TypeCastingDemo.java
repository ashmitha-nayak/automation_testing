package javacoreproject;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Implicit Type casting
   int myInt=100;
   
   double myDouble = myInt;
   
   System.out.println("myInt :" +myInt);
   System.out.println("mydouble :" +myDouble);
	

//Explicit Type casting
   
   double anotherDouble = 9.5;
   
   int anotherInt =(int) anotherDouble;
   System.out.println("anotherdouble :" + anotherDouble);
   System.out.println("anotherInt :" +anotherInt);
	}
}