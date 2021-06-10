import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class quiz implements ActionListener {

   String question = "Who is this character?";

   String[][] options = {
           {"Artoria", "Nero", "Jeanne", "Okita"},
           {"Emiya", "Kiritsugu", "Archer", "Faker"},
           {"Gilgamesh", "Enkidu", "Ishtar", "Tiamat"},
   };
   char[] answers = {
           'A',
           'B',
           'C'
   };
   char guess;
   char answer;
   int index;
   int correctGuesses = 0;
   int totalQuestion = question.length();
   int result;
   int seconds = 30;

   JFrame frame = new JFrame();
   JTextField textfield = new JTextField();
   JTextArea textArea = new JTextArea();

   JButton buttonA = new JButton();
   JButton buttonB = new JButton();
   JButton buttonC = new JButton();
   JButton buttonD = new JButton();

   JLabel answerLabelA = new JLabel();
   JLabel answerLabelB = new JLabel();
   JLabel answerLabelC = new JLabel();
   JLabel answerLabelD = new JLabel();

   JLabel timeLabel = new JLabel();
   JLabel secondLeft = new JLabel();
   JTextField numberRight = new JTextField();
   JTextField percentage = new JTextField();

    public quiz() {
        //basic frame declaration
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);

        //This is the first line of text
        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
        textfield.setText(question);
        //This is the second line of text on screen
        textArea.setBounds(0, 75, 500, 200);
        textArea.setLineWrap(true); //if the text go off the screen, it will move to next line
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(new Color(25, 255, 0));
        textArea.setFont(new Font("Ink Free", Font.BOLD, 30));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        buttonA.setBounds(0,300,100,100);
        buttonA.setFont(new Font("Button A", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        answerLabelA.setBounds(100,300,500,100);
        answerLabelA.setBackground(new Color(50,50,50));
        answerLabelA.setForeground(new Color(25,255,0));
        answerLabelA.setFont(new Font("Ink Free", Font.PLAIN,35));
        answerLabelA.setText("Testing");

        buttonB.setBounds(325,300,100,100);
        buttonB.setFont(new Font("Button A", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        answerLabelB.setBounds(425,300,500,100);
        answerLabelB.setBackground(new Color(50,50,50));
        answerLabelB.setForeground(new Color(25,255,0));
        answerLabelB.setFont(new Font("Ink Free", Font.PLAIN,35));
        answerLabelB.setText("Testing");

        buttonC.setBounds(0,500,100,100);
        buttonC.setFont(new Font("Button A", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("B");

        answerLabelC.setBounds(100,500,500,100);
        answerLabelC.setBackground(new Color(50,50,50));
        answerLabelC.setForeground(new Color(25,255,0));
        answerLabelC.setFont(new Font("Ink Free", Font.PLAIN,35));
        answerLabelC.setText("Testing");

        buttonD.setBounds(325,500,100,100);
        buttonD.setFont(new Font("Button A", Font.BOLD, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answerLabelD.setBounds(425,500,500,100);
        answerLabelD.setBackground(new Color(50,50,50));
        answerLabelD.setForeground(new Color(25,255,0));
        answerLabelD.setFont(new Font("Ink Free", Font.PLAIN,35));
        answerLabelD.setText("Testing");

        secondLeft.setBounds(525,175,100,100);
        secondLeft.setBackground(new Color(25,25,25));
        secondLeft.setForeground(new Color(255,0,0));
        secondLeft.setFont(new Font("Ink Free", Font.BOLD,60));
        secondLeft.setBorder(BorderFactory.createBevelBorder(1));
        secondLeft.setOpaque(true);
        secondLeft.setHorizontalAlignment(JTextField.CENTER);
        secondLeft.setText(String.valueOf(seconds));

        timeLabel.setBounds(525, 150, 100, 25);
        timeLabel.setBackground(new Color(50, 50, 50));
        timeLabel.setForeground(new Color(255,0,0));
        timeLabel.setFont(new Font("Ink Free",Font.PLAIN,20));
        timeLabel.setHorizontalAlignment((JTextField.CENTER));
        timeLabel.setText("Timer: ");

        frame.add(timeLabel);
        frame.add(secondLeft);
        frame.add(answerLabelA);
        frame.add(answerLabelB);
        frame.add(answerLabelC);
        frame.add(answerLabelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textArea);
        frame.add(textfield);
        frame.setVisible(true);
    }
    public void nextQuestion() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void displayAnswer() {

    }
    public void results() {

    }
}
