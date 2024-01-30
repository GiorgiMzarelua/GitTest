import acm.program.ConsoleProgram;

public class JumpGame extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the length of array: ");
    	int[] nums = new int[n];
    	for(int i = 0; i < n; i++){
    		nums[i] = readInt("Enter the " + (i + 1) + "-th number: ");
    	}
    	boolean cappableOfJumping = canJump(nums);
    	println(cappableOfJumping);
    }

	private boolean canJump(int[] nums) {
		int curDestination = nums.length - 1;
		for(int i = nums.length - 2; i >= 0; i--){
			if(i + nums[i] >= curDestination) curDestination = i;
		}
		return curDestination == 0;
	}
}
