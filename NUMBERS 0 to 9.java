package patterrNumbers;
import java.util.Scanner;
public class Num0to9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i==1||j==1||i==n*2-1||j==n*2-1) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if((i+j==n+1 && i<=n)||j==n+1 || i==n*2-1) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if((j==n*2-1 && i<=n) || (j==1 && i>=n) || i==1 || i==n || i==n*2-1) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if(i==1||i==n || i==n*2-1 || j==n*2-1) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if((j==1 && i<n*2-1)|| i==n*2-2 ||( j==n && i>n-2))
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if(i==1 || i==n || i==n*2-1 || (j==1 && i<=n) || (j==n*2-1 && i>=n)) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if(i==1 || j==1 || i==n*2-1 || i==n ||( j==n*2-1 && i>=n)) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if((i==1 && j<=n+1)||j==n+1 || i==n) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+" ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if(i==1 || j==1 || i==n*2-1 || j==n*2-1 || i==n) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.print("  ");
			for(int j=1;j<=n*2-1;j++) {
				if(j==n*2-1 || i==1 || i==n ||(j==1 && i<=n) ) 
					System.out.print("*"+" ");
					else
						System.out.print(" "+ " ");
			}
			System.out.println();
		}
	}
}
// * numbers pattern program 0 to 9

			
