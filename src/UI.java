import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    //frame declaration
    JFrame frame = new JFrame();

    //cardLayout
    CardLayout layout = new CardLayout();

    //creating panel
    JPanel panelContainer = new JPanel();
    JPanel panelStart = new JPanel();
    JPanel panelInfo = new JPanel();
    JPanel panelQuiz = new JPanel();
    JPanel panelResult = new JPanel();
    JPanel panelDownload = new JPanel();

    //Start Button
    JButton buttonStart = new JButton();

    //Info button
    JButton buttonInfo = new JButton();

    // Main Screen Button
    JButton buttonQuizA = new JButton();
    JButton buttonQuizB = new JButton();
    JButton buttonQuizC = new JButton();
    JButton buttonQuizD = new JButton();

    //Result Screen
    JButton buttonScore = new JButton();

    //Last Screen
    JButton buttonDownload = new JButton();

    public UI (){
        //basic frame declaration
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setResizable(false);

        //setting of button properties
        buttonStart.setBounds(500, 500, 80, 80);

        //setting panel colors to identify panels
        panelStart.setBackground(Color.orange);
        panelInfo.setBackground(Color.red);
        panelQuiz.setBackground(Color.BLUE);

        //adding button to frame
        panelStart.add(buttonStart);
        panelInfo.add(buttonInfo);
        panelQuiz.add(buttonQuizA);
        panelQuiz.add(buttonQuizB);
        panelQuiz.add(buttonQuizC);
        panelQuiz.add(buttonQuizD);
        panelResult.add(buttonScore);
        panelDownload.add(buttonDownload);

        //setting card layout
        panelContainer.setLayout(layout);
        panelContainer.add(panelStart, "1");
        panelContainer.add(panelInfo, "2");
        panelContainer.add(panelQuiz, "3");
        panelContainer.add(panelResult, "4");
        panelContainer.add(panelDownload, "5");
        layout.show(panelContainer, "1");

        //button action listener for start, info, result, and download
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(panelContainer, "2");
            }
        });

        buttonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(panelContainer, "3");
            }
        });

        buttonScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(panelContainer, "5");
            }
        });

        frame.add(panelContainer);

    }


}
