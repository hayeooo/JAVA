import java.util.*;

public class TwoNumberSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for (int test_case=1;test_case<=T;test_case++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			int[] min_arr;
			int[] max_arr;
			
			int[] a=new int[N];
			int[] b=new int [M];
			
			for (int i=0;i<N;i++) {
				a[i]=sc.nextInt();
			}
			for (int i=0;i<M;i++) {
				b[i]=sc.nextInt();
			}
			
			if (N<M) {
				min_arr=a;
				max_arr=b;
			}else {
				min_arr=b;
				max_arr=a;
			}
			
			int result=-10000000;
			for (int i=0;i<=max_arr.length-min_arr.length;i++) {
				int sum=0;
				for (int j=0;j<min_arr.length;j++) {
					sum+=(min_arr[j]*max_arr[i+j]);
				}
				if (result<sum) {
					result=sum;
				}
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}

}
