import java.util.*;

public class FlyKiller {
	static int N;
	static int M;
	// + 모양
	public static int plus(int x,int y, int[][] map) {
		int[][] dir= {{-1,0},{1,0},{0,1},{0,-1}};
		int res=0;
		res+=map[x][y];
		for (int i=0;i<4;i++) {
			int dx=dir[i][0];
			int dy=dir[i][1];
			
			for (int j=1;j<M;j++) {
				int nx=x+dx*j;
				int ny=y+dy*j;
				if (nx<0 || nx>=N || ny<0 || ny>=N) {
					break;
				}
				res+=map[nx][ny];
			}
		}
		return res;
	}
	// x 모양
	public static int cross(int x,int y, int[][] map) {
		int[][] dir= {{-1,-1},{-1,1},{1,1},{1,-1}};
		int res=0;
		res+=map[x][y];
		for (int i=0;i<4;i++) {
			int dx=dir[i][0];
			int dy=dir[i][1];
			
			for (int j=1;j<M;j++) {
				int nx=x+dx*j;
				int ny=y+dy*j;
				if (nx<0 || nx>=N || ny<0 || ny>=N) {
					break;
				}
				res+=map[nx][ny];
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		for (int test_case=1;test_case<=T;test_case++) {
			N=sc.nextInt();
			M=sc.nextInt();
			int[][] map=new int[N][N];
			for (int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			int result=0;
			// + 모양
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					int plus_res=plus(i,j,map);
					int cross_res=cross(i,j,map);
					if (plus_res>result) {
						result=plus_res;
					}
					if (cross_res>result) {
						result=cross_res;
					}
					
				}
			}
			System.out.println("#"+test_case+" "+result);
			
			
			
		}

	}

}
