import java.util.*;

public class Test {
	
	public static int[][] rotate_matrix(int[][] arr){
		int n=arr.length;
		int[][] tmp=new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				tmp[i][j]=arr[n-j-1][i];
			}
		}
		return tmp;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int t=1;t<=T;t++) {
			int N=sc.nextInt();
			int[][] origin=new int[N][N];
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					origin[i][j]=sc.nextInt();
				}
			}
			int[][] rotate_90=rotate_matrix(origin);
			int[][] rotate_180=rotate_matrix(rotate_90);
			int[][] rotate_270=rotate_matrix(rotate_180);
			
			System.out.println("#"+t);
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					System.out.print(rotate_90[i][j]);
				}
				System.out.print(" ");
				for (int j=0;j<N;j++) {
					System.out.print(rotate_180[i][j]);
				}
				System.out.print(" ");
				for (int j=0;j<N;j++) {
					System.out.print(rotate_270[i][j]);
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
	}
	
	

}
