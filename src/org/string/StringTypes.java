package org.string;

public class StringTypes {
	
	public static void main(String[] args) {
		
//      String Literals -->  Same Memory Address for duplicate value	
		String s1= "Cat";
		String s2= "Cat";
		System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        
        System.out.println("***************");
        
	
//		non String Literals --> Different Memory Address for duplicate value
        String s3= new String("Milk");	
        String s4= new String("Milk");	
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        
        System.out.println("**************");
        
//      Immutable String --> Same as String Literals but when action(Concat) performed
//      it doesn't share the same memory address   
        String s5=s1.concat(s2);
        System.out.println(System.identityHashCode(s5));
        
        System.out.println("****************");
        
//      Mutable String --> Same as Non String Literals but when action(append)
//      performed, it shares the same memory address.
        StringBuilder s6=new StringBuilder("Cat Milk");
        StringBuilder s7=new StringBuilder("Cat Milk");
        
        StringBuilder s8 = s6.append(s7);
        
        System.out.println(System.identityHashCode(s6));
        System.out.println(System.identityHashCode(s7));
        System.out.println(System.identityHashCode(s8));
		
	}

}
