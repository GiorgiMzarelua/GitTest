import acm.program.ConsoleProgram;

public class containerWithTheMostWater extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the length of array: ");
    	int[] height = new int[n];
    	for(int i = 0; i < n; i++){
    		height[i] = readInt("Enter the height of the wall: ");
    	}
        int ans = maxWater(height);
        println(ans);
    }

	private int maxWater(int[] height) {
		int max = 0;
	    int i = 0;
	    int j = height.length - 1;
	    while(i != j){
	        int area = (j - i) * (Math.min(height[i],height[j]));
	        max = Math.max(max,area);
	        if(height[i] < height[j]){
	            i++;
	        }
	        else{
	            j--;
	        }
	    }
	    return max;
    }
}
