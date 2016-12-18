package ex;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=0;
		boolean x=true;
		while(x){
        int n=scn.nextInt();
      a++;
      if(n>0&&n==0&&n<0){
    	  continue;
      }else{
      x=false;
      }	}
		System.out.print(a);
        
	}
}