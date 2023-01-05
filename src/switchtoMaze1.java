import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class switchtoMaze1 implements ActionListener {
    StartPanel start;


    public switchtoMaze1(StartPanel st) {
        this.start = st;

    }


    public void actionPerformed(ActionEvent e) {
        start.getContentPane().removeAll();
        start.initm1();
        start.validate();
        start.repaint();
        //mc.setVisible(true);
    }
}
