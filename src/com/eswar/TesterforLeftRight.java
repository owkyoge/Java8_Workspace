package com.eswar;

import junit.framework.Test;

public class TesterforLeftRight  implements Left , Right{

	public void m1() {
		System.out.println("Our owm m1 method");
		Left.super.m1();
		Right.super.m1();
		
	}
			
	public static void main(String[] args) {
		
		TesterforLeftRight t = new TesterforLeftRight();
		t.m1();

	}

}
