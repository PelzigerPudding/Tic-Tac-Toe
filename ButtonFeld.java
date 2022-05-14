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
                if (GridFeld.getSpieler()[GridFeld.getSpielerindex()%2].getFarbe() == 'a') {
                    setBackground(Color.red);
                    setEnabled(false);
                    ispressed = 'a';
                } else {
                    setBackground(Color.green);
                    setEnabled(false);
                    ispressed = 'b';
                }

                GridFeld.ueberpruefen();
                GridFeld.setSpielerindex();
            }
        });
    }
    public char getIspressed() {
        return ispressed;
    }
}
