import javax.swing.*;
import java.awt.*;

public class Spielfeld extends JFrame {

    public Spielfeld() {
        super("Tic-Tac-Toe");
        setLayout(new BorderLayout());

        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new GridFeld(), BorderLayout.CENTER);

        setVisible(true);
    }
}
