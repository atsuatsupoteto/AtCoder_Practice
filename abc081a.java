import java.util.*;
public class abc081a {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
        // 出力
        s = s.replaceAll("0","");
		System.out.println(s.length());
		sc.close();
	}
}