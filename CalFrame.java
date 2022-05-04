import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,equal,ce;
	//Button myButton[] = new Button[15];
	TextField t1,t2,t3;
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		
		t1=new TextField();
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		sum=new Button("+");
		sub=new Button("-");
		mul=new Button("X");
		div=new Button("/");
		equal=new Button("=");
		ce=new Button("CE");
		
		
		add(t1);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(sum);
		add(sub);
		add(mul);
		add(div);
		add(equal);
		add(ce);
		
		Font f1 = new Font("Arial",Font.BOLD,60);
		Font f2 = new Font("Arial",Font.BOLD,30);
		
		t1.setFont(f1);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f2);
		b7.setFont(f2);
		b8.setFont(f2);
		b9.setFont(f2);
		sum.setFont(f2);
		sub.setFont(f2);
		mul.setFont(f2);
		div.setFont(f2);
		ce.setFont(f2);
		equal.setFont(f2);
		b0.setFont(f2);
		
		t1.setBounds(100,160,1000,120);
		b1.setBounds(100,340,200,120);
		b2.setBounds(350,340,200,120);
		b3.setBounds(600,340,200,120);
		b4.setBounds(100,490,200,120);
		b5.setBounds(350,490,200,120);
		b6.setBounds(600,490,200,120);
		b7.setBounds(100,640,200,120);
		b8.setBounds(350,640,200,120);
		b9.setBounds(600,640,200,120);
		b0.setBounds(100,790,200,120);
		equal.setBounds(350,790,200,120);
		ce.setBounds(600,790,200,120);
		sum.setBounds(850,340,200,120);
		sub.setBounds(850,490,200,120);
		mul.setBounds(850,640,200,120);
		div.setBounds(850,790,200,120);
		
		
		b0.addActionListener(ml);
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		b4.addActionListener(ml);
		b5.addActionListener(ml);
		b6.addActionListener(ml);
		b7.addActionListener(ml);
		b8.addActionListener(ml);
		b9.addActionListener(ml);
		equal.addActionListener(ml);
		sum.addActionListener(ml);
		sub.addActionListener(ml);
		mul.addActionListener(ml);
		div.addActionListener(ml);
		ce.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}