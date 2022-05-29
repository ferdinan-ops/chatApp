
package component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class chatItem extends javax.swing.JLayeredPane {
    
    private JLabel label;
    
    public chatItem() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
    }

    public void setUserProfile(String user){
        JLayeredPane layer=new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        layer.setBorder(new EmptyBorder(10,10,0,10));        
        JButton cmd=new JButton(user);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setFocusable(false);
        cmd.setForeground(new Color(0,168,132));
        cmd.setFont(new java.awt.Font("Segoe UI",1,14));
        // txt.setBorder(new EmptyBorder(5,10,10,10));
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5,10,5,10));
        layer.add(cmd);
        add(layer, 0);
    }
    
    public void setText(String text){
        txt.setText(text);
    }
    
    public void setTime(String time){
        JLayeredPane layer=new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        layer.setBorder(new EmptyBorder(0,5,10,5));        
        label=new JLabel(time);
        label.setForeground(new Color(110,110,110));
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(layer);
    }
    
    public void setImage(boolean right, Icon ...image) {
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(right?FlowLayout.RIGHT:FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0, 5, 0, 5));
        Chat_Image chatImage = new Chat_Image(right);
        chatImage.addImage(image);
        layer.add(chatImage);
        add(layer);
    } 
    
    public void sendSuccess(){
        if (label!=null) {
            label.setIcon(new ImageIcon(getClass().getResource("../icon/send.png")));
        }
    }
    
    public void seen(){
        if (label!=null) {
            label.setIcon(new ImageIcon(getClass().getResource("../icon/seen.png")));
        }
    }
    
    public void hideText(){
        txt.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 5, 10));
        txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt.setSelectionColor(new java.awt.Color(102, 153, 255));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables

}
