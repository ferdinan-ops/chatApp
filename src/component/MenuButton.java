
package component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

public class MenuButton extends JButton{
    public MenuButton(){        
        setContentAreaFilled(false);
    }
    
    private Icon iconSimple;
    private Icon iconSelected;
    
    public Icon getIconSimple(){
        return iconSimple;
    }
    public Icon getIconSelected(){
        return iconSelected;
    }
    
    public void setIconSelected(Icon iconSelected){
        this.iconSelected =  iconSelected;
    }
    
    public void setIconSimple(Icon iconSimple){
        this.iconSimple = iconSimple;
    }

    @Override
    public void setSelected(boolean bin) {
        super.setSelected(bin); //To change body of generated methods, choose Tools | Templates.
        if (bin) {
            setIcon(iconSelected);
        }else{
            setIcon(iconSimple);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if (isSelected()) {
            g.setColor(new Color(0, 168, 132));
            g.fillRect(0, getHeight()-3, getWidth(), getHeight());
        }
    }
    
    
}

