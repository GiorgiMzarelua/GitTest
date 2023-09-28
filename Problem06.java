import stanford.karel.Karel;
//კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem06 extends Karel{
    public void run(){
    	while(noBeepersPresent()){
    		move();
    	}
    	int num=0;
    	while(beepersPresent()){
    		pickBeeper();
    		num++;
    	}
    	while(noBeepersPresent()){
    		move();
    	}
    	while(beepersPresent()){
    		pickBeeper();
    		num++;
    	}
    	move();
    	while(num>0){
    		putBeeper();
    		num--;
    	}
    }
}
