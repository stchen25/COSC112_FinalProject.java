import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class switchtoMaze2 implements ActionListener {
    StartPanel start;


    public switchtoMaze2(StartPanel st) {
        this.start = st;

    }


    public void actionPerformed(ActionEvent e) {
        start.getContentPane().removeAll();
        start.initm2();
        start.validate();
        start.repaint();

    }
}