import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RandomSort extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	ArrayList<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(5);
    	list.add(2);
    	list.add(214);
    	list.add(32);
    	list.add(76);
    	list.add(854);
    	list.add(23566);
    	list.add(7435);
    	list.add(93);
    	int[] array = new int[list.size()];
    	array = randomSort(list);
    	println(Arrays.toString(array));
    }
	private int[] randomSort(ArrayList<Integer> list) {
		boolean[] sortCheck = new boolean[list.size()];
		boolean[] sortCheck2 = new boolean[list.size()];
		int[] newList = new int[list.size()];
		int n = rgen.nextInt(0, list.size() - 1);
		int m = rgen.nextInt(0, list.size() - 1);
		sortCheck[n] = true;
		sortCheck2[m] = true;
		while(true){
			while(sortCheck[n] != true && sortCheck2[m] != true){
				n = rgen.nextInt(0, list.size() - 1);
				m = rgen.nextInt(0, list.size() - 1);
				if(sortCheck[n] == false && sortCheck2[m] == false){
					sortCheck[n] = true;
					sortCheck2[m] = true;
					newList[m] = list.get(n);
				}
			}
			int counter = 0;
			for(int i = 0; i < list.size(); i++){
				if(sortCheck[i] == false) {
					counter++;
					break;
				}
			}
			if(counter == list.size() - 1 && sortCheck[counter] == true){
				return newList;
			}
		}
	}
}
