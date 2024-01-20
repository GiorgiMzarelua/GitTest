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
    	for(int i = 0; i < s.length() - 1; i++){
    		while(s.charAt(i) == s.charAt(i + 1)){
    			counter++;
    			i++;
    		}
    		ans += s.charAt(i) + counter;
    		counter = 1;
    	}
        if(s.charAt(s.length() - 1) != s.charAt(s.length() - 2)){
        	ans += s.charAt(s.length() - 1) + 1;
        }
        println(ans);
    }
}
