import stanford.karel.Karel;
//კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class problem09 extends Karel{
    public void run(){
    	move();
    	while(beepersPresent()){
    		pickBeeper();
    		move();
    		if(beepersPresent()){
    		    while(beepersPresent()){
    			    pickBeeper();
    			    move();
    			    putBeeper();
    			    turnLeft();
    			    move();
    			    turnLeft();
    			    move();
    			    putBeeper();
    			    turnLeft();
    			    move();
    			    turnLeft();
    		    }
    		    turnLeft();
    		    turnLeft();
    		    move();
    		    turnLeft();
    		    turnLeft();
            }
    		else{
 			    turnLeft();
 			    move();
 			    while(beepersPresent()){
   			        pickBeeper();
   			        turnLeft();
   			        turnLeft();
   			        move();
   			        putBeeper();
   			        turnLeft();
   			        move();
   			        putBeeper();
   			        turnLeft();
   			        move();
   			        turnLeft();
   			        move();
   			        turnLeft();
   			        turnLeft();
   			        turnLeft();
   		        }
 			    turnLeft();
 			    move();
 			    turnLeft();
 			    move();
 			    turnLeft();
 		    }
    	}
    }
}
