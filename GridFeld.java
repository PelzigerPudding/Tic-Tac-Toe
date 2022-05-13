import javax.swing.*;
import java.awt.*;

public class GridFeld extends JPanel {

    private static ButtonFeld[] buttonList = new ButtonFeld[9];

    public GridFeld() {
        super();
        GridLayout layout = new GridLayout(3,3);
        layout.setHgap(25);
        layout.setVgap(25);
        setLayout(layout);
        setBackground(Color.BLACK);

        for (int i = 0; i < 9; i++) {
            ButtonFeld buttonFeld = new ButtonFeld();
            buttonList[i] = buttonFeld;
            add(buttonFeld);
        }
    }

    public static Spieler ueberpruefen() {

        if (buttonList[1].getIspressed() == buttonList[2].getIspressed() && buttonList[1].getIspressed() == buttonList[0].getIspressed()) {
            System.out.println("YAY gewonnen");
        }
        return null;
    }

    public ButtonFeld[] getButtonList() {
        return buttonList;
    }
}
