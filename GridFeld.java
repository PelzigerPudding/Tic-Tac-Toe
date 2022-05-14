import javax.swing.*;
import java.awt.*;

public class GridFeld extends JPanel {

    private static int spielerindex = 0;
    private static ButtonFeld[] buttonList = new ButtonFeld[9];
    private static Spieler[] spieler = {new Spieler('a'), new Spieler('b')};

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

        if (check(spieler[spielerindex%2].getFarbe())) {
            for (ButtonFeld i : buttonList) {
                i.setEnabled(false);
            }
        }

        return null;
    }

    public static boolean check(char spieler) {

        int b = 0;
        for (int i = 0; i < 8; i = i+3) {
            //Horizental
            if (buttonList[i].getIspressed() == spieler && buttonList[i+1].getIspressed() == spieler && buttonList[i+2].getIspressed() == spieler) {
                return true;
            }
            //Vertikal
            if (buttonList[b].getIspressed() == spieler && buttonList[b+3].getIspressed() == spieler && buttonList[b+6].getIspressed() == spieler) {
                return true;
            }
            b++;
        }
        //diagonal
        if (buttonList[0].getIspressed() == spieler && buttonList[4].getIspressed() == spieler && buttonList[8].getIspressed() == spieler) {
            return true;
        }
        if (buttonList[2].getIspressed() == spieler && buttonList[4].getIspressed() == spieler && buttonList[6].getIspressed() == spieler) {
            return true;
        }
        return false;
    }

    public ButtonFeld[] getButtonList() {
        return buttonList;
    }

    public static void setSpielerindex() {
        GridFeld.spielerindex++;
    }

    public static Spieler[] getSpieler() {
        return spieler;
    }

    public static int getSpielerindex() {
        return spielerindex;
    }
}