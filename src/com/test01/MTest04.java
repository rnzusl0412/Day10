package com.test01;

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MTest04 extends JFrame {
	Panel p1;
	TextField t1, t2, t3;
	Label l1, l2, l3;
	List b1;

	public MTest04() {
		super();
		
		p1 = new Panel();

		l1 = new Label("A");
		l2 = new Label("B");
		l3 = new Label("=");

		t1 = new TextField("", 5);
		t2 = new TextField("", 5);
		t3 = new TextField("", 5);

		b1 = new List(4,false);
		b1.add("+");
		b1.add("-");
		b1.add("*");
		b1.add("/");

	}

	public void Calc() {
		p1.add(l1);
		p1.add(t1);
		
		p1.add(b1);
		p1.add(l2);
		p1.add(t2);
		
		p1.add(l3);
		p1.add(t3);
		
		add(p1);
		
		
		setFont(new Font("±¼¸²", Font.BOLD, 20));
		setLayout(new GridLayout(1,7));
		setSize(450, 120);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MTest04().Calc();

	}
}
