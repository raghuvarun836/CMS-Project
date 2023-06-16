import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class College implements ActionListener,Runnable
{
	Thread t;
	int k,a=0;
	public void start()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(k=10;k>=0;k--)
		{
			try{
				Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("B4,A5,89,76,A3",1700,900);
	}
	JFrame f;
	JLabel l;
	ImageIcon i;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	College()
	{
		f=new JFrame("College:");
		i=new ImageIcon("cis.jpg");
		l=new JLabel(i);
		b1=new JButton("Student Biodata View");
		b2=new JButton("Staff Details View");
		b3=new JButton("Student Attendance Entry");
		b4=new JButton("Department Details Entry");
		b5=new JButton("Student Attendance View");
		b6=new JButton("Department Details View");
		b7=new JButton("Student Marks Entry");
		b8=new JButton("Student Bio Data Entry");
		b9=new JButton("Staff Details Entry");
		b10=new JButton("Student Marks View");
		b11=new JButton("About us");
		b12=new JButton("Exit");
		f.setLayout(null);
		f.setSize(1980,1080);
		f.setVisible(true);
		f.add(l);
		l.setBounds(450,25,600,200);
		f.add(b9);
		b9.setBackground(Color.ORANGE);
		b9.setBounds(250,250,400,50);
		f.add(b2);
		b2.setBackground(Color.CYAN);
		b2.setBounds(850,250,400,50);
		f.add(b8);
		b8.setBackground(Color.ORANGE);
		b8.setBounds(250,350,400,50);
		f.add(b1);
		b1.setBackground(Color.CYAN);
		b1.setBounds(850,350,400,50);
		f.add(b7);
		b7.setBackground(Color.ORANGE);
		b7.setBounds(250,450,400,50);
		f.add(b10);
		b10.setBackground(Color.CYAN);
		b10.setBounds(850,450,400,50);
		f.add(b3);
		b3.setBackground(Color.ORANGE);
		b3.setBounds(250,550,400,50);
		f.add(b5);
		b5.setBackground(Color.CYAN);
		b5.setBounds(850,550,400,50);
		f.add(b4);
		b4.setBackground(Color.ORANGE);
		b4.setBounds(250,650,400,50);
		f.add(b6);
		b6.setBackground(Color.CYAN);
		b6.setBounds(850,650,400,50);
		f.add(b11);
		b11.setBackground(Color.ORANGE);
		b11.setBounds(250,750,400,50);
		f.add(b12);
		b12.setBackground(Color.CYAN);
		b12.setBounds(850,750,400,50);
		b1.setFont(new Font("",Font.BOLD,16));
		b2.setFont(new Font("",Font.BOLD,16));
		b3.setFont(new Font("",Font.BOLD,16));
		b4.setFont(new Font("",Font.BOLD,16));
		b5.setFont(new Font("",Font.BOLD,16));
		b6.setFont(new Font("",Font.BOLD,16));
		b7.setFont(new Font("",Font.BOLD,16));
		b8.setFont(new Font("",Font.BOLD,16));
		b9.setFont(new Font("",Font.BOLD,16));
		b10.setFont(new Font("",Font.BOLD,16));
		b11.setFont(new Font("",Font.BOLD,16));
		b12.setFont(new Font("",Font.BOLD,16));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b1))
		{
			new B();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b2))
		{
			new C();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b3))
		{
			new D();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b4))
		{
			new E();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b5))
		{
			new F();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b6))
		{
			new G();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b7))
		{
			new H();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b8))
		{
			new I();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b9))
		{
			new K();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b10))
		{
			new L();
			f.setVisible(false);
		}
		else if(ae.getSource().equals(b11))
		{
			new M();
			f.setVisible(false);
		}
		else
			f.setVisible(false);
	}
	public static void main(String args[])
	{
		new College();
	}
}
class I implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	I()
	{
		f1=new JFrame("Biodata Entry");
		l1=new JLabel("Name of the student :");
		l2=new JLabel("Roll no:");
		l3=new JLabel("Address :");
		l4=new JLabel("Academic Year:");
		l5=new JLabel("Department:");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		b1=new JButton("back");
		b2=new JButton("Enter");
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(500,100,300,50);
		l1.setFont(new Font("",Font.BOLD,20));
		f1.add(t1);
		t1.setBounds(750,100,400,50);
		t1.setFont(new Font("",Font.PLAIN,20));
		f1.add(l2);
		l2.setBounds(500,200,300,50);
		l2.setFont(new Font("",Font.BOLD,20));
		f1.add(t2);
		t2.setBounds(750,200,300,50);
		t2.setFont(new Font("",Font.PLAIN,20));
		f1.add(l4);
		l4.setBounds(500,300,300,50);
		l4.setFont(new Font("",Font.BOLD,20));
		f1.add(t4);
		t4.setBounds(750,300,300,50);
		t4.setFont(new Font("",Font.PLAIN,20));
		f1.add(l5);
		l5.setBounds(500,400,300,50);
		l5.setFont(new Font("",Font.BOLD,20));
		f1.add(t5);
		t5.setBounds(750,400,300,50);
		t5.setFont(new Font("",Font.PLAIN,20));
		f1.add(l3);
		l3.setBounds(500,500,300,50);
		l3.setFont(new Font("",Font.BOLD,20));
		f1.add(t3);
		t3.setBounds(750,500,300,50);
		t3.setFont(new Font("",Font.PLAIN,20));
		f1.add(b2);
		b2.setBounds(500,700,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f1.add(b1);
		b1.setBounds(850,700,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t1.getText(),s2=t2.getText(),s3=t3.getText(),s5=t4.getText(),s6=t5.getText();
		String s4="Name :"+s1;
		String s7="Rollno:"+s2;
		String s8="Academic Year:"+s5;
		String s9="Department:"+s6;
		String s10="Address:"+s3;
		//String s4="Name:"+s1+"          "+"Rollno:"+s2+"           "+"Academic Year:"+s5+"            "+"Department:"+s6+"         "+"Address:"+s3;
		File q=new File(s1+".txt");
		if(ae.getSource().equals(b2))
		{
			if(q.exists())
			{
			JOptionPane.showMessageDialog(null,"The details of "+s1+"is already existed in the database");	
			}
			else{
			FileWriter fw=new FileWriter(s1+".txt");
			BufferedWriter br1=new BufferedWriter(fw);
			br1.append(s4);
			br1.append('\n');	
			br1.append(s7);
			br1.append('\n');
			br1.append(s8);
			br1.append('\n');
			br1.append(s9);
			br1.append('\n');
			br1.append(s10);
			br1.append('\n');
			br1.close();
			fw.close();
			JOptionPane.showMessageDialog(null,"The details of  "+s1+" is entered successfully");
			File x=new File(s6+".txt");
			FileWriter fw1=new FileWriter(x,true);
			BufferedWriter br=new BufferedWriter(fw1);
			br.write("Name :"+s1);
			br.write('\n');
			br.close();
			fw1.close();
			}
		}
		else
		{
			f1.setVisible(false);
			new A();
		}
		}catch(Exception e){}		
	}
}
class B implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	B()
	{
		f=new JFrame("Student Biodata view");
		l=new JLabel("Name:");
		t=new JTextField(10);
		b1=new JButton("View");
		b2=new JButton("back");
		f.setSize(1980,1080);
		f.setLayout(null);
		f.add(l);
		l.setBounds(500,100,300,50);
		l.setFont(new Font("",Font.BOLD,20));
		f.add(t);
		t.setBounds(750,100,400,50);
		t.setFont(new Font("",Font.PLAIN,20));
		f.add(b1);
		b1.setBounds(500,200,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f.add(b2);
		b2.setBounds(850,200,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t.getText();
		File q=new File(s1+".txt");
		if(q.exists())
		{
		if(ae.getSource().equals(b1))
		{
			Desktop d=Desktop.getDesktop();
			if(q.exists())
				d.open(q);
		}
		}
		else if(ae.getSource().equals(b2))
		{
			f.setVisible(false);
			new A();
		}
		else
			JOptionPane.showMessageDialog(null,"The name you entered is not in the database");
		}catch(Exception e){JOptionPane.showMessageDialog(null,"The name you entered is not in the database");}
	}
}
class K implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	K()
	{
		f1=new JFrame("Staff Entry");
		l1=new JLabel("Name of the Staff :");
		l2=new JLabel("Idno:");
		l3=new JLabel("Address :");
		l4=new JLabel("Course:");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		b1=new JButton("back");
		b2=new JButton("Enter");
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(500,100,300,50);
		l1.setFont(new Font("",Font.BOLD,20));
		f1.add(t1);
		t1.setBounds(750,100,400,50);
		t1.setFont(new Font("",Font.PLAIN,20));
		f1.add(l2);
		l2.setBounds(500,200,300,50);
		l2.setFont(new Font("",Font.BOLD,20));
		f1.add(t2);
		t2.setBounds(750,200,400,50);
		t2.setFont(new Font("",Font.PLAIN,20));
		f1.add(l4);
		l4.setBounds(500,300,300,50);
		l4.setFont(new Font("",Font.BOLD,20));
		f1.add(t4);
		t4.setBounds(750,300,400,50);
		t4.setFont(new Font("",Font.PLAIN,20));
		f1.add(l3);
		l3.setBounds(500,400,300,50);
		l3.setFont(new Font("",Font.BOLD,20));
		f1.add(t3);
		t3.setBounds(750,400,400,50);
		t3.setFont(new Font("",Font.PLAIN,20));
		f1.add(b2);
		b2.setBounds(500,600,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f1.add(b1);
		b1.setBounds(850,600,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t1.getText(),s2=t2.getText(),s3=t3.getText(),s5=t4.getText();
		String s4="Name :"+s1;
		String s7="Rollno:"+s2;
		String s8="Course:"+s5;
		String s9="Address:"+s3;
		//String s4="Name:"+s1+"          "+"Rollno:"+s2+"           "+"Course:"+s5+"            "+"Address:"+s3;
		File x=new File(s1+".txt");
		if(x.exists())
		{
			JOptionPane.showMessageDialog(null,"The details of "+s1+"is already existed in the database");	
		}
		else{
		if(ae.getSource().equals(b2))
		{
			FileWriter fw=new FileWriter(s1+".txt");
			BufferedWriter br1=new BufferedWriter(fw);
			br1.append(s4);
			br1.append('\n');	
			br1.append(s7);
			br1.append('\n');
			br1.append(s8);
			br1.append('\n');
			br1.append(s9);
			br1.append('\n');
			br1.close();
			fw.close();
			JOptionPane.showMessageDialog(null,"The details of "+s1+"is entered successfully");
		}
		else{
			f1.setVisible(false);
			new A();
		}
		}
		}catch(Exception e){}		
	}
}
class C implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	C()
	{
		f=new JFrame("Staff Details View");
		l=new JLabel("Name:");
		t=new JTextField(10);
		b1=new JButton("View");
		b2=new JButton("back");
		f.setSize(1980,1080);
		f.setLayout(null);
		f.add(l);
		l.setBounds(500,100,300,50);
		l.setFont(new Font("",Font.BOLD,20));
		f.add(t);
		t.setBounds(750,100,400,50);
		t.setFont(new Font("",Font.PLAIN,20));
		f.add(b1);
		b1.setBounds(500,200,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f.add(b2);
		b2.setBounds(850,200,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t.getText();
		File q=new File(s1+".txt");
		if(ae.getSource().equals(b1))
		{
			//File q=new File(s1+".txt");
			Desktop d=Desktop.getDesktop();
			if(q.exists())
				d.open(q);
			
			else
			JOptionPane.showMessageDialog(null,"The name you entered is not in the database");
		}
		else if(ae.getSource().equals(b2))
		{
			f.setVisible(false);
			new A();
		}
		}
		catch(Exception e){}
	}
}
class H implements ActionListener
{
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	H()
	{
		f1=new JFrame("Marks Entry");
		l1=new JLabel("Name of the student :");
		l2=new JLabel("Marks");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("back");
		b2=new JButton("Enter");
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(500,100,300,50);
		l1.setFont(new Font("",Font.BOLD,20));
		f1.add(t1);
		t1.setBounds(750,100,400,50);
		t1.setFont(new Font("",Font.PLAIN,20));
		f1.add(l2);
		l2.setBounds(500,200,300,50);
		l2.setFont(new Font("",Font.BOLD,20));
		f1.add(t2);
		t2.setBounds(750,200,400,50);
		t2.setFont(new Font("",Font.PLAIN,20));
		f1.add(b1);
		b1.setBounds(850,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f1.add(b2);
		b2.setBounds(500,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t1.getText(),s2=t2.getText();
		String s8="Marks:"+s2;
		File q=new File(s1+".txt");
		if(q.exists())
		{
		if(ae.getSource().equals(b2))
		{
			FileWriter fw=new FileWriter(s1+"Marks"+".txt");
			fw.write(s8);
			fw.write('\n');
			fw.close();
			JOptionPane.showMessageDialog(null,"The marks of "+s1+"is entered successfully");
		}
		}
		else if(ae.getSource().equals(b1))
		{
			f1.setVisible(false);
			new A();
		}
		else
			JOptionPane.showMessageDialog(null,"The name you entered is not in the database");
		}catch(Exception e){}		
	}
}
class L implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	L()
	{
		f=new JFrame("Student MarksView");
		l=new JLabel("Name:");
		t=new JTextField(10);
		b1=new JButton("View");
		b2=new JButton("back");
		f.setSize(1980,1080);
		f.setLayout(null);
		f.add(l);
		l.setBounds(500,100,300,50);
		l.setFont(new Font("",Font.BOLD,20));
		f.add(t);
		t.setBounds(750,100,400,50);
		t.setFont(new Font("",Font.PLAIN,20));
		f.add(b1);
		b1.setBounds(500,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f.add(b2);
		b2.setBounds(850,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t.getText();
		File p=new File(s1+".txt");
		File q=new File(s1+"Marks"+".txt");
		if(ae.getSource().equals(b1))
		{
			if(p.exists())
			{
			//File q=new File(s1+".txt");
			Desktop d=Desktop.getDesktop();
			if(q.exists())
				d.open(q);
			else
			JOptionPane.showMessageDialog(null,s1+" is not in data base");
			}
			else 
			JOptionPane.showMessageDialog(null,"It is not in data base");
			
		}
		else
		{
			f.setVisible(false);
			new A();
		}
		}
		catch(Exception e){}
	}
}
class D implements ActionListener
{
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	D()
	{
		f1=new JFrame("Attendance Entry");
		l1=new JLabel("Name of the student :");
		l2=new JLabel("Attendance");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("back");
		b2=new JButton("Enter");
		f1.setSize(2000,2000);
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(500,100,300,50);
		l1.setFont(new Font("",Font.BOLD,20));
		f1.add(t1);
		t1.setBounds(750,100,400,50);
		t1.setFont(new Font("",Font.PLAIN,20));
		f1.add(l2);
		l2.setBounds(500,200,300,50);
		l2.setFont(new Font("",Font.BOLD,20));
		f1.add(t2);
		t2.setBounds(750,200,400,50);
		t2.setFont(new Font("",Font.PLAIN,20));
		f1.add(b1);
		b1.setBounds(850,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f1.add(b2);
		b2.setBounds(500,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t1.getText(),s2=t2.getText();
		String s8=s1+"Attendance:"+s2;
		File q=new File(s1+".txt");
		if(q.exists())
		{
		if(ae.getSource().equals(b2))
		{
			FileWriter fw=new FileWriter(s1+"Attendance"+".txt");
			fw.write(s8);
			fw.write('\n');
			fw.close();
			JOptionPane.showMessageDialog(null,"The attendance of "+s1+"is entered successfully");
		}
		}
		else if(ae.getSource().equals(b1))
		{
			f1.setVisible(false);
			new A();
		}
		else
			JOptionPane.showMessageDialog(null,"The name you entered "+s1+" is not in the database");
		}catch(Exception e){}		
	}
}
class F implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	F()
	{
		f=new JFrame("Student Attendance View");
		l=new JLabel("Name:");
		t=new JTextField(10);
		b1=new JButton("View");
		b2=new JButton("back");
		f.setSize(1980,1080);
		f.setLayout(null);
		f.add(l);
		l.setBounds(500,100,300,50);
		l.setFont(new Font("",Font.BOLD,20));
		f.add(t);
		t.setBounds(750,100,400,50);
		t.setFont(new Font("",Font.PLAIN,20));
		f.add(b1);
		b1.setBounds(500,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f.add(b2);
		b2.setBounds(850,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t.getText();
		File p=new File(s1+".txt");
		File q=new File(s1+"Attendance"+".txt");
		if(ae.getSource().equals(b1))
		{
			if(p.exists()){
			//File q=new File(s1+".txt");
			Desktop d=Desktop.getDesktop();
			if(q.exists())
				d.open(q);
			else{
			JOptionPane.showMessageDialog(null,"The name you entered "+s1+" is not  provided Attendance");
			}
			}
			else
			JOptionPane.showMessageDialog(null,"The name you entered "+s1+" is not in  database");
		}
		else{
			f.setVisible(false);
			new A();
		}
		}
		catch(Exception e){}
	}
}
class E implements ActionListener
{
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	E()
	{
		f1=new JFrame("Department Details Entry");
		l1=new JLabel("Name of the Department :");
		t1=new JTextField(10);
		b1=new JButton("back");
		b2=new JButton("Enter");
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(500,100,300,50);
		l1.setFont(new Font("",Font.BOLD,20));
		f1.add(t1);
		t1.setBounds(750,100,400,50);
		t1.setFont(new Font("",Font.PLAIN,20));
		f1.add(b2);
		b2.setBounds(500,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f1.add(b1);
		b1.setBounds(850,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t1.getText();
		if(ae.getSource().equals(b2))
		{
			FileWriter fw=new FileWriter(s1+".txt");
			fw.write("");
			fw.close();
			JOptionPane.showMessageDialog(null,"The details of "+s1+"is entered successfully");
		}
		else
		{
			f1.setVisible(false);
			new A();
		}
		}catch(Exception e){}		
	}
}
class G implements ActionListener
{
	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	G()
	{
		f=new JFrame("Department Details View");
		l=new JLabel("Name of the department:");
		t=new JTextField(10);
		b1=new JButton("View");
		b2=new JButton("back");
		f.setSize(1980,1080);
		f.setLayout(null);
		f.add(l);
		l.setBounds(500,100,300,50);
		l.setFont(new Font("",Font.BOLD,20));
		f.add(t);
		t.setBounds(750,100,400,50);
		t.setFont(new Font("",Font.PLAIN,20));
		f.add(b1);
		b1.setBounds(500,300,200,50);
		b1.setFont(new Font("",Font.BOLD,20));
		f.add(b2);
		b2.setBounds(850,300,200,50);
		b2.setFont(new Font("",Font.BOLD,20));
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		String s1=t.getText();
		File p=new File(s1+".txt");
		if(ae.getSource().equals(b1))
		{
			//File q=new File(s1+".txt");
			Desktop d=Desktop.getDesktop();
			if(p.exists())
				d.open(p);
			else
				JOptionPane.showMessageDialog(null,"The name you entered "+s1+" is not in  database");
		}
		else
		{
			f.setVisible(false);
			new A();
		}
		}
		catch(Exception e){}
	}
}
class M implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4;
	ImageIcon i1,i2;
	JButton b;
	M()
	{
		f1=new JFrame("About Us");
		i1=new ImageIcon("xyz.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("mit.jpg");
		l2=new JLabel(i2);
		l3=new JLabel("Contact Above Members For More Information About Our College...");
		l4=new JLabel("THANK YOU");
		b=new JButton("back");
		f1.setSize(1980,1080);
		f1.setLayout(null);
		f1.add(l1);
		l1.setBounds(-50,0,1980,250);
		f1.add(l2);
		l2.setBounds(0,250,1980,700);
		f1.add(l3);
		l3.setBounds(10,950,1000,100);
		l3.setFont(new Font("",Font.BOLD,20));
		f1.add(l4);
		l4.setBounds(800,950,200,100);
		l4.setFont(new Font("",Font.BOLD,30));	
		f1.add(b);
		b.setBounds(1700,950,200,50);
		b.setFont(new Font("",Font.BOLD,20));
		f1.setVisible(true);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		if(ae.getSource().equals(b))
		{
			f1.setVisible(false);
			new A();
		}
		}catch(Exception e){}
	}
}