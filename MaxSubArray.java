import acm.program.ConsoleProgram;

public class MaxSubArray extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] nums = new int[n];
    	for(int i = 0; i < n; i++){
    		nums[i] = readInt("Enter the " + (i + 1) + "-th number of the array: ");
    	}
    	int ans = maxSubArray(nums);
    	println(ans);
    }

	private int maxSubArray(int[] nums) {
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
