import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem60 extends ConsoleProgram{
    public void run(){
    	 ArrayList <Integer> intList = new ArrayList <Integer>();
    	 int counter = 0;
    	 while(true){
    		 int n = readInt("Enter the number: ");
    		 if(n == -1){
    			 break;
    		 }
    	     intList.add(n);
    	 }
    	 for(int i  = intList.size() - 1; i >= 0; i--){
    		 int n = intList.get(i);
    		 println("this is the " + (i + 1) + "-th element of this arraylist: " + n);
    	 }
    }    
}
