public class Operators {
   public static void main(String[] args) {

       // Arthematic  + - * / ** %
       int x=20;
       int y=7; 

       int addition= x+y; // addition
       int subtraction =x-y; // subtraction
       int multiplication =x*y; // multiplication
       int divison =x/y;  // divison
       int modulous = x%y; // reminder value

       System.out.println("Addition is..." + addition);
       System.out.println("Subtraction is..." + subtraction);
       System.out.println("Multiplication is..." + multiplication);
       System.out.println("divison is..." + divison);
       System.out.println("modulous is..." + modulous);

    // logical 
    // logical and (&&), logical or (||) , logical not (!=)

    // logical and : 
    // True && True -> True 
    // True && False -> False 
    // False && True -> False 
    // False && False -> False 
    // if both statements are True then result will be True ..

    //logical or (||)
    // True || True -> True 
    // True || False -> True 
    // False || True -> True 
    // False || False -> False 
    // If any one of the statement is true result will be true 

    System.out.println( (12>3)&&(34<56) ); // t && t -> t

    // relational : < <=  >  >= 

    System.out.println(34>56); //false 
    System.out.println(34>=34); //true 
    
    // inc /dec   ++  -- 

    int a=100; 
    System.out.println(a);
    System.out.println(a++); // post increment operator 
    System.out.println(a);
    System.out.println(--a); //pre decrement operator 

    // assignment    = 
    String name = "srinivas"; // = assignment operator 
    System.out.println(name); 
    String name1 = name + " G "; 
    System.out.println(name1); 

    // bitwise 
    // conditional 



   } 
}
