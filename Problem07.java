import stanford.karel.Karel;
//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
public class Problem07 extends Karel{
    public void run(){
    	facingEast();
    	int width=0;
		int length=0;
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			width++;
		}
		turnLeft();
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper(); 
			}
			move();
			length++;
		}
		int a=length-1;
		for(int i=0;i<width;i++){
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
