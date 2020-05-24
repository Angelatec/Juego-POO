
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public abstract class Balas{

	protected int x,
				y,
				ancho,
				alto;
	protected TipoBalas tipo;
	private int dx=1, dy=1;
	private boolean derecha;
	public Balas(int x, int y,boolean derecha) {
		this.x=x;
		this.y=y;
		this.ancho=15;
		this.alto=15;
		this.derecha=derecha;
		
	}
	public Rectangle2D getBalas(){
		return new Rectangle2D.Double(x,y,this.ancho,this.alto);
	}
	public abstract void Pintar(Graphics g);
	
	public void movimientoD(Rectangle limites, boolean colisionR1, boolean colisionR2) {
		
			x+=dx;
			y+=dy;
			if(colisionR1) {
				dx=-dx;
				this.x=25;
			}
			if(colisionR2) {
				dx=-dx;
				this.x=755;
			}
			
			if(x>limites.getMaxX()-15) {
				dx=-dx;
			}
			if(y>limites.getMaxY()-15) {
				dy=-dy;
			}
			if(x<1) {
				dx=-dx;
			}
			if(y<1) {
				dy=-dy;
			}
		
		}public void movimientoI(Rectangle limites, boolean colisionR1, boolean colisionR2) {
		
			x-=dx;
			y-=dy;
			if(colisionR1) {
				dx=-dx;
				this.x=25;
			}
			if(colisionR2) {
				dx=-dx;
				this.x=755;
			}
			
			if(x>limites.getMaxX()-15) {
				dx=-dx;
			}
			if(y>limites.getMaxY()-15) {
				dy=-dy;
			}
			if(x<1) {
				dx=-dx;
			}
			if(y<1) {
				dy=-dy;
			}
		
		}
		public Boolean getDerecha() {
			return this.derecha;
		}
		
}
