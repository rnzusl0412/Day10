package com.test01;

import java.awt.*;

@SuppressWarnings("serial")
public class MTest02 extends Frame {
	Panel p1,p2,p3;
	
	public MTest02() { // 기본생성자
		super("내가 만든 프레임"); // Frame();
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
	}

	public void go() {
		p1.setBackground(Color.black);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.white);
		add(p1);
		add(p2);
		add(p3);
		setLayout(new GridLayout(3,1));
		setSize(300, 200);
		setVisible(true);
	}

	public void init() {
		setLayout(new GridLayout(4,5));
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		MTest02 a1 = new MTest02();
		a1.go();
	}
}
