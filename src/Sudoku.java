import java.util.*;

public class Sudoku {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		for (int test_case=1;test_case<=T;test_case++) {
			int[][] sudoku=new int[9][9];
			boolean flag=true;

			for (int i=0;i<9;i++) {
				for (int j=0;j<9;j++) {
					sudoku[i][j]=sc.nextInt();
				}
			}
			
			for (int i=0;i<9;i++) {
				int[] line =new int[9];
				for (int j=0;j<9;j++) {
					line[sudoku[i][j]-1]++;
				}
				for (int k=0;k<9;k++) {
					if(line[k]==0) {
						flag=false;
						break;
					}
				}
				
			}
			
		
			
			
			// 세로
			for (int i=0;i<9;i++) {
				int[] line=new int[9];
				for (int j=0;j<9;j++) {
					line[sudoku[j][i]-1]+=1;
				}
				for (int k=0;k<9;k++) {
					if(line[k]==0) {
						flag=false;
						break;
					}
				}
			}
			
			
			// 사각형
			for (int r=0;r<9;r+=3) {
				for (int c=0;c<9;c+=3) {
					int[] line=new int[9];
					for (int i=r;i<r+3;i++) {
						for (int j=c;j<c+3;j++) {
							line[sudoku[i][j]-1]+=1;
							if (line[sudoku[i][j]-1]>1) {
								flag=false;
								break;
							}
						}
					}
					
			
				}
			}
			if (flag==false) {
				System.out.println("#"+test_case+" 0");
			}
			else {
				System.out.println("#"+test_case+" 1");
			}
			
		}

	}

}
