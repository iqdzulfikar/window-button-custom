
package button;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;


public class ButtonOval extends JButton {

    public ButtonOval() {
    
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int size = Math.min(getWidth(), getHeight());
        
        int x = (getWidth() - size) /2;
        int y = (getHeight() - size)/2;
        
        g2.setColor(getBackground());
        g2.fillOval(x, y, size, size);
        
        super.paintComponent(g); 
    }
    
    
    
}
