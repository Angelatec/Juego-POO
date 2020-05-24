

public class Hilo extends Thread{ //aquí movemos las cosas
	PanelGrafico lamina;
	public Hilo(PanelGrafico lamina) {
		this.lamina=lamina;
		
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lamina.repaint();
		}
	}
	
}
