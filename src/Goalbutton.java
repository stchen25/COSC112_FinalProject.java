import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Goalbutton extends JButton implements ActionListener {
    Buttons goal;
    JLabel x;
    JLabel y;
    boolean pressed = false;

    public Goalbutton(Buttons m, JLabel label1, JLabel label2) {
        goal = m;
        x = label1;
        y = label2;
    }

    public void actionPerformed(ActionEvent e) {
        pressed = true;
        if (goal.getCanbePressed()) {
            x.setText("Congrats");
            y.setText("You Win!!!");
        } else if (!goal.getCanbePressed()) {
            x.setText("Oh no!");
            y.setText("You Lost!");
        }
    }
}

