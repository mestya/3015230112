package triangle;

public class Triangle {

  public boolean judgeEquilateral(int a,int b,int c ){
		if (a > 0 && b > 0 && c > 0 && a + b >= c && a + c >= b && b + c >= a) {
            if (a == b && b == c) {
      
            	return true;
            } 
            return false;
       }
		return false;
  }		
		
  public boolean judgeIsosceles(int a,int b,int c){
	  if (a > 0 && b > 0 && c > 0 &&a + b >= c && a + c >= b && b + c >= a) {
          if (a == b || a == c || b == c) {
          	
          	return true;
          } 
          return false;
     }
		return false;
  
} 
  
  public boolean judgeScalene(int a,int b,int c){
	  if(a > 0 && b > 0 && c > 0 &&a + b >= c && a + c >= b && b + c >= a){
		  if( a != b && b != c && a != c ){
			  return true;
		  }
		  return false;
	  }
	  return false;
  }

} 

	

