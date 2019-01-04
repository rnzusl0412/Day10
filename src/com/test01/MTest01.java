package com.test01;

import java.awt.*;

@SuppressWarnings("serial")
public class MTest01 extends Frame {
	Button button1, button2, button3;

	public void init() {
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
		add(button1);
		add(button2);
		add(button3);
		setLayout(new FlowLayout());
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MTest01 a1 = new MTest01();
		a1.init();
		
		System.out.println(a1.getLayout());
	}

}
