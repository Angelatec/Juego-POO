import java.awt.Color;
import java.awt.Graphics;

public class Neutral extends Balas {

	public Neutral(int x,int y,boolean derecha){
		super(x,y,derecha);
		this.tipo=TipoBalas.neutral;
	}

	public void Pintar(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(super.x, super.y, super.ancho, super.alto);
	}

}
