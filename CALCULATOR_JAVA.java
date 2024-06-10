import java.awt.*;
import java.awt.event.*;
class cal extends Frame implements ActionListener
{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	TextField t1;
	cal()
	{
		setLayout(new BorderLayout());
		setSize(300,200);
		t1=new TextField("");
		Panel p=new Panel();
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
		b10=new Button("+");
		b11=new Button("-");
		b12=new Button("*");
		b13=new Button("/");
		b14=new Button("=");
		b15=new Button("Cancel");
p.setLayout(newGridLayout(4,5));
p.add(b0);p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7); p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14); p.add(b15);
		add(p);
		add(t1,BorderLayout.NORTH);
b0.addActionListener(this);b1.addActionListener(this);b2.addActionListener(this); b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);
b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);
b12.addActionListener(this);b13.addActionListener(this);b14.addActionListener(this;
b15.addActionListener(this);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new cal();
	}
	public void actionPerformed(ActionEvent ae)
	{
		int i,j,c;
		char f1='+',f3;
		String f2;
		String f4=t1.getText();
		int a[]=new int[3];
		if(ae.getSource()==b0)
		{	f4=f4+"0";
		}
		else if(ae.getSource()==b1)
		{	f4=f4+"1";
		}
		else if(ae.getSource()==b2)
		{	f4=f4+"2";
		}
		else if(ae.getSource()==b3)
		{	f4=f4+"3";
		}else if(ae.getSource()==b4)
		{	f4=f4+"4";
		}else if(ae.getSource()==b5)
		{	f4=f4+"5";
		}else if(ae.getSource()==b6)
		{	f4=f4+"6";
		}else if(ae.getSource()==b7)
		{	f4=f4+"7";
		}else if(ae.getSource()==b8)
		{	f4=f4+"8";
		}else if(ae.getSource()==b9)
		{	f4=f4+"9";
		}else if(ae.getSource()==b10)
		{	f4=f4+"+";
		}else if(ae.getSource()==b11)
		{	f4=f4+"-";
		}else if(ae.getSource()==b12)
		{	f4=f4+"*";
		}else if(ae.getSource()==b13)
		{	f4=f4+"/";
		}else if(ae.getSource()==b14)
		{	
			String n1=t1.getText();
			f2="";
			for(i=0;i<2;i++)
			{
				for(j=0;j<n1.length();j++)
				{
					f3=n1.charAt(j);
					if((f3=='+')||(f3=='-')||(f3=='*')||(f3=='/'))
					{
						a[i]=Integer.parseInt(f2);
						f2="";
						f1=n1.charAt(j);
					}
					else
					{
						f2=f2+f3;
					}
				}
			
			}
			a[i-1]=Integer.parseInt(f2);
			if(f1=='+')
			{
				c=a[0]+a[1];
			}
			else if(f1=='-')
			{
				c=a[0]-a[1];
			}
			else if(f1=='*')
			{
				c=a[0]*a[1];
			}
			else
			{
				c=a[0]/a[1];
			}
			t1.setText(c+"");
			
		}
		else
		{	t1.setText("");
			f4="";
		}
		if(ae.getSource()!=b14)
		{	t1.setText(f4);
		}
	}
}


