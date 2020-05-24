import java.awt.Color;
import java.awt.Graphics;

public class Rosa extends Balas {


	public Rosa(int x, int y,boolean derecha) {
		super(x,y,derecha);
		this.tipo=TipoBalas.rosa;
		this.x=x;
		this.y=y;
	}	
	
	public void Pintar(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(this.x, this.y, ((int)(this.ancho*1.5)), ((int)(this.alto*1.5)));
	}

}
