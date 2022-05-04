package day8;

public class Ex5_Class1 {

	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.print();
	}
	
}

/* class 앞에 public은 클래스 이름과 파일 이름이 같은 경우에만 붙일 수 있다.
  x좌표, y 좌표
  */

class Point1 {
	//맴버 변수 = > 좌표 평면에서 점을 나타내기 위해 필요한 정보
	//x좌표, y좌표
	int x,y ;
	public int x1, y1;
	private int x2, y2;
	/*메소드 => 기능
	 * 기능 : 현재 좌표를 출력하는 메소드
	 * 매개변수 : 현재 좌표
	 * 리턴타입 : 없음 => void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println( x + ", "+ y);
	}
	
}