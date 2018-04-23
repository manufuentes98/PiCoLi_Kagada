package vista;

import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class VistaPrincipal extends JFrame{
	protected JLabel puntosMonedas;
	protected JPanel cola;
	protected JPanel pilaUno;
	protected JPanel pilaDos;
	protected JPanel lista;
	protected JPanel panelSeleccionarColor;
	protected JPanel panelPedirColor;
	protected JButton botonPedirColor;
	protected JPanel panelBarajarPila;
	protected JButton botonBarajarPila;
	protected JPanel panelBorrarColor;
	protected JButton botonBorrarColor;
	protected JLabel mensaje;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnX;
	
	public VistaPrincipal() {
		getContentPane().setBackground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 14};
		gridBagLayout.rowHeights = new int[] {37, 20, 44, 48, 28, 40, 32, 20, 10};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel titulo = new JLabel("PI-CO-LI");
		titulo.setMinimumSize(new Dimension(300, 40));
		titulo.setForeground(new Color(25, 25, 112));
		titulo.setFont(new Font("Algerian", Font.BOLD, 30));
		titulo.setHorizontalTextPosition(SwingConstants.LEADING);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.gridwidth = 12;
		gbc_titulo.insets = new Insets(0, 0, 5, 0);
		gbc_titulo.fill = GridBagConstraints.BOTH;
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		getContentPane().add(titulo, gbc_titulo);
		
		cola = new JPanel();
		cola.setBorder(new LineBorder(new Color(0, 0, 255)));
		cola.setBackground(new Color(240, 248, 255));
		GridBagConstraints gbc_cola = new GridBagConstraints();
		gbc_cola.gridheight = 5;
		gbc_cola.insets = new Insets(0, 0, 5, 5);
		gbc_cola.fill = GridBagConstraints.BOTH;
		gbc_cola.gridx = 0;
		gbc_cola.gridy = 1;
		getContentPane().add(cola, gbc_cola);
		cola.setLayout(new GridLayout(9, 1, 0, 0));
		
		pilaUno = new JPanel();
		pilaUno.setBorder(new LineBorder(new Color(0, 0, 255), 1, true));
		pilaUno.setBackground(new Color(240, 248, 255));
		GridBagConstraints gbc_pilaUno = new GridBagConstraints();
		gbc_pilaUno.gridheight = 5;
		gbc_pilaUno.insets = new Insets(0, 0, 5, 5);
		gbc_pilaUno.fill = GridBagConstraints.BOTH;
		gbc_pilaUno.gridx = 1;
		gbc_pilaUno.gridy = 1;
		getContentPane().add(pilaUno, gbc_pilaUno);
		pilaUno.setLayout(new GridLayout(4, 1, 0, 0));
		
		pilaDos = new JPanel();
		pilaDos.setBorder(new LineBorder(new Color(0, 0, 255), 1, true));
		pilaDos.setBackground(new Color(240, 248, 255));
		GridBagConstraints gbc_pilaDos = new GridBagConstraints();
		gbc_pilaDos.gridheight = 5;
		gbc_pilaDos.insets = new Insets(0, 0, 5, 5);
		gbc_pilaDos.fill = GridBagConstraints.BOTH;
		gbc_pilaDos.gridx = 2;
		gbc_pilaDos.gridy = 1;
		getContentPane().add(pilaDos, gbc_pilaDos);
		pilaDos.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel tituloMonedas = new JLabel("Monedas");
		tituloMonedas.setHorizontalTextPosition(SwingConstants.LEADING);
		tituloMonedas.setHorizontalAlignment(SwingConstants.RIGHT);
		tituloMonedas.setPreferredSize(new Dimension(43, 24));
		tituloMonedas.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		tituloMonedas.setMinimumSize(new Dimension(46, 24));
		tituloMonedas.setMaximumSize(new Dimension(46, 24));
		GridBagConstraints gbc_tituloMonedas = new GridBagConstraints();
		gbc_tituloMonedas.fill = GridBagConstraints.BOTH;
		gbc_tituloMonedas.gridwidth = 7;
		gbc_tituloMonedas.insets = new Insets(0, 0, 5, 5);
		gbc_tituloMonedas.gridx = 3;
		gbc_tituloMonedas.gridy = 1;
		getContentPane().add(tituloMonedas, gbc_tituloMonedas);
		
		puntosMonedas = new JLabel("0");
		puntosMonedas.setForeground(new Color(255, 165, 0));
		puntosMonedas.setFont(new Font("Stencil", Font.BOLD, 20));
		puntosMonedas.setMaximumSize(new Dimension(1888, 1111));
		puntosMonedas.setMinimumSize(new Dimension(44, 20));
		puntosMonedas.setHorizontalTextPosition(SwingConstants.CENTER);
		puntosMonedas.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_puntosMonedas = new GridBagConstraints();
		gbc_puntosMonedas.gridwidth = 2;
		gbc_puntosMonedas.fill = GridBagConstraints.BOTH;
		gbc_puntosMonedas.insets = new Insets(0, 0, 5, 0);
		gbc_puntosMonedas.gridx = 10;
		gbc_puntosMonedas.gridy = 1;
		getContentPane().add(puntosMonedas, gbc_puntosMonedas);
		
		lista = new JPanel();
		lista.setBorder(new LineBorder(new Color(0, 0, 255), 1, true));
		lista.setBackground(new Color(240, 248, 255));
		GridBagConstraints gbc_lista = new GridBagConstraints();
		gbc_lista.gridwidth = 9;
		gbc_lista.gridheight = 4;
		gbc_lista.insets = new Insets(0, 0, 5, 0);
		gbc_lista.fill = GridBagConstraints.BOTH;
		gbc_lista.gridx = 3;
		gbc_lista.gridy = 2;
		getContentPane().add(lista, gbc_lista);
		lista.setLayout(new GridLayout(5, 7, 0, 0));
		
		panelSeleccionarColor = new JPanel();
		GridBagConstraints gbc_panelSeleccionarColor = new GridBagConstraints();
		gbc_panelSeleccionarColor.gridwidth = 3;
		gbc_panelSeleccionarColor.insets = new Insets(0, 0, 5, 5);
		gbc_panelSeleccionarColor.fill = GridBagConstraints.BOTH;
		gbc_panelSeleccionarColor.gridx = 0;
		gbc_panelSeleccionarColor.gridy = 6;
		getContentPane().add(panelSeleccionarColor, gbc_panelSeleccionarColor);
		panelSeleccionarColor.setLayout(new BoxLayout(panelSeleccionarColor, BoxLayout.X_AXIS));
		
		label = new JLabel(" ");
		label.setMaximumSize(new Dimension(222, 222));
		label.setBackground(new Color(255, 0, 0));
		label.setOpaque(true);
		panelSeleccionarColor.add(label);
		
		label_1 = new JLabel(" ");
		label_1.setOpaque(true);
		label_1.setBackground(Color.GREEN);
		label_1.setMaximumSize(new Dimension(222, 222));
		panelSeleccionarColor.add(label_1);
		
		label_2 = new JLabel(" ");
		label_2.setOpaque(true);
		label_2.setBackground(Color.BLUE);
		label_2.setMaximumSize(new Dimension(222, 222));
		panelSeleccionarColor.add(label_2);
		
		btnX = new JButton("");
		btnX.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnX.setMargin(new Insets(0, 0, 0, 0));
		btnX.setMinimumSize(new Dimension(5, 5));
		btnX.setMaximumSize(new Dimension(222, 222));
		panelSeleccionarColor.add(btnX);
		
		panelPedirColor = new JPanel();
		GridBagConstraints gbc_panelPedirColor = new GridBagConstraints();
		gbc_panelPedirColor.gridwidth = 3;
		gbc_panelPedirColor.insets = new Insets(0, 0, 5, 5);
		gbc_panelPedirColor.fill = GridBagConstraints.BOTH;
		gbc_panelPedirColor.gridx = 3;
		gbc_panelPedirColor.gridy = 6;
		getContentPane().add(panelPedirColor, gbc_panelPedirColor);
		panelPedirColor.setLayout(new BoxLayout(panelPedirColor, BoxLayout.X_AXIS));
		
		botonPedirColor = new JButton("Pedir Color");
		botonPedirColor.setMinimumSize(new Dimension(10, 22));
		botonPedirColor.setMaximumSize(new Dimension(999, 33));
		botonPedirColor.setBackground(new Color(255, 204, 0));
		panelPedirColor.add(botonPedirColor);
		
		panelBarajarPila = new JPanel();
		GridBagConstraints gbc_panelBarajarPila = new GridBagConstraints();
		gbc_panelBarajarPila.gridwidth = 3;
		gbc_panelBarajarPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelBarajarPila.fill = GridBagConstraints.BOTH;
		gbc_panelBarajarPila.gridx = 6;
		gbc_panelBarajarPila.gridy = 6;
		getContentPane().add(panelBarajarPila, gbc_panelBarajarPila);
		panelBarajarPila.setLayout(new BoxLayout(panelBarajarPila, BoxLayout.X_AXIS));
		
		botonBarajarPila = new JButton("Barajar Pila");
		botonBarajarPila.setMinimumSize(new Dimension(10, 22));
		botonBarajarPila.setMaximumSize(new Dimension(999, 33));
		botonBarajarPila.setBackground(new Color(255, 204, 0));
		panelBarajarPila.add(botonBarajarPila);
		
		panelBorrarColor = new JPanel();
		GridBagConstraints gbc_panelBorrarColor = new GridBagConstraints();
		gbc_panelBorrarColor.gridwidth = 3;
		gbc_panelBorrarColor.insets = new Insets(0, 0, 5, 0);
		gbc_panelBorrarColor.fill = GridBagConstraints.BOTH;
		gbc_panelBorrarColor.gridx = 9;
		gbc_panelBorrarColor.gridy = 6;
		getContentPane().add(panelBorrarColor, gbc_panelBorrarColor);
		panelBorrarColor.setLayout(new BoxLayout(panelBorrarColor, BoxLayout.X_AXIS));
		
		botonBorrarColor = new JButton("Borrar Color");
		botonBorrarColor.setMinimumSize(new Dimension(10, 22));
		botonBorrarColor.setMaximumSize(new Dimension(999, 33));
		botonBorrarColor.setBackground(new Color(255, 204, 0));
		panelBorrarColor.add(botonBorrarColor);
		
		mensaje = new JLabel("mensaje");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setBorder(new LineBorder(new Color(255, 222, 173), 1, true));
		mensaje.setPreferredSize(new Dimension(40, 15));
		GridBagConstraints gbc_mensaje = new GridBagConstraints();
		gbc_mensaje.fill = GridBagConstraints.BOTH;
		gbc_mensaje.gridwidth = 12;
		gbc_mensaje.gridx = 0;
		gbc_mensaje.gridy = 7;
		getContentPane().add(mensaje, gbc_mensaje);
	}
	
}
