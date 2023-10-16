import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram{
	public void run(){
		 int n = readInt("ENTER THE FIRST NUMBER: ");
		 int m = readInt("ENTER THE SECOND NUMBER: ");
		 int ans = 1;
		 for(int i = 1; i <= m; i++)
		 {
			 ans = ans * n;
		 }
		 print("THIS IS THE ANSWER: " + ans);
	}
}
