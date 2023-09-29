import stanford.karel.Karel;
public class test extends Karel{
    public void run(){
    	facingEast();
		for(int i=0;i<5;i++){
			int a=2;
			if(i%2==0){
				turnLeft();
				move();
				turnLeft();
			}
			if(i%2==1){
				turnLeft();
				turnLeft();
				turnLeft();
				move();
				turnLeft();
				turnLeft();
				turnLeft();
			}
			while(a>0){
				move();
				if(noBeepersPresent()){
					putBeeper();
				}
				a--;
			}
		}
    }
}
