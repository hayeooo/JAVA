import java.util.*;

public class ModeScore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for (int test_case=1;test_case<=T;test_case++) {
			int t=sc.nextInt();
			int[] score_arr=new int[101];
			for (int i=0;i<1000;i++) {
				int score=sc.nextInt();
				score_arr[score]+=1;
			}
			int max=score_arr[0];
			int max_score=0;
			for (int i=1;i<=100;i++) {
				if (score_arr[i]>=max) {
					max=score_arr[i];
					max_score=i;
				}
			}
			System.out.println("#"+test_case+" "+max_score);
		}
	}

}
