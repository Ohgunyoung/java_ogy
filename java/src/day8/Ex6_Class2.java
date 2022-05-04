package day8;

public class Ex6_Class2 {

	public static void main(String[] args) {
	
		point2 p1 = new point2();
		p1.print();
		p1.setX(20);
	}

}

class point2{
	private int x,y;
	
	public void point() {
		System.out.println(x + " , " + y);
	}
		
	/*기능 : 내 x 좌표의 값을 주어진 x1으로 수정하는 메소드
	 * 매캐변수 : 수정할 좌표 x1 => int x1
	 * 리턴타입 : 리턴 타입  => void
	 * 메소드명:: sexX */
	 */
	 public void setX(int x1) {
		  x= x1;
	 }
	 public void setY(int y1) {
		  x= y1;
	 }
	 /*기능 : 내 x좌표의 앖을 알려주는 메소드
	  * 매개변수 : 없음
	  * 리턴타입 : 내 x좌표 -=> 정수 => int
	  * 메도스명 : getX
	  */
	 public void getX() {
		  return  x; 
		  }
	 pubilc void gexY() {
	 }
}