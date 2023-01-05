import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class switchtoMaze3 implements ActionListener {
    StartPanel start;


    public switchtoMaze3(StartPanel st) {
        this.start = st;

    }


    public void actionPerformed(ActionEvent e) {
        start.getContentPane().removeAll();
        start.initm3();
        start.validate();
        start.repaint();

    }
}