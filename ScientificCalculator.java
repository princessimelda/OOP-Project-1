import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class ScientificCalculator extends JFrame implements ActionListener {
    //the frame
    static JFrame calc;
    //the text field
    static JTextField txtfld;
    private DecimalFormat decf = new DecimalFormat("#,###.00");

    public ScientificCalculator(){
        calc = new JFrame("My Scientific Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setSize(850,450);
        txtfld = new JTextField();
        txtfld.setFont(new Font("Times New Roman", Font.PLAIN,20));
        txtfld.setEditable(false);
        txtfld.setSize(425,70);
        calc.add(txtfld , BorderLayout.NORTH);

        JPanel bttnpanel = new JPanel();
        bttnpanel.setLayout(new GridLayout(5,10));

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
            bttn.setBorderPainted(false);
            bttn.setForeground(Color.MAGENTA);
            bttn.setBackground(Color.MAGENTA);
            bttn.setFont(new Font("Times New Roman",Font.PLAIN,18));
            bttn.addActionListener(this);
            bttnpanel.add(bttn);
        }

        calc.add(bttnpanel, BorderLayout.CENTER);
        calc.setVisible(true);

    }


    public static void main (String args[]){
        new ScientificCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
