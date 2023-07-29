import java.util.*;

public class Sudoku2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int tc=1;tc<=T;tc++) {
			int[][] map=new int[9][9];
			boolean sign=true;
			
			for (int i=0;i<9;i++) {
				for (int j=0;j<9;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			
			for (int i=0;i<9;i++) {
				int[] arr=new int[9];
				for (int j=0;j<9;j++) {
					arr[map[i][j]-1]++;
				}
				for (int a=0;a<9;a++) {
					if (arr[a]==0) {
						sign=false;
						break;
					}
				}
			}
			
			for(int i=0;i<9;i++) {
				int[] arr=new int[9];
				for (int j=0;j<9;j++) {
					arr[map[j][i]-1]++;
				}
				for (int a=0;a<9;a++) {
					if(arr[a]==0) {
						sign=false;
						break;
					}
				}
			}
			for (int i=0;i<=6;i+=3) {
				for(int j=0;j<=6;j+=3) {
					int[] arr=new int[9];
					for (int a=i;a<i+3;a++) {
						for(int b=j;b<j+3;b++) {
							arr[map[a][b]-1]++;
						}
					}
					
					for (int z=0;z<9;z++) {
						if(arr[z]==0) {
							sign=false;
							break;
						}
					}
				}
			}
			
			if(sign==true) {
				System.out.println("#"+tc+" 1");
			}else {
				System.out.println("#"+tc+" 0");
			}
		}
	}

}
