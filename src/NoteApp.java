import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.*;
public class NoteApp extends KeyAdapter implements ActionListener{

    JFrame frame;
    JPanel panel;
    JMenuBar menuar;
    JMenu fileMenu,editMenu;
    JMenuItem newItem,openItem,upItem,lowItem;
    JTextArea textArea1,textArea2;

   
    public NoteApp() 
    {
        frame=new JFrame();
        panel=new JPanel();
        frame.setTitle("workshop");
        JMenuBar menuBar = new JMenuBar();
        
        // Menu
        fileMenu=new JMenu("File");
        editMenu=new JMenu("Edit");
        
        // MenuItem
        newItem=new JMenuItem("New");
        openItem=new JMenuItem("Open");
        upItem=new JMenuItem("Upper");
        upItem.addActionListener(this);
        
        lowItem=new JMenuItem("Lower");
        lowItem.addActionListener(this);
        
        textArea1=new JTextArea(5, 20);
        textArea1.addKeyListener(this);
        String s=textArea1.getText();
        
//        textArea2=new JTextArea(5, 20);
//        textArea2.setBackground(Color.YELLOW);
//        textArea2.setForeground(Color.RED);
//                
        panel.add(textArea1);
//        panel.add(textArea2);
        
        frame.add(panel);
        
        // add menuitem to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        
        editMenu.add(upItem);
        editMenu.add(lowItem);
        
        // add menu to menubar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        frame.setJMenuBar(menuBar);
        
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    

    @Override
//    public void keyTyped(KeyEvent e) {
//        
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        
//    }

  
    public void keyReleased(KeyEvent e) {
        if(e.getSource()==textArea1)
            System.out.println("key released");
    }
    
    public static void main(String[] args) {
       NoteApp obj=new NoteApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==upItem)
          {
               textArea1.setText(textArea1.getText().toUpperCase());
          }
          else if(e.getSource()==lowItem)
          {
               textArea1.setText(textArea1.getText().toLowerCase());
          }
          
    }
}