import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//ამოცანა 2. (20 ქულა) მატრიცის განულება
//დაწერეთ მეთოდი zero რომელსაც გადაეცემა ორგანზომილებიანი ინტების
//მასივი(მატრიცა), რომელიც არაფერს არ აბრუნებს და რომელიც გადაცემულ
//მატრიცას “ანულებს”.
//განულების წესი შემდეგია: თუკი თავდაპირველ მატრიცაში სადმე გვხვდება 0
//მაშინ მატრიცის მთელი ის სვეტი და სტრიქონი უნდა განულდეს. მაგალითად:
//თუკი მეთოდს გადაეცა მატრიცა:
//[[1, 0, 3, 4],
// [5, 6, 7, 8],
// [9, 0, 1, 2]]
//მაშინ მეთოდმა იგი უნდა შეცვალოს შემდეგნაირად:
//[[0, 0, 0, 0],
// [5, 0, 7, 8],
// [0, 0, 0, 0]]
//ამ ამოცანის გადასაჭრელად არ შექმნათ მასივები(მატრიცებიც) და ArrayListები.
//ამოხსნა დაწერეთ zero.java ფაილში
public class matritsiGanuleba extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int[][] matrix = {{1, 0, 3, 4},
    			          {5, 6, 7, 8},
    			          {9, 0, 1, 2}};
    	int n = 3;
    	int m = 4;
    	int k = rgen.nextInt();
    	while(true){
    		int counter = 0;
    		int q = 0;
    		for(int p = 0; p < n; p++){
    			for( q = 0; q < m; q++){
    				if(matrix[p][q] == k){
    					counter = 0;
    					break;
    				}
    				counter++;
    			}
    			q = 0;
    			if(matrix[p][q] == k){
    				counter = 0;
					break;
				}
    		}
    		k = rgen.nextInt();
    		if(counter == n * m){
    			break;
    		}
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			if(matrix[i][j] == 0){
    				for(int p = 0; p < n; p++){
    					matrix[p][j] = k;
    				}
    				for(int q = 0; q < m; q++){
    					matrix[i][q] = k;
    				}
    			}
    		}
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			if(matrix[i][j] == k){
    				matrix[i][j] = 0;
    			}
    		}
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			println(matrix);
    		}
    	}
    }
}
