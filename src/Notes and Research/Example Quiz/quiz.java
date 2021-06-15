import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


public class quiz implements ActionListener {

   String question = "Who is this character?";

   String[] imageFile = {
           "http://2.bp.blogspot.com/-sQvgU6dayNc/UqvM8flaQrI/AAAAAAAAA7Q/RA6cFs0jO-o/s1600/arturia+pendragon.jpg",
           "https://i0.wp.com/beneaththetangles.com/wp-content/uploads/2021/03/fate-zero-1c.png?resize=1024%2C573&ssl=1",
           "https://static0.cbrimages.com/wordpress/wp-content/uploads/2019/06/Gilgamesh-Fate-Zero.jpg?q=50&fit=crop&w=960&h=500&dpr=1.5",
           "https://static.wikia.nocookie.net/typemoon/images/9/91/BerserkerMorganStage4.jpg/revision/latest/scale-to-width-down/512?cb=20210611153704"

   };
   ArrayList<ImageIcon> images = new ArrayList<>();

   String[][] options = {
           {"Artoria", "Nero", "Jeanne", "Okita"},
           {"Shirou", "Kiritsugu", "Archer", "Faker"},
           {"Gilgamesh", "Enkidu", "Ishtar", "Tiamat"},
           {"Morgan le Fay", "Merlin", "Waver", "Scathach Skadi"}
   };
   char[] answers = {
           'A',
           'B',
           'A',
           'A'
   };
   char guess;
   char answer;
   int index;
   int correctGuesses = 0;
   int totalQuestion = imageFile.length;
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

   JLabel image = new JLabel();

   JTextField numberRight = new JTextField();
   JTextField percentage = new JTextField();

    public quiz() throws IOException {
        //basic frame declaration
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(ImageIO.read(new URL("https://pm1.narvii.com/6184/f79f9cdfb0f1ca12ef6d0a77b0b6a40f0ceb5e70_hq.jpg")));

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
        textArea.setBounds(0, 60, 650, 50);
        textArea.setLineWrap(true); //if the text go off the screen, it will move to next line
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(new Color(25, 255, 0));
        textArea.setFont(new Font("Ink Free", Font.BOLD, 30));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        image.setBounds(0,75,500,200);


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

        numberRight.setBounds(225,225,200,100);
        numberRight.setBackground(new Color(25,25,25));
        numberRight.setForeground(new Color(25,255,0));
        numberRight.setFont(new Font("Ink Free", Font.BOLD,50));
        numberRight.setBorder(BorderFactory.createBevelBorder(1));
        numberRight.setHorizontalAlignment(JTextField.CENTER);
        numberRight.setEditable(false);

        percentage.setBounds(225,325,200,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(25,255, 0));
        percentage.setFont(new Font("Ink Free",Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        for(int a = 0; a < imageFile.length; a++) {
            URL urlLoop = new URL(imageFile[a]);
            Image urlLoopImg = ImageIO.read(urlLoop);
            ImageIcon iconLoop = new ImageIcon(urlLoopImg);
            Image scaledImgLoop = iconLoop.getImage().getScaledInstance(500, 200, Image.SCALE_DEFAULT);
            iconLoop = new ImageIcon(scaledImgLoop);
            images.add(iconLoop);
        }


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
        frame.add(image);
        frame.setVisible(true);

        nextQuestion();
    }
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            secondLeft.setText(String.valueOf(seconds));

            if(seconds <= 0) {
                displayAnswer();
            }
        }
    });
    public void nextQuestion() {
        if(index >= totalQuestion) {
            results();
        }
        else {
            textfield.setText("Question " + (index + 1));
            textArea.setText(question);
            answerLabelA.setText(options[index][0]);
            answerLabelB.setText(options[index][1]);
            answerLabelC.setText(options[index][2]);
            answerLabelD.setText(options[index][3]);
            image.setIcon(images.get(index));

            timer.start();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //disable buttons
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(e.getSource() == buttonA) {
            answer = 'A';
            if(answer == answers[index]) {
                correctGuesses++;
            }
        }
        if(e.getSource() == buttonB) {
            answer = 'B';
            if(answer == answers[index]) {
                correctGuesses++;
            }
        }
        if(e.getSource() == buttonC) {
            answer = 'C';
            if(answer == answers[index]) {
                correctGuesses++;
            }
        }
        if(e.getSource() == buttonD) {
            answer = 'D';
            if(answer == answers[index]) {
                correctGuesses++;
            }
        }
        displayAnswer();
    }
    public void displayAnswer() {
        //disable buttons
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(answers[index] != 'A') {
            answerLabelA.setForeground(new Color(255, 0 , 0));
        }
        if(answers[index] != 'B') {
            answerLabelB.setForeground(new Color(255, 0 , 0));
        }
        if(answers[index] != 'C') {
            answerLabelC.setForeground(new Color(255, 0 , 0));
        }
        if(answers[index] != 'D') {
            answerLabelD.setForeground(new Color(255, 0 , 0));
        }

        Timer pause = new Timer(2000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                answerLabelA.setForeground(new Color(25, 255 , 0));
                answerLabelB.setForeground(new Color(25, 255 , 0));
                answerLabelC.setForeground(new Color(25, 255 , 0));
                answerLabelD.setForeground(new Color(25, 255 , 0));

                answer = ' ';
                seconds = 10;
                secondLeft.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);

                index++;
                nextQuestion();
            }
        });

        pause.setRepeats(false);
        pause.start();
    }
    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (int)((correctGuesses/(double)totalQuestion) * 100);

        textfield.setText("RESULTS");
        textArea.setText("");
        answerLabelA.setText("");
        answerLabelB.setText("");
        answerLabelC.setText("");
        answerLabelD.setText("");

        numberRight.setText(correctGuesses + "/" + totalQuestion);
        percentage.setText(result + "%");

        frame.add(percentage);
        frame.add(numberRight);

    }
}
