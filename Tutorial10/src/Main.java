
public class Main {
	
	public static int max(int a,int b)	{
		return (a>b) ? a:b;
	}
	
	public static int func(int a,int b,int c) {
		int result =max(a,b);
		result =max(result,c);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("가장 큰값은"+func(345,567,789)+"입니다");
	}
}
