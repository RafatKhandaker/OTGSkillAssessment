import java.util.BitSet;


/*
    Write Java function that takes an int as a parameter and returns the number of 1's in the binary expression of that parameter.
*/

public class App 
{
	
    public static void main( String[] args ){
    	
    	System.out.println( "Total number of 1's in binary expression of int is: " + 
    			+countOnes(16, 0, new BitSet()) 
    	);
    }
 
    
    public static int countOnes(int x, int cnt, BitSet bits){
    	int i = cnt;
    	BitSet bitties = bits;
    	
    	if( (x/2) < 1) { 
    		bitties.set( ++i );
    		return bitties.cardinality(); 
    	}
    	
    	if((x%2) == 1) { 
    		bitties.set( ++i );
    		return countOnes((x/2), i, bitties );
    	} 
  
        return countOnes((x/2), i, bitties);
    }

/*
    Program to remove duplicate elements from list.
    ****************************************************************************************
      for this the main issue is to compare two object reference in memory
      Checking reference type and value does not fix issue,  I compared using
      the individual data values
    ****************************************************************************************
*/
    
    public static List<Employee> newEmployeeList( 
            List<Employee> employees
            ){
        HashSet<Employee> hList = new HashSet<Employee>();
        
        for(Employee e : employees){
            boolean inList = false; 
            
            for(Employee hE : hList){
                if(hE.getId() == e.getId() && hE.getName() == e.getName() ) {  
                    inList = true; break; 
                    }
            }
            
            if(!inList) { hList.add(e); }
            
        }   
        
        return new ArrayList<Employee>(hList);
    }  


}
