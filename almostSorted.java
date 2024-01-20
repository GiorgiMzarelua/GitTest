//ამოცანა 3. (20 ქულა) თითქმის დასორტირებული
//მთელი რიცხვების არაილისტს ეწოდება დასორტირებული თუკი მისი ყოველი
//მომდევნო ელემენტი წინაზე მეტია ან ტოლი.
//მთელი რიცხვების არაილისტს ეწოდება თითქმის დასორტირებული თუკი შემდეგი
//ორი ოპერაციით შეგვიძლია მისგან დასორტირებული არაილისტი მივიღოთ:
//1. ორ ელემენტს გაუცვალეთ ადგილი.
//მაგალითად ამ ოპერაციით არაილისტისგან {5,4,3,2,1} შეგვიძლია მივიღოთ
//{1,4,3,2,5} - პირველ და ბოლო ელემენტს გავუცვალეთ ადგილი.
//2. აირჩიეთ ორი რიცხვი 0<=i<j<N სადაც N არაილისტში ელემენტების
//რაოდენობაა. და ელემენტები ინდექსებით, i,i+1, …, j შემოატრიალეთ, ისე,
//რომ იმავე ადგილას იყვნენ ოღონდ შებრუნებული მიმდევრობით: j,j-1, … i.
//მაგალითად ამ ოპერაციით არაილისტისგან {1,4,3,2,5} შეგვიძლია მივიღოთ
//{1,2,3,4,5} ანუ i=1, j=3, შესაბამისად {4,3,2} შემოვატრიალეთ.
//თქვენი ამოცანაა დაწეროთ sorted მეთოდი რომელსაც გადაეცემა არაილისტი და
//რომელიც აბრუნებს true-ს თუკი ეს არაილისტი თითქმის დასწორტირებულია,
//წინააღმდეგ შემთხვევაში კი false-ს.
//გაითვალისწინეთ, რომ ჯერ პირველი ოპერაცია უნდა შეასრულოთ ერთხელ და მერე
//მეორე ასევე ერთხელ.
//მაგალითად:
//sorted({2,3,4,5})->true {2,3,4,5} -> {3,2,4,5} -> {2,3,4,5}
//sorted({4,1,3,2})->true {4,1,3,2} -> {1,4,3,2} -> {1,2,3,4}
//sorted({3,1,5,2,4})->false არ მოიძებნება ასეთი ორი ოპერაცია.
//ამოხსნა დაწერეთ sorted.java ფაილში
import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class almostSorted extends ConsoleProgram{
    public void run(){
    	ArrayList<Integer> list = new ArrayList<>();
    	while(true){
    		int n = readInt();
    		if(n == 0){
    			break;
    		}
    		else{
    			list.add(n);
    		}
    	}
    	println(isSorted(list));
    }

	private boolean isSorted(ArrayList<Integer> a) {
		for(int i = 0; i < a.size() - 1; i++){
			for(int j = i + 1; j < a.size(); j++){
				ArrayList<Integer> swappedList = swap(a, i, j);
				for(int p = 0; p < a.size() - 1; p++){
					for(int q = p + 1; q < a.size(); q++){
						ArrayList<Integer> reversedList = reverse(swappedList, p, q);
						for(int k = 1; k < a.size(); k++){
							if(reversedList.get(k) < reversedList.get(k - 1)){
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	private ArrayList<Integer> reverse(ArrayList<Integer> swappedList, int p, int q) {
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for(int i = 0; i < p; i++){
			reversed.add(swappedList.get(i));
		}
		for(int i = q; i >= p; i--){
			reversed.add(swappedList.get(i));
		}
		for(int i = q + 1; i < swappedList.size(); i++){
			reversed.add(swappedList.get(i));
		}
		return reversed;
	}

	private ArrayList<Integer> swap(ArrayList<Integer> a, int i, int j) {
		ArrayList<Integer> swapped = new ArrayList<Integer>();
		for(int p = 0; p < a.size(); p++){
			if(p == i){
				swapped.add(a.get(i));
			}
			else if(p == j){
				swapped.add(a.get(j));
			}
			else {
				swapped.add(a.get(p));
			}
		}
		return swapped;
	}
}
