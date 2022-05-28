
package swing;

import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.Dimension;

public class ScrollBar extends JScrollBar{
    public ScrollBar(){
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5,5));
        setBackground(new Color(255,255,255));
        setUnitIncrement(20);
    }
}
