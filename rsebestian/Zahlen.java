package rsebestian;

import java.util.ArrayList;

public class Zahlen {
	public static ArrayList<String> arrayint = new ArrayList<String>(1000);
	public static int fibonnacciRec(int n){
		if(n < 0){
			throw new NullPointerException();
		}
		if(n==0){
			return 0;
		}
		else{
			int x = fibonnacciRec(n);
			int y = fibonnacciRec(n-1);
			arrayint.add("" + x + y);
		}
		return fibonnacciRec(n) + fibonnacciRec(n-1);
	}
	public static long lukasArr(int n){
		if(n <= 0){
			throw new NullPointerException();
		}
		long erg = 0;
		for(int i = 0;i <= n;i++){
			erg = erg + erg + 1;
			//System.out.println(erg);
			arrayint.add("" + erg);
		}
		return 0;
	}
	public static void main(String[] args){
		int n = 12;
		lukasArr(n);
		fibonnacciRec(n);
		for(int i = 0;i<=n;i++){
			System.out.println(arrayint.get(i));
		}
	}

}
