import acm.program.ConsoleProgram;

public class myPow extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the power: ");
    	double x = readDouble("Enter the number: ");
    	double ans = 1;
        if(n >= 0){
            for(int i = 0; i < n; i++){
            ans = ans * x;
            }
        }
        else{
            for(int i = 0; i > n; i--){
                ans = ans / x;
            }
        }
        println(ans);
    }
}
