
package component;

import java.awt.Color;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

public class chatBody extends javax.swing.JPanel {

    public chatBody() {  
        initComponents();
        init();
        addItemRight("Last comment. This is taking too much time. All you have to do is copy the code and test it! Thats why I included the code. You are creating the JScrollPane with the The blog creates the JScrollPane with the");
        addItemLeft("Last comment. This is taking too much time. All you have to do is copy the code and test it! Thats why I included the code. You are creating the JScrollPane with the The blog creates the JScrollPane with the","Bot");
        addItemLeft("Halo Bro! Apa Kabar?","Bot2");
        addItemRight("Halo juga Bro!, Baik");
        addItemLeft("Mantap Bro!","Bot3");
        addItemRight("Yoi Bro, apa kabar Bro?");
        addItemLeft("Baik-baik aja Bro","Bot4");
        addItemRight("Keren lah bro!");
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "2[]2"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(new Color(223,215,206));
    }
    
    public void addItemLeft(String text,String user){
        chatLeft_With_Profile item=new chatLeft_With_Profile();
        item.setText(text);
        item.setUserProfile(user);
        body.add(item,"wrap, w ::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(String text){
        chatRight item=new chatRight();
        item.setText(text);
        body.add(item,"wrap, al right, w ::80%");
        body.repaint();
        body.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(223, 215, 206));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
