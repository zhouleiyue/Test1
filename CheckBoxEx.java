import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckBoxEx implements ItemListener{
JFrame f; 
JPanel p1,p2;
JCheckBox cb1,cb2,cb3;
public void lauch()
{
	f=new JFrame("colorpanel");
	f.setSize(400, 400);
	f.setVisible(true);
	p1=new JPanel();
	p2=new JPanel();
	cb1=new JCheckBox("red");
	cb2=new JCheckBox("blue");
	cb3=new JCheckBox("yellow");
	p1.add(cb1);p1.add(cb2);p1.add(cb3);
    f.add(p1,"North");f.add(p2);
	cb1.addItemListener(this);
	cb2.addItemListener(this);
	cb3.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
	if(e.getSource()==cb1)
	{p2.setBackground(Color.red);}
}
public static void main(String args[]){
	CheckBoxEx b=new CheckBoxEx();
	b.lauch();
}
}
