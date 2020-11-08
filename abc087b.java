import java.util.*;
public class abc087b {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        //500円玉が0個~A個のとき
        for(int a=0;a<=A;a++){
            //100円玉が0個~b個のとき
            for(int b=0;b<=B;b++){
                //50円玉が0個~c個のとき
                for(int c=0;c<=C;c++){
                    //合計金額を計算               
                    sum = 500*a + 100*b + 50*c;
                    if(sum == X){
                        cnt = cnt + 1; 
                        sum=0;
                    }else{
                        sum=0;
                    }
                }
            }
        }
        // 出力
		System.out.println(cnt);
		sc.close();
	}
}