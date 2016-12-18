package ex;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021059  ¤ý«T÷g
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		int s=0;
		for(int i =0;i<n;i++){
			
			
			int t=scn.nextInt();
		int m=scn.nextInt();
		int k=scn.nextInt();
		
		for(int j=0;j<k;j++){
			int l=scn.nextInt();
			s=x(l,t);
		}
		
			
			
			
		if(m>k&&k>100){
			
		}
		System.out.print(s);
			
		}
		
	}
	
	public static int x(int a,int b ){

		int s=0;
		if(a<b){
			s+=a;
		}
		if(s>b){
			s=0;}
		
		return s;
	}

public static void v(int m,int k ){
	if(m>k&&k>100){
		System.out.print("Impossible");
	}
	
	
}
}