public class Conditions {

    public static void main(String[] args) {
        //System.out.print("HI");
      String name ="srinivas"; 
      // if condition 
      // if condition checks only true statements block 

      if(name=="srinivas") // condition check 
      {
        // true block 
        System.out.println("Both are equal");
      }

      // if-else  : true and false blocks 

      if(name=="Srinivas") // srinivas == Srinivas -> 
      {
        // true block
        System.out.println("Matched");
      }
      else 
      {
        // false block 
        System.out.println("Not Matched");

      }

    // else-if  : number of true blocks then false block

    int speed = 150; 

    if (speed<30) // <30
    {
        System.out.print("low speed"); 
    } 
    else if (speed>=30 && speed <=60) // 30-60
    {
        System.out.print("Avg speed"); 
    }
    else if (speed>60 && speed <=100) // 60-100
    {
        System.out.print("good speed");  
    }
    else  // >100
    {
        System.out.print("High speed"); 
    }

    }
}
