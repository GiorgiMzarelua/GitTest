import stanford.karel.Karel;
//კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
public class problem08 extends Karel{
    public void run(){
    	move();
    	move();
    	while(beepersPresent()){
    		pickBeeper();
    		turnLeft();
    		turnLeft();
    		move();
    		pickBeeper();
    		turnLeft();
    		turnLeft();
    		move();
    	}
        turnLeft();
        turnLeft();
        move();
        while(beepersPresent()){
        	pickBeeper();
        	turnLeft();
        	turnLeft();
        	move();
        	move();
        	putBeeper();
        	turnLeft();
        	turnLeft();
        	move();
        	move();
        }
    }
}
