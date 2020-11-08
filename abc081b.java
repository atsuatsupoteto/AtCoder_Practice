import java.util.*;
public class abc081b {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int N = sc.nextInt();
        int A[];
        A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        //カウント
        int cnt=0;
        // A[0]が2で割り切れなくなるまで繰り返す
        boolean flg = true;
        while(flg == true){
            //A[]の中身をすべて２で割るのを繰り返す
            for(int j=0;j<N;j++){
                //2で割る、割り切れないものがあったら終了
                if(A[j]%2==0){
                    A[j]=A[j]/2;
                }else{
                        flg = false;
                        break;
                    }
            }
            if(flg==false){
                break;
            }
            cnt++;
        }

		// 出力
		System.out.println(cnt);
		sc.close();
	}
}