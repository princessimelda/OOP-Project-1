import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class ScientificCalculator extends JFrame implements ActionListener {
    //the frame
    static JFrame calc;
    //the text field
    static JTextField calcfld;
    //for large number inputs with commas
    private DecimalFormat decf = new DecimalFormat("#,###.00");
    //zero constant on the calculating panel
    private int operator = 0;
    private JTextArea screen=new JTextArea(5,40);
    private JPanel panel = new JPanel(new BorderLayout(5,5));

    public ScientificCalculator(){
        calc = new JFrame("My Scientific Calculator");
        calc.setSize(850,450);
        calcfld = new JTextField();
        calcfld.setFont(new Font("Times New Roman", Font.PLAIN,20));
        calcfld.setEditable(false);
        calcfld.setSize(425,70);
        calc.add(calcfld , BorderLayout.NORTH);

        screen.setBackground(Color.DARK_GRAY);
        screen.setForeground(Color.WHITE);
        panel.setBackground(Color.WHITE);

        JPanel bttnpanel = new JPanel();
        bttnpanel.setLayout(new GridLayout(5,10,3,2));

        //array with all the symbols the calculator needs
        String[] buttons = {
                "(", ")","mc","m+","m-","mr","C","+/-","%","÷",
                "2nd", "x²","x³","Xy", "e^", "10x", "7", "8","9", "x",
                "1/x", "2√x","3√x","y√x","ln","log10","4","5","6","-",
                "x!", "sin","cos","tan","e","EE","1","2","3","+",
                "Rad","sinh","cosh","tanh","π","Rand"," ","0",".","="
        };

        //font editing of the buttons and adding action listener
        for(String button:buttons){
            JButton bttn = new JButton(button);
            bttn.setOpaque(false);
            bttn.setBorderPainted(true);
            bttn.setForeground(Color.BLACK);
            bttn.setBackground(Color.darkGray);
            bttn.setFont(new Font("Times New Roman",Font.PLAIN,18));
            bttn.addActionListener(this);  //attaching action listener to each button
            bttnpanel.add(bttn);
        }

        bttnpanel.setBackground(Color.DARK_GRAY);
        panel.add(screen, BorderLayout.NORTH); 
        panel.add(bttnpanel, BorderLayout.CENTER);
        calc.add(panel);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

    public static void main (String args[]){
        new ScientificCalculator();
    }

    //overriding the method for action listener
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
