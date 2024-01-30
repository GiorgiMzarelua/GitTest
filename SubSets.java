import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class SubSets extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + "-th number of the array: ");
    	}
    	ArrayList<ArrayList<Integer>> list = allPossibleSubsets(array);
    	println(list);
    	
    }

	private ArrayList<ArrayList<Integer>> allPossibleSubsets(int[] nums) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(new ArrayList<Integer>());
		for(int num : nums){
			int length = list.size();
			for(int i = 0; i < length; i++){
				ArrayList<Integer> newList = new ArrayList(list.get(i));
				newList.add(num);
				list.add(newList);
			}
		}
		return list;
	}
}
