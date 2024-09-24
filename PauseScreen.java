import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PauseScreen extends JPanel {
    JButton resumeButton;

    public PauseScreen(ActionListener resumeAction) {
        setLayout(null); // Use null layout for manual positioning
        resumeButton = new JButton("Wznów");
        resumeButton.setBounds(130, 295, 100, 50); // Center the button based on the board size
        resumeButton.addActionListener(resumeAction);
        add(resumeButton);
        setOpaque(false); // Make the panel transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // No background painting for transparency
    }
}
