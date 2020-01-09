import java.util.Scanner;

public class Main {
	
	public static int max(int a,int b)	{
		return (a>b) ? a:b;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열 크기 입력:");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for (int i=0; i<number;i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하시오:");
		}
	}

}
