
package component;

import java.awt.Color;
import javax.swing.Icon;

public class chatLeft_With_Profile extends javax.swing.JLayeredPane {

    public chatLeft_With_Profile() {
        initComponents();
        txt.setBackground(new Color(255,255,255));
    }

    public void setUserProfile(String user){
        txt.setUserProfile(user);
    }
    
    public void setImageProfile(String image){
        IaImage.setImage(image);
    }
    
    public void setText(String text){
        if (text.equals("")) {
            txt.hideText();
        }else{
            txt.setText(text);
        }
    }
    
    public void setImage(Icon ...image) {
        txt.setImage(false, image);
    }
        
    public void setTime(){
        txt.setTime("10:30 pm");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        IaImage = new swing.ImageAvatar();
        txt = new component.chatItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        IaImage.setBorderSize(0);
        IaImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/foto.jpg"))); // NOI18N
        IaImage.setMaximumSize(new java.awt.Dimension(35, 35));
        IaImage.setMinimumSize(new java.awt.Dimension(35, 35));

        jLayeredPane1.setLayer(IaImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(IaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar IaImage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private component.chatItem txt;
    // End of variables declaration//GEN-END:variables
}
