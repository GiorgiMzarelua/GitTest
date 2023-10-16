import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram{
    public void run(){
    	float num = readInt("ENTER THE NUMBER: ");
    	int ans1 = 0;
        for(ans1 = 0; ans1 < num; ans1++){
        	
        }
    	float ans2 = num - ans1;
    	println("INTEGER PART OF THE NUMBER: " + ans1);
    	print("FRACTIONAL PART OF THE NUMBER " + ans2);
    }
}
