import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class EventDemo extends JFrame implements ActionListener
{
  JLabel name;
  JPanel namePan,buttonPan;
  JButton reset,paste;
  TextField tf;
  String data;
  EventDemo()
  {
    Container cont =getContentPane();
    reset=new JButton("Cut");
    paste=new JButton("Paste");
    tf=new TextField(10);
    name=new JLabel("Enter Name");
    cont.setLayout(new BoxLayout(cont,BoxLayout.Y_AXIS));
    namePan=new JPanel();
    buttonPan=new JPanel();
    //name Panel
    namePan.add(name,BorderLayout.WEST);
    namePan.add(tf,BorderLayout.EAST);
    cont.add(namePan);
    //button Panel
    buttonPan.add(paste,BorderLayout.WEST);
    buttonPan.add(reset,BorderLayout.EAST);
    cont.add(buttonPan);
    reset.addActionListener(this);
    paste.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource().equals(paste))
    {
          tf.setText(data);

    }
    else
    {
      data=tf.getText();
      tf.setText("");
    }
  }
  public static void main(String[] args) {
    EventDemo ed = new EventDemo();
    ed.setVisible(true);
    ed.setBackground(Color.BLUE);
    ed.setSize(400,500);
    ed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
