import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFeld extends JButton {

    private char ispressed = 'n';

    public ButtonFeld() {
        super();

        setBackground(Color.BLUE);

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ispressed = 'c';
                setBackground(Color.red);
                setEnabled(false);
                GridFeld.ueberpruefen();
            }
        });
    }
    public char getIspressed() {
        return ispressed;
    }
}
