import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {

//don't forget to add buttons to frame ex: walk.add(buttonA)

    public Button() {

        // This is the the title screen
        JFrame frame = new JFrame();
        ImageIcon hunter = new ImageIcon("C:\\Users\\Shaun\\Pictures\\anime\\gon.jpg");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setIconImage(hunter.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Card Layout assigning
        CardLayout u1 = new CardLayout();
        JPanel panelCont = new JPanel();
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JButton buttonOne = new JButton();
        JButton buttonTwo = new JButton();

        //Button Size
        buttonOne.setBounds(20,0,80,80);

        //Panel colors
        panelOne.setBackground(Color.orange);
        panelTwo.setBackground(Color.cyan);

        //Card Layout adding contents
        panelCont.setLayout(u1);
        panelOne.add(buttonOne);
        panelTwo.add(buttonTwo);
        panelCont.add(panelOne, "1");
        panelCont.add(panelTwo, "2");
        u1.show(panelCont, "1");

        //Button Action Listener
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                u1.show(panelCont, "2");
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                u1.show(panelCont, "1");
            }
        });
        frame.add(panelCont);















    }

    public void java() {
        System.out.println("fight");
        int a[] = {1,2, 3, 4, 5};
        for (int x = 0; x < a.length; x++) {
         if (x > 3){
             System.out.println("Hello my name is itatdor. And I like women with a fat a#");
         }

        }

    }
}