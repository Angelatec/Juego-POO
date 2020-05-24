
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Jugadores {
	private int x,y;
	static final int ANCHO= 10, ALTO=40;
	public Jugadores(int x, int y ) {
		this.x=x;
		this.y=y;
		
	}
	public Rectangle2D getJugadores() {
		return new Rectangle2D.Double(this.x,this.y,ANCHO,ALTO);
	}
	public void moverR1(Rectangle limites) {
		if(Teclado.w && y>limites.getMinY()) {
			y--;
		}
		if(Teclado.s && y<limites.getMaxY()-ALTO) {
			y++;
		}
	}
	public void moverR2(Rectangle limites) {
		if(Teclado.up && y>limites.getMinY()) {
			y--;
		}
		if(Teclado.down && y<limites.getMaxY()-ALTO) {
			y++;
		}
	}
}
