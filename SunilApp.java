import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
  JLabel lblId,lblName;
  JTextField txtId,txtName;
  JButton btnSave,btnCancel;
  JPanel panel;
    public MyFrame()  {
        panel=new JPanel();
        lblId=new JLabel("Workshop id");
        lblId.setBounds(50,50,100,20);
        lblName=new JLabel("name:");
        lblName.setBounds(50,100,100,20);
        
        txtId=new JTextField(10);
        txtId.setBounds(200,50,100,20);
        txtName=new JTextField(10);
        txtName.setBounds(200,100,100,20);
        
        btnSave=new JButton("Save");
        btnSave.setBounds(50,150,100,20);
        btnSave.addActionListener(this);
        
        btnCancel=new JButton("Cancel");
        btnCancel.setBounds(200,150,100,20);
        
        
        setTitle("Sunil Workshop");
        
        panel.setLayout(null);
        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(btnSave);
        panel.add(btnCancel);
        
        add(panel);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btnSave)
          {
              Workshop obj=new Workshop();
      obj.setId(Integer.parseInt(txtId.getText()));
      obj.setName(txtName.getText());
      
      DataStore ds=new DataStore();
      int s=ds.saveWorkshop(obj);
     if(s>0)
          {
              System.out.println("data inserted successfully");
          }
          else
          {
              System.out.println("insertion failed");
          }        
          }
    }
    
}

public class SunilApp {

    public static void main(String[] args) {
        MyFrame fr=new MyFrame();
      
    }
    
}
