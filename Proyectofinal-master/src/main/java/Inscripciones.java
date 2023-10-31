import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inscripciones extends JFrame {
    private JPanel loginPanel;
    private JPanel listPanel;
    private JList<String> list;
    private JTextField tfID;
    private JTextField tfNombre;
    private JTextField tfApellido;
    private JButton btnMostrar;
    private JButton btnEliminar;
    private JButton btnInscribir;
    private JTextField tfEmail;
    private JComboBox<String> jcbCursos;
    private JPanel Login2;
    private JButton bntMostrar;
    private JButton bntEliminar;
    private JButton bntInscribir;
    private JList list1;

    public Inscripciones() {
        setTitle("Inscripciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Crear el panel principal (loginPanel) con fondo azul
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(8, 2));
        loginPanel.setBackground(new Color(0, 0, 128)); // Fondo azul

        // Elementos del formulario
        // Elementos del formulario
        JLabel idLabel = new JLabel("ID Estudiante:");
        idLabel.setForeground(Color.WHITE); // Cambia el color de la fuente a blanco
        tfID = new JTextField(10);

        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setForeground(Color.WHITE); // Cambia el color de la fuente a blanco
        tfNombre = new JTextField(10);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setForeground(Color.WHITE); // Cambia el color de la fuente a blanco
        tfApellido = new JTextField(10);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.WHITE); // Cambia el color de la fuente a blanco
        tfEmail = new JTextField(10);


        JLabel courseLabel = new JLabel("Curso:");
        String[] courses = {"Matemáticas", "Programación", "Microeconomía"};
        lastNameLabel.setForeground(Color.WHITE);
        jcbCursos = new JComboBox<>(courses);



        btnInscribir = new JButton("Inscribir");
        btnMostrar = new JButton("Mostrar");
        btnEliminar = new JButton("Eliminar");

        // Lista de inscripciones
        DefaultListModel<String> model = new DefaultListModel<>();
        list = new JList<>(model);

        // Agregar elementos al panel
        loginPanel.add(idLabel);
        loginPanel.add(tfID);
        loginPanel.add(nameLabel);
        loginPanel.add(tfNombre);
        loginPanel.add(lastNameLabel);
        loginPanel.add(tfApellido);
        loginPanel.add(emailLabel);
        loginPanel.add(tfEmail);
        loginPanel.add(courseLabel);
        loginPanel.add(jcbCursos);
        loginPanel.add(btnInscribir);
        loginPanel.add(btnMostrar);
        loginPanel.add(btnEliminar);

        // Crear un panel para la lista
        listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JScrollPane(list));

        // Agregar paneles al JFrame
        add(loginPanel, BorderLayout.NORTH);
        add(listPanel, BorderLayout.CENTER);

        // Eventos de los botones
        btnInscribir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idEstudiante = tfID.getText();
                String nombre = tfNombre.getText();
                String apellido = tfApellido.getText();
                String email = tfEmail.getText();
                String curso = (String) jcbCursos.getSelectedItem();

                if (idEstudiante.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || curso.isEmpty()) {
                    JOptionPane.showMessageDialog(Inscripciones.this, "Ingrese los datos faltantes", "Error de inscripción", JOptionPane.ERROR_MESSAGE);
                } else {
                    String inscripcion = "ID: " + idEstudiante + " Nombre: " + nombre + " Apellido: " + apellido + " Email: " + email + " Curso: " + curso;
                    model.addElement(inscripcion);
                    clearFields();
                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!list.isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(Inscripciones.this, "Datos seleccionados:\n" + list.getSelectedValue(), "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!list.isSelectionEmpty()) {
                    model.remove(list.getSelectedIndex());
                }
            }
        });
    }

    private void clearFields() {
        tfID.setText("");
        tfNombre.setText("");
        tfApellido.setText("");
        tfEmail.setText("");
        jcbCursos.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Inscripciones inscripciones = new Inscripciones();
                inscripciones.setVisible(true);
            }
        });
    }
}