package tresenraya.TresEnRaya;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class InterfazGrafica extends JFrame {

	// Interfaz grafica
	private static final long serialVersionUID = 1L;
	// paneles
	private JPanel panelContenedor;
	private JPanel panelJuego;
	private JPanel panelJugador1;
	private JPanel panelJugador2;
	
	// etiquetas
	private JLabel etiquetaJugador1;
	private JLabel etiquetaJugador2;
	private JLabel etiquetaNombreJ1;
	private JLabel etiquetaTipoJ1;
	private JLabel etiquetaNombreJ2;
	private JLabel etiquetaTipoJ2;
	// areas de texto
	private JTextArea textAreaJugador1;
	private JTextArea textAreaJugador2;
	private JTextArea textAreaEventoJ1;
	private JTextArea textAreaEventoJ2;
	// botones tablero
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	// boton nueva partida
	private JButton nuevaPartida;
	// radio butons
	private JRadioButton humanoJ1;
	private JRadioButton CPUJ1;
	private JRadioButton humanoJ2;
	private JRadioButton CPUJ2;
	// Variables
	private final String jugador1 = "Jugador 1";
	private final String jugador2 = "Jugador 2";
	private final String nombre = "Nombre:";
	private final String tipo = "Tipo:";
	private final String humanoString = "Humano";
	private final String CPUString = "CPU";
	private final String nuevaPartidaJ1 = "Nueva Partida";
	// private char player = 0;
	// private char win = 0;
	// private String tableroArray[] = new String[9]; // Para rellenar el tablero
	// private boolean isStart = true;

	// Variables dimensiones
	private final int dimensionPaneles = 425;


	public void crearVentana() {
		// añadimos el titulo
		setTitle("Ventana con más interacción");
		// configuramos dimensiones ventana
		setBounds(400, 25, 1000, 1000);
		// iniciar componentes
		iniciarComponentes();
		// al cerrar la ventana se para la app
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// nos hace visible la ventana
		setVisible(true);

	}

	public void iniciarComponentes() {
		colocarPanel();
		colocarBotones();
		colocarEtiquetas();
		colocarTextArea();
		colocarRadioButons();
		/*
		 * if (isStart) { getChar(); isStart = false; } resultado();
		 */
	}

	private void colocarEtiquetas() {
		// Nombre J1
		etiquetaNombreJ1 = new JLabel();
		etiquetaNombreJ1.setBounds(75, 250, 80, 30);
		etiquetaNombreJ1.setOpaque(true);
		etiquetaNombreJ1.setBackground(Color.LIGHT_GRAY);
		etiquetaNombreJ1.setText(nombre);
		// Tipo J1
		etiquetaTipoJ1 = new JLabel();
		etiquetaTipoJ1.setText(tipo);
		etiquetaTipoJ1.setBounds(75, 350, 80, 30);
		etiquetaTipoJ1.setOpaque(true);
		etiquetaTipoJ1.setBackground(Color.LIGHT_GRAY);
		// Nombre J2
		etiquetaNombreJ2 = new JLabel();
		etiquetaNombreJ2.setBounds(75, 250, 80, 30);
		etiquetaNombreJ2.setOpaque(true);
		etiquetaNombreJ2.setBackground(Color.LIGHT_GRAY);
		etiquetaNombreJ2.setText(nombre);
		// Tipo J2
		etiquetaTipoJ2 = new JLabel();
		etiquetaTipoJ2.setText(tipo);
		etiquetaTipoJ2.setBounds(75, 350, 80, 30);
		etiquetaTipoJ2.setOpaque(true);
		etiquetaTipoJ2.setBackground(Color.LIGHT_GRAY);
		// Jugador 1
		etiquetaJugador1 = new JLabel();
		etiquetaJugador1.setText(jugador1);
		etiquetaJugador1.setBounds(75, 200, 80, 30);
		etiquetaJugador1.setOpaque(true);
		etiquetaJugador1.setBackground(Color.LIGHT_GRAY);
		panelJugador1.add(etiquetaJugador1);
		panelJugador1.add(etiquetaTipoJ1);
		panelJugador1.add(etiquetaNombreJ1);
		// Jugador 2
		etiquetaJugador2 = new JLabel();
		etiquetaJugador2.setBounds(75, 200, 80, 30);
		etiquetaJugador2.setOpaque(true);
		etiquetaJugador2.setBackground(Color.LIGHT_GRAY);
		etiquetaJugador2.setText(jugador2);
		panelJugador2.add(etiquetaJugador2);
		panelJugador2.add(etiquetaTipoJ2);
		panelJugador2.add(etiquetaNombreJ2);

	}

	public void colocarPanel() {

		// Creacion del panel Contenedor
		panelContenedor = new JPanel();
		panelContenedor.setBackground(Color.LIGHT_GRAY);
		panelContenedor.setLayout(null);
		// panel contenedor tablero
		panelJuego = new JPanel();
		panelJuego.setBackground(Color.DARK_GRAY);
		panelJuego.setBounds(10, 250, dimensionPaneles, dimensionPaneles);

		// paneles tablero
		panelJugador1 = new JPanel();
		panelJugador1.setBackground(Color.DARK_GRAY);
		panelJugador1.setBounds(545, 10, dimensionPaneles, dimensionPaneles);
		panelJugador1.setLayout(null);
		// panel jugador 2
		panelJugador2 = new JPanel();
		panelJugador2.setBackground(Color.DARK_GRAY);
		panelJugador2.setBounds(545, 520, dimensionPaneles, dimensionPaneles);
		panelJugador2.setLayout(null);
		// añadir paneles al panel contenedor
		setContentPane(panelContenedor);

		panelContenedor.add(panelJuego);
		// añadir paneles al tablero
		panelJuego.setLayout(new GridLayout(3, 3));

		// añadir panel jugadores al panel contenedor
		panelContenedor.add(panelJugador1);
		panelContenedor.add(panelJugador2);
	}

	private void colocarRadioButons() {
		humanoJ1 = new JRadioButton();
		humanoJ1.setText(humanoString);
		humanoJ1.setBounds(160, 350, 75, 30);
		panelJugador1.add(humanoJ1);

		CPUJ1 = new JRadioButton();
		CPUJ1.setText(CPUString);
		CPUJ1.setBounds(240, 350, 75, 30);
		panelJugador1.add(CPUJ1);

		humanoJ2 = new JRadioButton();
		humanoJ2.setText(humanoString);
		humanoJ2.setBounds(160, 350, 75, 30);
		panelJugador2.add(humanoJ2);

		CPUJ2 = new JRadioButton();
		CPUJ2.setText(CPUString);
		CPUJ2.setBounds(240, 350, 75, 30);
		panelJugador2.add(CPUJ2);
	}

	private void colocarTextArea() {
		// Jugador 1
		textAreaJugador1 = new JTextArea();
		textAreaJugador1.setBounds(160, 250, 80, 30);
		textAreaJugador1.setBackground(Color.LIGHT_GRAY);
		panelJugador1.add(textAreaJugador1);

		textAreaEventoJ1 = new JTextArea();
		textAreaEventoJ1.setBounds(75, 150, 200, 30);
		textAreaEventoJ1.setBackground(Color.LIGHT_GRAY);
		textAreaEventoJ1.setEditable(false);
		panelJugador1.add(textAreaEventoJ1);
		// Jugador 2
		textAreaJugador2 = new JTextArea();
		textAreaJugador2.setBounds(160, 250, 80, 30);
		textAreaJugador2.setBackground(Color.LIGHT_GRAY);
		panelJugador2.add(textAreaJugador2);

		textAreaEventoJ2 = new JTextArea();
		textAreaEventoJ2.setBounds(75, 150, 200, 30);
		textAreaEventoJ2.setBackground(Color.LIGHT_GRAY);
		textAreaEventoJ2.setEditable(false);
		panelJugador2.add(textAreaEventoJ2);
	}

	private void colocarBotones() {
		nuevaPartida = new JButton();
		nuevaPartida.setBounds(150, 75, 135, 30);
		nuevaPartida.setText(nuevaPartidaJ1);
		nuevaPartida.setBackground(Color.LIGHT_GRAY);
		panelJugador1.add(nuevaPartida);
		// botones tablero
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();

		panelJuego.add(b1);
		panelJuego.add(b2);
		panelJuego.add(b3);
		panelJuego.add(b4);
		panelJuego.add(b5);
		panelJuego.add(b6);
		panelJuego.add(b7);
		panelJuego.add(b8);
		panelJuego.add(b9);

		
	}

	

}
