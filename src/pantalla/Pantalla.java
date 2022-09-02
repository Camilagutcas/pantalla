/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;


import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pantalla extends JFrame implements MouseMotionListener{

       JButton bl;
        ImageIcon il;
        

     //To change body of generated methods, choose Tools | Templ
        

    public static void main(String[] args) {
      Pantalla c = new Pantalla();
        
      
    }
    public Pantalla() {
        setBounds(200, 200, 100, 100);
        il=new ImageIcon("src/imagen/doom-eternal.gif");
        bl=new JButton(il);
        setLayout(new FlowLayout());
        add(bl);
        bl.addMouseMotionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    bl.setLocation(e.getX(),e.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
