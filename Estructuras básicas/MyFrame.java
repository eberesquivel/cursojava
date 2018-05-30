import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {

  private JButton btnTutup  = new JButton("Cerrar");
  private JButton btnTambah = new JButton("Sumar");

  private JTextField txtA = new JTextField();
  private JTextField txtB = new JTextField();
  private JTextField txtC = new JTextField();

  private JLabel lblA = new JLabel("Introduce # a:");
  private JLabel lblB = new JLabel("Introduce # b:");
  private JLabel lblC = new JLabel("Resultado  :");

  public MyFrame(){
    setTitle("Sumadora");
    setSize(400,200);
    setLocation(new Point(700,400));
    setLayout(null);    
    setResizable(false);

    initComponent();    
    initEvent();    
  }

  private void initComponent(){
    btnTutup.setBounds(200,130, 80,25);
    btnTambah.setBounds(200,100, 80,25);

    txtA.setBounds(130,10,200,30);
    txtB.setBounds(130,35,200,30);
    txtC.setBounds(130,65,200,30);

    lblA.setBounds(20,10,100,20);
    lblB.setBounds(20,35,100,20);
    lblC.setBounds(20,65,100,20);


    add(btnTutup);
    add(btnTambah);

    add(lblA);
    add(lblB);
    add(lblC);

    add(txtA);
    add(txtB);
    add(txtC);
  }

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e1){
       System.exit(1);
      }
    });

    btnTutup.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnTutupClick(e);
      }
    });

    btnTambah.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnTambahClick(e);
      }
    });
  }
  
  private void btnTutupClick(ActionEvent evt){
    System.exit(0);
  }
  
  private void btnTambahClick(ActionEvent evt){
    Integer x,y,z;
    try{
      x = Integer.parseInt(txtA.getText());
      y = Integer.parseInt(txtB.getText());
      z = x + y;
      txtC.setText(z.toString());

    }catch(Exception e){
      System.out.println(e);
      JOptionPane.showMessageDialog(null, 
          e.toString(),
          "La has cagado tío", 
          JOptionPane.ERROR_MESSAGE);
    }
  }
}