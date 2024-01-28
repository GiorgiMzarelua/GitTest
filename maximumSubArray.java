import acm.program.ConsoleProgram;

public class maximumSubArray extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of number: ");
    	int[] nums = new int[n];
    	for(int i = 0; i < n; i++){
    		nums[i] = readInt("Enter the " + (i + 1) + "-th number: ");
    	}
    	int ans = maxSub(nums);
    	println("This is the answer: " + ans);
    }

	private int maxSub(int[] nums) {
		int ans = nums[0];
		for(int i = 0; i < nums.length; i++){
			for(int j = i; j < nums.length; j++){
				int sub = sub(i, j, nums);
				if(ans < sub) ans = sub;
			}
		}
		return ans;
	}

	private int sub(int i, int j, int[] nums) {
		int sub = 0;
		for(int k = i; k <= j; k++){
			sub += nums[k];
		}
		return sub;
	}
}
