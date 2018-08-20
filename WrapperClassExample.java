                  //what are the Wrapper Classes ?


/* A wrapper class is a class whose object wraps or contains a primative data types.
i.e. we can wrap a primative value into a wrapper class object.

                             WHY NEED OF WTAPPER CLASSES

                 1. They convert primative data types into objects.
                 2.The classes in java.util package handles only objects and
                    hence wrapper classes help in this case also.
                 3. Data structures in the collection framwork,such as
                    ArrayList and Vector  store only objects(reference types)
                    and not primative types 
                 4.An object is needed to support synchronization in multithreading.
                 

Primative data types and thier corresponding Wrapper class

PRIMATIVE DATATYPE                        WRAPPER CLASS
   char                                      Character
   byte                                       Byte
   long                                       Integer
   short                                      Short                                    
   boolean                                    Boolean
   float                                      Float
   double                                     Double

                     AutoBoxing and Unboxing

Autoboxing: Automatic conversion of primative types to the object of their corresponding wrapper classes is known as autoboxing.
             For example convertion of int to Interger,double to Double etc. 
             

import java.util.ArrayList;
class Autoboxing {
	public static void main(String[] args) {
		char ch='c';
		//Autoboxing-primative to Character object conversion
		 Character c=ch;
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 //Autoboxing because ArrayList stores only objects
		 arrayList.add(70);
		 arrayList.add(67);
		 //printig the value from object
		 System.out.println(arrayList.get(0));
		 		 System.out.println(arrayList.get(1));



		
	}

}

Unboxing:It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing.
       For example – conversion of Integer to int, Long to long, Double to double etc.

       
       import java.util.ArrayList;
class Unboxing {
	public static void main(String[] args) {
		
		Character ch='c';
		
		//unboxing- Character object to primative  conversion
		char c=ch;
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 
		 arrayList.add(67);
		 		 //unboxing because get method return integer object
                int no=arrayList.get(0);


		 //printig the value from primative datatypess
		 System.out.println(no);
		 	



		
	}

}
*/