import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//sample class
public class JavaTableExample {
// declare frame
JFrame fr;
// declare Table
JTable jt;
// Constructor of the class
JavaTableExample()
{
// initiallization of the frame
fr = new JFrame();
// set Title for the frame
fr.setTitle("JTable Sample");
Workshop obj1=new Workshop(1,"ajay","BE","java","1234567891","ajay@gmail.com");
// Data that will be displayed in JTable
Workshop[][] d = {
    {obj1.getId(),obj1.getName(),obj1.getqualification(),obj1.getTitle(),obj1.getMobnum(),obj1.getEmail()}
};
// Names of the column
String[] cn = { "id","Name","qualification","tittle","mobnum","email" };
// JTable initialization
jt = new JTable(d, cn);
//set bounds for JTable
jt.setBounds(30, 40, 200, 300);
// add it to the JScrollPane
JScrollPane jsp = new JScrollPane(jt);
fr.add(jsp);
// set the Size of frame
fr.setSize(500, 200);
//set the frame visibility as true
fr.setVisible(true);
}
// main method
public static void main(String[] args)
{
new JavaTableExample();
}
}