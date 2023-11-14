package ch05;

public class MultiInstance {

	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		System.out.println(sp1); // ch05.SmartPhone@7c30a502 : @16진수 
		// 2진수에서 16진수 계산 ~ 4bit씩 
		//System.out.println(sp2);
		
		
		sp1.color = "Gold";
		sp1.size = 5.7F;
		sp1.volume = 5;
		
		System.out.println(">color : " + sp1.color);
		System.out.println(">size : " + sp1.size);
		System.out.println(">volume : " + sp1.volume);
		
		sp2.color = "Black";
		sp2.size = 6.6F;
		sp2.volume = 3;
		
		System.out.println(">color : " + sp2.color);
		System.out.println(">size : " + sp2.size);
		System.out.println(">volume : " + sp2.volume);
		
		sp1.volumeUp();
		sp2.volumeDown();
		System.out.println("SmartPhone 1객체의 volumeUp() 메소드를 호출했습니다.");
		System.out.println(">volume : " + sp1.volume);
		System.out.println("SmartPhone 1객체의 volumeDown() 메소드를 호출했습니다.");
		System.out.println(">volume : " + sp2.volume);
		}

}
