import java.util.*;
public class abc083b {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
        int B = sc.nextInt();
        
        //1~Nまでの数字
        int i;
        //答え
        int total=0;
        // 1~Nまでの各桁の和を全件とってくる
        for(i=1;i<=N;i++){
        //各桁の数字の和
        int sum = findSumOfDigits(i);
            // A以上B以下だったら足す
            if(A <= sum && sum <= B){
                total += i;
            }
        }
		// 出力
		System.out.println(total);
		sc.close();
    }
    
    //各桁の和を計算する関数
    private static int findSumOfDigits(int n){
        int sum = 0;
        // nが0になるまで繰り返す
        while(n>0){
            // 10進数を10で割ったあまりが一桁目なので
            // 各桁を1桁に分けて足していく
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}