package mysql_sistema.cap_03_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	// atributi
	private JFrame frame;
	private JTextField textFieldnome;
	private JTextField textField_matricola;

	// lanzo la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DB window = new DB();
				window.frame.setVisible(true);
			}
		});
	}

	// costructor
	public DB() {
		initialize();
	}

	// metodo
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); // layout absolute

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(36, 26, 61, 16);
		frame.getContentPane().add(lblNombre);

		final JLabel lblMatricula = new JLabel("Matricula");/// ???????? senza final da errore				
		lblMatricula.setBounds(36, 65, 61, 16);
		frame.getContentPane().add(lblMatricula);

		// botone per aggiungere
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(31, 132, 117, 29);
		frame.getContentPane().add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/java-intermedio", "root", "yategane");

					Statement statement = conexion.createStatement();

					String nombre = textFieldnome.getText();
					((java.sql.Statement) statement).executeUpdate("insert into alumnos(nombre)values('" + nombre + "')");
					conexion.close();

				} catch (ClassNotFoundException o) {
					o.printStackTrace();
				} catch (SQLException l) {
					l.printStackTrace();
				}
			}
		});

	
		// botone per cercare
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(31, 173, 117, 29);
		frame.getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_matricola.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-intermedio", "root", "yategane");
					
					Statement statement = conexion.createStatement();
					ResultSet resultset = statement.executeQuery("Select nombre from alumnos where matricula=" + id);

					if (resultset.next() == true) {
						lblMatricula.setText(resultset.getString("nombre"));
					}
					conexion.close();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		//  borrar
		JButton btnBorrar = new JButton("borrar");
		btnBorrar.setBounds(31, 214, 117, 29);
		frame.getContentPane().add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_matricola.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/java-intermedio", "root", "yategane");
					
					Statement statement = conexion.createStatement();
					
					String query ="DELETE from alumnos where matricula ="+id;
					statement.executeUpdate(query);
					
					conexion.close();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		

		textFieldnome = new JTextField("nome");
		textFieldnome.setBounds(109, 21, 130, 26);
		frame.getContentPane().add(textFieldnome);
		textFieldnome.setColumns(10);

		textField_matricola = new JTextField(" matricola");
		textField_matricola.setBounds(109, 60, 130, 26);
		frame.getContentPane().add(textField_matricola);
		textField_matricola.setColumns(10);
	}
}
