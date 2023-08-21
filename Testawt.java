import java.awt.*;
public class Testawt
{
  Testawt()
  { 
    Frame fm=new Frame();    //Creating a frame
    Label lb = new Label("welcome to java graphics");  
    Button b = new Button("Click Here"); 

      fm.add(b);   
    fm.add(lb); 
    b.setBounds(50,100,80,30);                     //adding label to the frame
    fm.setSize(300, 300);   //setting frame size.
    fm.setVisible(true);     //set frame visibilty true
  }
  public static void main(String args[])
  {
    Testawt ta = new Testawt();
  }
}

