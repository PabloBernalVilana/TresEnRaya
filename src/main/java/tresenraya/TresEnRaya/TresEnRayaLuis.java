package TresEnRaya.tresenraya;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

	public class TresEnRaya extends JFrame implements ActionListener {
		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;							// Objeto privado mostrar panel
		private boolean player1 = true;						// Para jugador 1
		private boolean player2 = true;						// Para jugador 2
		private boolean isBusy[] = new boolean[9];			// Para no introducir valores repetidos
		
		JButton b1 = new JButton(); JButton b2 = new JButton(); JButton b3 = new JButton();
		JButton b4 = new JButton(); JButton b5 = new JButton(); JButton b6 = new JButton();
		JButton b7 = new JButton(); JButton b8 = new JButton(); JButton b9 = new JButton();
		
		JPanel c1 = new JPanel(); JPanel c2 = new JPanel(); JPanel c3 = new JPanel();
		JPanel c4 = new JPanel(); JPanel c5 = new JPanel(); JPanel c6 = new JPanel();
		JPanel c7 = new JPanel(); JPanel c8 = new JPanel(); JPanel c9 = new JPanel();
		
		protected TresEnRaya() {
			
//			c1.setVisible(true); c2.setVisible(true); c3.setVisible(true);
//			c4.setVisible(true); c5.setVisible(true); c6.setVisible(true);
//			c7.setVisible(true); c8.setVisible(true); c9.setVisible(true);
//			
//			b1.setVisible(true); b2.setVisible(true); b3.setVisible(true);
//			b4.setVisible(true); b5.setVisible(true); b6.setVisible(true);
//			b7.setVisible(true); b8.setVisible(true); b9.setVisible(true);
			
			// GUI
			setTitle("Películas");							// Título ventana
			setBounds(300, 150, 750, 400);					// Límites página/margen (posX, posY, anch, alt)
			setDefaultCloseOperation(EXIT_ON_CLOSE);		// Matar programa al cerrar
			
			contentPane = new JPanel();						// Inicializar contentPane como objeto
			contentPane.setLayout(null);					// Interfaz por defecto (null)
			setContentPane(contentPane);					// Mostrar contenido del objeto contentPane
			
								//______ROW 1______
			
			// BOX 1
			b1.setBounds(15, 15, 40, 40);					// Límites botón
			b1.setBackground(Color.white);					// Color
			c1.setBounds(10, 10, 50, 50);					// Límites botón
			c1.setBackground(Color.black);					// Color
			contentPane.add(b1);							// ANADIR
			contentPane.add(c1);							// AÑADIR
			
			
			// BOX 2
			b2.setBounds(75, 15, 40, 40);					// Límites botón
			b2.setBackground(Color.white);					// Color
			c2.setBounds(70, 10, 50, 50);					// Límites botón
			c2.setBackground(Color.black);					// Color
			contentPane.add(b2);							// ANADIR
			contentPane.add(c2);							// AÑADIR
			
			// BOX 3
			b3.setBounds(135, 15, 40, 40);					// Límites botón
			b3.setBackground(Color.white);					// Color
			c3.setBounds(130, 10, 50, 50);					// Límites botón
			c3.setBackground(Color.black);					// Color
			contentPane.add(b3);							// ANADIR
			contentPane.add(c3);							// AÑADIR
			
								//______ROW 2______
			// BOX 4
			b4.setBounds(15, 75, 40, 40);					// Límites botón
			b4.setBackground(Color.white);					// Color
			c4.setBounds(10, 70, 50, 50);					// Límites botón
			c4.setBackground(Color.black);					// Color
			contentPane.add(b4);							// ANADIR
			contentPane.add(c4);							// AÑADIR
			
			
			// BOX 5
			b5.setBounds(75, 75, 40, 40);					// Límites botón
			b5.setBackground(Color.white);					// Color
			c5.setBounds(70, 70, 50, 50);					// Límites botón
			c5.setBackground(Color.black);					// Color
			contentPane.add(b5);							// ANADIR
			contentPane.add(c5);							// AÑADIR
			
			// BOX 6
			b6.setBounds(135, 75, 40, 40);					// Límites botón
			b6.setBackground(Color.white);					// Color
			c6.setBounds(130, 70, 50, 50);					// Límites botón
			c6.setBackground(Color.black);					// Color
			contentPane.add(b6);							// ANADIR
			contentPane.add(c6);							// AÑADIR
			
								//______ROW 3______
			// BOX 7
			b7.setBounds(15, 135, 40, 40);					// Límites botón
			b7.setBackground(Color.white);					// Color
			c7.setBounds(10, 130, 50, 50);					// Límites botón
			c7.setBackground(Color.black);					// Color
			contentPane.add(b7);							// ANADIR
			contentPane.add(c7);							// AÑADIR
			
			
			// BOX 8
			b8.setBounds(75, 135, 40, 40);					// Límites botón
			b8.setBackground(Color.white);					// Color
			c8.setBounds(70, 130, 50, 50);					// Límites botón
			c8.setBackground(Color.black);					// Color
			contentPane.add(b8);							// ANADIR
			contentPane.add(c8);							// AÑADIR
			
			// BOX 9
			b9.setBounds(135, 135, 40, 40);					// Límites botón
			b9.setBackground(Color.white);					// Color
			c9.setBounds(130, 130, 50, 50);					// Límites botón
			c9.setBackground(Color.black);					// Color
			contentPane.add(b9);							// ANADIR
			contentPane.add(c9);							// AÑADIR
			
			setVisible(true);								// Visible como TRUE ya que default = FALSE
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
	}
	
}
