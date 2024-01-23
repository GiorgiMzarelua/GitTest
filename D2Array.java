//import acm.program.ConsoleProgram;
//
//public class D2Array extends ConsoleProgram{
//	private int[][] matrix2;
//    public void run(){
//    	int n = readInt("Enter the quantity of numbers: ");
//    	int[] array = new int[n];
//    	for(int i = 0; i < n; i++){
//    		array[i] = readInt("Enter the " + (i + 1) + "-th number: ");
//    	}
//    	int[][] matrix = create(array);
//    	println(matrix.toString());
//    }
//
//	private int[][] create(int[] array) {
//		for(int i = 0; i < array.length; i++){
//			for(int j = 0; j < array[i]; j++){
//				matrix2[i][j] = 0;
//			}
//		}
//		return matrix2;
//	}
//}

import acm.program.ConsoleProgram;

public class D2Array extends ConsoleProgram{
	public void run() {
		int array[] = {1, 2, 5 ,2};
		create(array);
	}

	private void create(int[] array) {
		String ans = "[";
		for(int i = 0; i < array.length; i++) {
			int current = array[i];
			ans += createStringForCurrent(current);
		}
		ans = ans.substring(0, ans.length() - 1);
		ans += "]";
		println(ans);
	}

	private String createStringForCurrent(int current) {
		String ans = "[";
		for(int i = 0; i < current; i++){
			ans += "0,";
		}
		ans = ans.substring(0, ans.length() - 1);
		ans += "],";
		return ans;
	}
}