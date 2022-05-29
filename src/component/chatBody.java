
package component;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

public class chatBody extends javax.swing.JPanel {

    public chatBody() {  
        initComponents();
        init();
        addDate("29/05/2022");
        addItemRight("Last comment. This is taking too much time. All you have to do is copy the code and test it! Thats why I included the code. You are creating the JScrollPane with the The blog creates the JScrollPane with the",new ImageIcon(getClass().getResource("/icon/foto.jpg")),new ImageIcon(getClass().getResource("/icon/ferdinan3.jpeg")));
        addItemLeft("Last comment. This is taking too much time. All you have to do is copy the code and test it! Thats why I included the code. You are creating the JScrollPane with the The blog creates the JScrollPane with the","Bot");
        addItemLeft("Halo Bro! Apa Kabar?","Bot2",new ImageIcon(getClass().getResource("/icon/foto.jpg")),new ImageIcon(getClass().getResource("/icon/ferdinan3.jpeg")));
        addItemRight("Halo juga Bro!, Baik");
        addItemLeft("Mantap Bro!","Bot3",new ImageIcon(getClass().getResource("/icon/foto.jpg")),new ImageIcon(getClass().getResource("/icon/foto.jpg")));
        addItemRight("Yoi Bro, apa kabar Bro?");
        addDate("Hari Ini");
        addItemLeft("","Bot4",new ImageIcon(getClass().getResource("/icon/ferdinan3.jpeg")));
        addItemRight("Keren lah bro!",new ImageIcon(getClass().getResource("/icon/foto.jpg")),new ImageIcon(getClass().getResource("/icon/foto.jpg")));
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "2[]2"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(new Color(223,215,206));
    }
    
    public void addItemLeft(String text,String user, Icon ...image){
        chatLeft_With_Profile item=new chatLeft_With_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime(); 
        item.setUserProfile(user);
        body.add(item,"wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(String text, Icon ...image){
        chatRight item=new chatRight();
        item.setText(text);
        item.setImage(image);
        body.add(item,"wrap, al right, w 100::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addDate(String date){
        chatDate item=new chatDate();
        item.setDate(date);
        body.add(item,"wrap, al center");
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
