import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PanelInicio extends JPanel {
	
	private JPanel boton;
	private Boolean inicio;
	private JLabel texto;
	public PanelInicio(){
		
		setSize(new Dimension(800,500));
		this.setBackground(Color.BLACK);
		
		
		this.inicio=true;
		
		this.boton= new JPanel();
		this.boton.setPreferredSize(new Dimension(200,50));
		this.boton.setBackground(Color.WHITE);
		this.boton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				inicio=false;
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			
		});
		this.texto=new JLabel("INICIO");
		texto.setFont(new Font("Helvetica", Font.PLAIN, 50));
		this.texto.setBackground(Color.BLUE);
		this.texto.setSize(new Dimension(200,50));
		this.boton.add(this.texto);
		this.boton.setVisible(true);
		this.add(this.boton);
		 URL url;
		try {
			url = new URL("https://i0.wp.com/crb.work/wp-content/uploads/2018/09/gifformas-2.gif?w=1170");
			Icon icon = new ImageIcon(url);
		    JLabel label = new JLabel(icon);
		    
		   
		    this.add(label);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	   
	public boolean getInicio() {
		return this.inicio;
	}
	
	
}
