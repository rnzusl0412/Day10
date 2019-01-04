package com.test01;

import java.awt.Frame;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MTest05 extends Frame{
	public MTest05() {
		super("Calc");
	}

	public void go() {
		addWindowListener(new MyEvent());
		setSize(300, 300);
		setVisible(true);
	}
	class MyEvent extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent arg0) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MTest05().go();
	}
}
