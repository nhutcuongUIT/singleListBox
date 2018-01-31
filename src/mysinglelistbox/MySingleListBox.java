/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysinglelistbox;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author xuanhungmai
 */
public class MySingleListBox{
    private JFrame fr;
    private Container container; 
     private JList listMau;
     private String Mau[]={"Red","Green","Blue","Yellow", "White"};  
     public MySingleListBox()
     {
        fr= new JFrame("Hiển thị thông báo");
        container= new Container();
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        listMau= new JList(Mau);
        container.add(listMau);
        listMau.setVisibleRowCount(3);
        listMau.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       //them thanh cuon 
        container.add(new JScrollPane(listMau));
        
        listMau.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                JOptionPane.showInputDialog(listMau.getSelectedValue());
                
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        fr.add(container); 
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
     }
    
     public static void main(String[] args) {
        new MySingleListBox();
    }

}
