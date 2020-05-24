
import javax.swing.*;

public class Ventanita extends JFrame {
	private PanelInicio pi;
	private PanelGrafico pg;
	private Hilo hilo;
	public Ventanita() {
		super("Pong");
		
		setSize(800,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//pa que quede en el centro 
		setResizable(false);//pa que no se cambie el tamaño 
		pi=new PanelInicio();
		if(pi.getInicio()) {
			this.add(pi);
		}else {
			this.add(pg= new PanelGrafico());
		}
		
		this.addKeyListener(new Teclado());
		hilo= new Hilo(pg);
		hilo.start();
		//pp.iterarJuego();
		setVisible(true);
	}
	public static void main(String[] args) {
		Ventanita ventana= new Ventanita();
		
	}
}
