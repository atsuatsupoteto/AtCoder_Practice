import java.util.*;
public class abc086a {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        // 出力
        int product = a*b;
        if(product%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}