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
        textfield.setFont(new Font("Ink Free", Font.PLAIN, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
        //This is the second line of text on screen
        textArea.setBounds(0, 50, 650, 50);
        textArea.setLineWrap(true); //if the text go off the screen, it will move to next line
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(new Color(25, 255, 0));
        textArea.setFont(new Font("Ink Free", Font.PLAIN, 30));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);



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
