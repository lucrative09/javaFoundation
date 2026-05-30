package javaTPC;

public class TPC02 {
	public static void main(String[] args) {
		// 프로그래밍의 3대요소 : 변수, 자료형(DataType), 할당(=)
		// 1+1=2
		
		//int는 자료형, 크기는 4byte, 종류는 정수, 크기와 자료형
		int a,b,c;
		a = 1;
		b = 1;
		c = a+b;
//		System.out.println("a :: "+a);
//		System.out.println("b :: "+b);
		System.out.println("c :: "+c);
		
		float f;
		f = 3.13f;
		System.out.println("f :: "+f);
		
		char d;
		d='a';
		System.out.println("d :: "+d);
		
		boolean g;
		g=true;
		System.out.println("g :: "+g);
		// 데이터를 메모리에 저장, 변수 크기, 변수 자료형, 할당으로 선언
		/*
		 변수 : 데이터를 저장할 메모리 공간의 이름
		 자료형 : 변수의 크기와 변수에 저장될 데이터의 종류를 결정하는 것
		 할당 :변수에 값을 저장하는것
		 
		  기본자료형 : 정수, 실수, 문자, 불
		  -> 컴파일러에서 기본적으로 제공해주는 자료형을 기본자료형이라고한다.(PDT)
		  
		  사용자정의자료형(UDDT) : 객체자료형
		  -> 필요에 의해서 새롭게 만들어 사용하는 자료형
		  -> 만드는 도구, 설계하는 도구, 모델링하는 도구가 필요하다.
		  
		  변수가 없으면 Symbol Table에 없기 때문에 can not find sysmpl.. 에러 표출
		  
		 * */

		
	}
}
