import java.util.Arrays;

import acm.program.ConsoleProgram;

public class StringSort extends ConsoleProgram{
  public void run(){
	  String[] stringArray = new String[3];
	  stringArray[0] = "aba";
	  stringArray[1] = "abdc";
	  stringArray[2] = "aa";
	  Arrays.sort(stringArray);
	  println(Arrays.toString(stringArray));
  }
}
