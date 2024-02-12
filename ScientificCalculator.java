import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class ScientificCalculator extends JFrame implements ActionListener {
    //the frame
    final JFrame calc;
    //the text field
    final JTextField calcfld;
    //for large number inputs with commas
    final DecimalFormat decf = new DecimalFormat("#,###.00");
    //zero constant on the calculating panel
    private int operation;
    private long number1;
    private long number2;
    final JTextArea screen=new JTextArea(5,40);
    final JPanel panel = new JPanel(new BorderLayout(5,5));

    public ScientificCalculator(){
        calc = new JFrame("My Scientific Calculator");
        calc.setSize(850,450);
        calcfld = new JTextField();
        calcfld.setFont(new Font("Times New Roman", Font.PLAIN,20));
        calcfld.setEditable(false);
        calcfld.setSize(425,70);
        calc.add(calcfld , BorderLayout.NORTH);

        screen.setBackground(Color.WHITE);
        screen.setForeground(Color.BLACK);
        screen.setFont(new Font("Times New Roman", Font.BOLD,24));
        screen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Color.BLACK);

        JPanel bttnpanel = new JPanel();
        bttnpanel.setLayout(new GridLayout(5,10,3,2));

        //array with all the symbols the calculator needs
        String[] buttons = {
                "(", ")","mc","m+","m-","mr","C","+/-","%","÷",
                "2nd", "x²","x³","Xy", "e^x", "10x", "7", "8","9", "x",
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
            bttn.setBackground(Color.MAGENTA);
            bttn.setFont(new Font("Times New Roman",Font.PLAIN,18));
            bttn.addActionListener(this);  //attaching action listener to each button
            bttnpanel.add(bttn);
        }

        bttnpanel.setBackground(Color.WHITE);
        panel.add(screen, BorderLayout.NORTH); 
        panel.add(bttnpanel, BorderLayout.CENTER);
        calc.add(panel);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

    //overriding the method for action listener
    @Override
    public void actionPerformed(ActionEvent e) {

            String cmnd = e.getActionCommand();

        //using switch case to set actions for various buttons
        switch(cmnd){
            case".":
                if(!screen.getText().contains(".")){
                    screen.setText(screen.getText()+".");
                }
                break;
            case"0":
                screen.setText(screen.getText()+"0");
                break;
            case"1":
                screen.setText(screen.getText()+"1");
                break;
            case"2":
                screen.setText(screen.getText()+"2");
                break;
            case"3":
                screen.setText(screen.getText()+"3");
                break;
            case"4":
                screen.setText(screen.getText()+"4");
                break;
            case"5":
                screen.setText(screen.getText()+"5");
                break;
            case"6":
                screen.setText(screen.getText()+"6");
                break;
            case"7":
                screen.setText(screen.getText()+"7");
                break;
            case"8":
                screen.setText(screen.getText()+"8");
                break;
            case"9":
                screen.setText(screen.getText()+"9");
                break;
            case"(":
                screen.setText(screen.getText()+"(");
                break;
            case")":
                screen.setText(screen.getText()+")");
                break;
            case"%":
                double number = Double.parseDouble(screen.getText());
                scree.setText(String.valueOf(number/100.0);
                break;
            case"+/-";
                double negative= Double.parseDouble(screen.getText());
                negative *= -1;
                screen.setText(String.valueOf(negative));
            case"+":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=1;
                }
                break;
            case"-":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=2;
                }
                break;
            case"÷":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=3;
                }
                break;
            case"x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=4;
                }
                break;
            case"mc":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=5;
                }
                break;
            case"m+":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=6;
                }
                break;
            case"mr":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=7;
                }
                break;
            case"C":
                    screen.setText("");
                    operation=8;
                break;
            case"2nd":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=9;
                }
                break;
            case"x²":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=10;
                }
                break;
            case"x³":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=11;
                }
                break;
            case"x^y":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=12;
                }
                break;
            case"e^x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=13;
                }
                break;
            case"10x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=14;
                }
                break;
            case"1/x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=15;
                }
                break;
            case"2√x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=16;
                }
                break;
            case"3√x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=17;
                }
                break;
            case"y√x":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=18;
                }
                break;
            case"log10":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=19;
                }
                break;
            case"x!":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=20;
                }
                break;
            case"sin":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=21;
                }
                break;
            case"cos":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=22;
                }
                break;
            case"tan":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=23;
                }
                break;
            case"e":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=24;
                }
                break;
            case"EE":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=25;
                }
                break;
            case"Rad":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=26;
                }
                break;
            case"sinh":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=27;
                }
                break;
            case"cosh":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=28;
                }
                break;
            case"tanh":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=29;
                }
                break;
            case"π":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=30;
                }
                break;
            case"Rand":
                if(!screen.getText().isEmpty()){
                    number1= (long)Double.parseDouble(screen.getText());
                    screen.setText("");
                    operation=31;
                }
                break;

            default:
        }

        if(cmnd.equalsIgnoreCase("=")){
            if(!screen.getText().isEmpty()){
                number2=Double.parseDouble(screen.getText());

                switch(operation){
                    case 1:  //add
                        screen.setText(String.valueOf(number1+number2));
                        calcfld.setText(number1 + " + " + number2 + " = " + decf.format((number1 + number2)));
                        break;
                    case 2:  //subtract
                        screen.setText(String.valueOf(number1-number2));
                        calcfld.setText(number1 + " - " + number2 + " = " + decf.format((number1 - number2)));
                        break;
                    case 3:  //divide
                        screen.setText(String.valueOf(number1/number2));
                        calcfld.setText(number1 + " ÷ " + number2 + " = " + decf.format((number1 / number2)));
                        break;
                    case 4:  //multiply
                        screen.setText(String.valueOf(number1*number2));
                        calcfld.setText(number1 + " x " + number2 + " = " + decf.format((number1 * number2)));
                        break;
                }
            }
        }
    }

     public static void main (String args[]){
        new ScientificCalculator();
    }
}
