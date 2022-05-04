import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener 
{
	MyFrame mf;
	int add,minus,multi,count;
	float divi;
	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(this.mf.b1))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(1).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+1).toString());
			}
		}
		if(e.getSource().equals(this.mf.b2))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(2).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+2).toString());
			}
		}
		if(e.getSource().equals(this.mf.b3))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(3).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+3).toString());
				
			}
		}
		if(e.getSource().equals(this.mf.b4))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(4).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+4).toString());
			}
		}
		if(e.getSource().equals(this.mf.b5))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(5).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+5).toString());
			}
		}
		if(e.getSource().equals(this.mf.b6))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(6).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+6).toString());
			}
		}
		if(e.getSource().equals(this.mf.b7))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(7).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+7).toString());
			}
		}
		if(e.getSource().equals(this.mf.b8))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(8).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+8).toString());
			}
		}
		if(e.getSource().equals(this.mf.b9))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(9).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+9).toString());
			}
		}
		if(e.getSource().equals(this.mf.b0))
		{
			if(this.mf.t1.getText().length()==0)
			{
				this.mf.t1.setText(new Integer(0).toString());
			}
			else
			{
				this.mf.t1.setText(new Integer(Integer.parseInt(this.mf.t1.getText())*10+0).toString());
			}
		}
		
		if(e.getSource().equals(this.mf.sum))
		{
			add = Integer.parseInt(this.mf.t1.getText());
			this.mf.t1.setText("");
			count = 1; 
		}
		if(e.getSource().equals(this.mf.sub))
		{
			minus= Integer.parseInt(this.mf.t1.getText());
			this.mf.t1.setText("");
			count = 2;
		}
		if(e.getSource().equals(this.mf.mul))
		{
			multi = Integer.parseInt(this.mf.t1.getText());
			this.mf.t1.setText("");
			count = 3;
		}
		if(e.getSource().equals(this.mf.div))
		{
			divi = Integer.parseInt(this.mf.t1.getText());
			this.mf.t1.setText("");
			count = 4;
		}
		if(e.getSource().equals(this.mf.equal))
		{
			if(count==1)
			{
				this.mf.t1.setText(new Integer(new Integer(this.mf.t1.getText())+add).toString());
			}
			else if(count==2)
			{
				this.mf.t1.setText(new Integer(minus-(new Integer(this.mf.t1.getText()))).toString());
			}
			else if(count==3)
			{
				this.mf.t1.setText(new Integer(new Integer(this.mf.t1.getText())*multi).toString());
			}
			else if(count==4)
			{
				this.mf.t1.setText(new Float(divi/(new Float(this.mf.t1.getText()))).toString());
			}
		}
		if(e.getSource().equals(this.mf.ce))
		{
			this.mf.t1.setText("");
		}
		
	}
}