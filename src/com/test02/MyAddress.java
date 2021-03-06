package com.test02;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyAddress extends JFrame {
	Panel p1, p2, p3;
	Label lbName, lbAddr, lbPhone;
	TextField txtName, txtAddr, txtPhone, txtProfile;
	Button btok, btcn;
	TextArea taview;

	public MyAddress() { // 생성자
		super("주소록");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		lbName = new Label("Name");
		lbAddr = new Label("Address");
		lbPhone = new Label("Phone");

		txtName = new TextField("", 30);
		txtAddr = new TextField("", 30);
		txtPhone = new TextField("", 30);

		btok = new Button("Okay");
		btcn = new Button("Cancel");

		taview = new TextArea("", 5, 50);

	}

	public void go() {
		p1.setLayout(new GridLayout(3, 2));
		p1.add(lbName);
		p1.add(txtName);
		p1.add(lbAddr);
		p1.add(txtAddr);
		p1.add(lbPhone);
		p1.add(txtPhone);

		p2.add(btok);
		p2.add(btcn);

		p3.add(taview);

		add(p1);
		add(p2);
		add(p3);
		setFont(new Font("굴림", Font.BOLD, 20));
		setLayout(new GridLayout(3, 1));
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MyAddress().go();

	}
}
