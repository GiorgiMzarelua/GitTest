//ამოცანა 1. (15 ქულა) სტრინგების კომპრესირება
//დაწერეთ მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს ამ სტრინგის
//კომპრესირებულ ვერსიას შემდეგი წესით: ნაცვლად ერთმანეთის მიმდევრობით
//გამეორებული სიმბოლოებისა წერს სიმბოლოს და შემდეგ მის რაოდენობას.
//მაგალითად:
//“aabcccccaa” -> “a2b1c5a2”.
//“wwwaaaage” -> “w3a4g1e1”
//იმ შემთხვევაში თუ ამ წესით კომპრესირებული სტრინგი უფრო გრძელია ვიდრე
//საწყისი, მეთოდმა უნდა დააბრუნოს საწყისი სტრინგი უცვლელად. მაგალითად:
//“abc”-ს კომპრესირებული ვერსიაა “a1b1c1”, რომელიც თავდაპირველზე უფრო
//გრძელია, ამიტომ მეთოდი დააბრუნებს “abc”.
//ამოხსნა დაწერეთ compress.java ფაილში
import acm.program.ConsoleProgram;

public class stringshiAsoebisRaodenoba extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the string: ");
    	String ans = "";
    	int counter = 1;
    	ans += "" + s.charAt(0);
    	if(s.equals("")){
    		println("");
    	}
    	else{
    		for(int i = 1; i < s.length(); i++){
        		if(s.charAt(i) == s.charAt(i - 1)){
        			counter++;
        		}
        		else{
        			ans += counter;
        			counter = 1;
        			ans += s.charAt(i);
        		}
        	}
    		println(ans);
    	}
    }
}
