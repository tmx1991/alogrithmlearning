package com.test;

public class Tuzi {
	
	static int xiaoxiaotuzi(int n){
		if (n<0) {
			return 0;
		}
		if (n==0) {
			return 1;
		} else {
			return datuzi(n-1);
		}
	}
	
	static int daxiaotuzi(int  n){
		if (n<=0) {
			return 0;
		}
		 else {
			return xiaoxiaotuzi(n-1);
		}
	}
	
	static int datuzi(int n){
		if (n<=0) {
			return 0;
		} else {
			return datuzi(n-1)+daxiaotuzi(n-1)-xiaoxiaotuzi(n-10);
		}
	}
	
	static int laotuzi(int n){
		if (n<=0) {
			return 0;
		} else {
			return xiaoxiaotuzi(n-10)+xiaoxiaotuzi(n-11);
		}
	}
	
	static int suoyou(int n){
		return xiaoxiaotuzi(n)+daxiaotuzi(n)+datuzi(n)+laotuzi(n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=30;
		System.out.println(n+"年后，共有"+suoyou(n)+"对兔子");
		System.out.println(xiaoxiaotuzi(n));
		System.out.println(daxiaotuzi(n));
		System.out.println(datuzi(n));
		System.out.println(laotuzi(n));
		

	}

}
