
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345L;
		
		char c = 'Y';
	    char c2 = 88; // ASCII 코드 
		String str = "Do you like pizza?";
		
		float f = 12.3456789f;
		double d = 1234567890.123456789; // d는 선택
		
		boolean bool = true; // 소글자로부터 시작
		
		// 출력하기
		System.out.println(str);
		System.out.println(bool);
		System.out.println(" " +c);
		System.out.println(); // 다음 줄로 가기
		System.out.println("Numbers: ");
		System.out.println("\tByte: " + b);
		System.out.println("\tShort: " + s);
		System.out.println("\tInt: " + i);
		System.out.println("\tLong: " + l);
		System.out.println("\tFloat: " + f);
		System.out.println("\tDouble: " + d);
		// Double: 1.2345678901234567E9
		
		System.out.println("\nChar2: " + c2);
		char c3 = 89;
		System.out.println("\nChar3: " + c3);
	}

}
