
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
	

public class PanelGrafico extends JPanel{

	private ArrayList<Balas> balitas;
	private Jugadores r1;
	private Jugadores r2;
	private Rectangle2D l1,
						l2;
	private int vida1=20, vida2=20;
	private boolean inicio;
	private boolean derecha;
	private Random r;
	public PanelGrafico() {
		super();
		setSize(new Dimension(800,500));
		setBackground(Color.BLACK);
		this.derecha=true;
		this.balitas=new ArrayList<Balas>();
		this.r1= new Jugadores(10,200);
		this.r2= new Jugadores(780,200);
		this.l1= new Rectangle2D.Double(0,0,0.1,600);
		this.l2= new Rectangle2D.Double(800,0,0.1,600);
		this.inicio=true;
		this.r= new Random();
	}//this.pelota= new Balas(5,5,15,15);
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2= (Graphics2D)g;
	g2.setColor(Color.BLACK);
	g2.fill(this.l1);
	g2.fill(this.l2);
	g2.setColor(Color.WHITE);
	dibujar(g2);
	if(this.vida1>0&&this.vida2>0) {
		
		actualizar();	
	}
	
	}
	
	public void dibujar(Graphics2D g) {
		
		g.setFont(new Font("AgencyFB", Font.PLAIN, 50)); 
		g.drawString(Integer.toString(this.vida2), 180, 50);
		g.drawString(Integer.toString(this.vida1), 580, 50);
		g.drawLine(400, 0, 400, 600);
		if(this.inicio) {
			balitas.add(new Neutral(400,250,true));
			this.inicio=false;
			
			
		}
		g.setColor(Color.CYAN);
		g.fill(this.r1.getJugadores());
		g.setColor(Color.MAGENTA);
		g.fill(this.r2.getJugadores());
		for(Balas b:balitas) {
			b.Pintar(g);
		}
		/*if(this.size!=0) {
			for(Balas b:this.balitas) {
				g.fill(b.getBalas());
				
			}
			
		}*/
		
	}
	
	public void actualizar() {
		this.puntajes();
		for(Balas b:this.balitas) {
			if(b.getDerecha()) {
				b.movimientoD(getBounds(),colision(b,this.r1.getJugadores()),colision(b,this.r2.getJugadores()));
			}else {
				b.movimientoI(getBounds(),colision(b,this.r1.getJugadores()),colision(b,this.r2.getJugadores()));
			}
			
			
		}
		this.r1.moverR1(getBounds());
		this.r2.moverR2(getBounds());
		
	}
	public void iterarJuego() {
		while(true) {
			try {
				repaint();
				Thread.sleep(6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private boolean colision(Balas bala,Rectangle2D r2) {
		return bala.getBalas().intersects(r2);
	}
	
	public void puntajes() {
		for(Balas b: this.balitas) {
			if(b.tipo==TipoBalas.neutral) {
				
				if(b.getBalas().intersects(r2.getJugadores())) {
					this.balitas.add(new Rosa((int)(b.getBalas().getX()),(int)( b.getBalas().getY()),true));
					this.balitas.remove(b);
					int x=0;
					x++;
					//this.derecha=true;
					this.balitas.add(new Neutral(50,(this.r.nextInt(400)+50),true));
					
				}else if(b.getBalas().intersects(r1.getJugadores())) {
					this.balitas.add(new Azul((int)(b.getBalas().getX()),(int)( b.getBalas().getY()),true));
					this.balitas.remove(b);
					//this.derecha=false;
					this.balitas.add(new Neutral(750,(this.r.nextInt(400)+50),false));
					
					
				}else if(b.getBalas().intersects(this.l1)) {
					this.vida2--;
					this.balitas.remove(b);
					System.out.println(this.r.nextInt(50));
					this.balitas.add(new Neutral(750,(this.r.nextInt(400)+50),false));
				}else if(b.getBalas().intersects(this.l2)) {
					this.vida1--;
					this.balitas.remove(b);
					this.balitas.add(new Neutral(50,(this.r.nextInt(400)+50),true));
				}
			}else if(b.tipo==TipoBalas.azul) {
				if(b.getBalas().intersects(r2.getJugadores())) {
					this.vida1--;
				}else if(b.getBalas().intersects(this.l2)) {
					this.balitas.remove(b);
					this.balitas.add(new Neutral(50,(this.r.nextInt(400)+50),true));
				}else if(b.getBalas().intersects(this.l1)) {
					this.balitas.remove(b);
				}
				
			}else if(b.tipo==TipoBalas.rosa) {
				if(b.getBalas().intersects(r1.getJugadores())) {
					this.vida2--;
				
				}else if(b.getBalas().intersects(this.l1)) {
					this.balitas.remove(b);
					this.balitas.add(new Neutral(750,(this.r.nextInt(400)+50),false));
				}else if(b.getBalas().intersects(this.l2)) {
					this.balitas.remove(b);
				}
			}
		
		}
	}
}
