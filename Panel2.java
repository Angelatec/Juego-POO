import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Panel2 extends JPanel implements ActionListener{

	private JButton btselect,
					btselect1,
					btselect2;
	private JRadioButton opcion1,
						opcion2,
						opcion3,
						opcion4,
						opcion5;
	private JRadioButton opc1,
					opc2,
					opc3,
					opc4;

	
	private JRadioButton opcion11,
	opcion22,
	opcion33,
	opcion44,
	opcion55;
	private JLabel titulo1,
					titulo2,
					titulo3;
	public Panel2() {
		super();
		this.setPreferredSize(new Dimension(350,700));
		this.btselect=new JButton("Seleccionar opciones");

		this.titulo1= new JLabel("Indique cuales opciones negadas son falsas");
		this.opcion1= new JRadioButton("Un.(x)Un.(y),MismaColumna(x,y)->MismoColor(x,y)");
		this.opcion2= new JRadioButton("Un.(t),Circulo(t)->(Ex.(t)derechaDe(b,t))");
		this.opcion3= new JRadioButton("Un.(x)Un.(y),MismaFila(x,y)->(Un.(t)Azul(t)vRojo(t))");
		this.opcion4= new JRadioButton("Ex.(t),Cuadrado(t)^Azul(t)");
		this.opcion5= new JRadioButton("Ex.(t), Pentagono(t)->Rojo(t)");
		

		this.btselect.addActionListener(this);
		this.add(titulo1);
		this.add(opcion1);
		this.add(opcion2);
		this.add(opcion3);
		this.add(opcion4);
		this.add(opcion5);
		this.add(btselect);
		
		this.btselect1=new JButton("Seleccionar opciones");

		this.titulo2= new JLabel("¿Cuáles afirmaciones son verdaderas?");
		this.opc1= new JRadioButton("Universal(t), Circulo(t)->Rojo(t)");
		this.opc2= new JRadioButton("Existencial(t), Triangulo(t)^Rojo(t)");
		this.opc3= new JRadioButton("Existencial(t), Cuadrado(t)^DerechaDe(d,t)");
		this.opc4= new JRadioButton("Universal(t), Estrella(t)->Azul(t)");

		

		this.btselect1.addActionListener(this);
		this.add(titulo2);
		this.add(opc1);
		this.add(opc2);
		this.add(opc3);
		this.add(opc4);
		this.add(btselect1);
		
		this.btselect2=new JButton("Seleccionar opciones");
		this.titulo3= new JLabel("Seleccione las opciones correctas");
		this.opcion11= new JRadioButton(".Exi.(x,y),MismoColor(x,y)->MismaFor(x,y)");
		this.opcion22= new JRadioButton("Un.(t),Triangulo(t)^Azul(t))");
		this.opcion33= new JRadioButton(".Un.(t), Triangulo(t)->Azul(t)");
		this.opcion44= new JRadioButton(".Un.(t), Estrella(t)->Azul(t)");
		this.opcion55= new JRadioButton(".Exi(t), (Circulo(t)^Azul(t))->DerechaDe(e,t)");
		this.btselect2.addActionListener(this);
		this.add(titulo3);
		this.add(opcion11);
		this.add(opcion22);
		this.add(opcion33);
		this.add(opcion44);
		this.add(opcion55);
		this.add(btselect2);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btselect) {
			if(this.opcion1.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			
			}else if(this.opcion4.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
				
			}else if(this.opcion2.isSelected()&&this.opcion3.isSelected()&&this.opcion5.isSelected()) {
				JOptionPane.showInputDialog("Felicidades es correcto");
	
			}else {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			}
		}else if(e.getSource()==btselect1) {
			if(this.opc1.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			}else if(this.opc2.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			}else if(this.opc3.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			}else if(this.opc4.isSelected()) {
				JOptionPane.showInputDialog("Felicidades es correcto");
			}else {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			}
		
		}else if(e.getSource()==btselect2) {
			if(this.opcion22.isSelected()) {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
			
			}else if(this.opcion11.isSelected()&&this.opcion33.isSelected()&&this.opcion44.isSelected()&&this.opcion55.isSelected()) {
				JOptionPane.showInputDialog("Felicidades es correcto");
	
			}else {
				JOptionPane.showInputDialog("Lo lamento es incorrecto, intente otra vez");
		
			}
		}
	}
}	
	
	