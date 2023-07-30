package Basic;

public class ArrayInvestigate {
	public static void main(String[] args) {
		int sum=0;
		char[][] grid=new char[4][4];
		int[][] deltas= {{-1,0},{1,0},{0,-1},{0,1}};
		
		for (int r=0;r<4;r++) {
			for(int c=0;c<4;c++) {
				if (grid[r][c]=='X') {
					for (int d=0;d<4;d++) {
						int nr=r+grid[d][0];
						int nc=c+grid[d][1];
						if (nr>=0 && nr<4 && nc>=0 && nc<4 && grid[nr][nc]!='X') {
							sum+=grid[nr][nc]-'0';
							grid[nr][nc]='0';
						}
					}
				}
			}
		}

	}
}
