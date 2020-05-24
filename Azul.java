import java.awt.Color;
import java.awt.Graphics;

public class Azul extends Balas {


	public Azul(int x, int y,boolean derecha) {
		super(x,y,derecha);
		this.tipo=TipoBalas.azul;
		this.x=x;
		this.y=y;
	}	
	
	public void Pintar(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(this.x, this.y, ((int)(this.ancho*1.5)), ((int)(this.alto*1.5)));
	}

}
