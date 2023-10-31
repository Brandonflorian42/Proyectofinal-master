import javax.swing.*;
import java.awt.*;

public class MostrarDatos {
    private JFrame frame;
    private JPanel panel;

    public MostrarDatos(String idEstudiante, String nombre, String apellido, String email, String curso, String idInscripcion, String idCurso, String fechaInscripcion) {
        frame = new JFrame("Mostrar Datos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        JLabel idLabel = new JLabel("ID Estudiante:");
        JLabel idField = new JLabel(idEstudiante);

        JLabel nameLabel = new JLabel("Nombre:");
        JLabel nameField = new JLabel(nombre);

        JLabel lastNameLabel = new JLabel("Apellido:");
        JLabel lastNameField = new JLabel(apellido);

        JLabel emailLabel = new JLabel("Email:");
        JLabel emailField = new JLabel(email);

        JLabel courseLabel = new JLabel("Curso:");
        JLabel courseField = new JLabel(curso);

        JLabel idInscripcionLabel = new JLabel("ID Inscripción:");
        JLabel idInscripcionField = new JLabel(idInscripcion);

        JLabel idCursoLabel = new JLabel("ID Curso:");
        JLabel idCursoField = new JLabel(idCurso);

        JLabel fechaInscripcionLabel = new JLabel("Fecha de Inscripción:");
        JLabel fechaInscripcionField = new JLabel(fechaInscripcion);

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(courseLabel);
        panel.add(courseField);
        panel.add(idInscripcionLabel);
        panel.add(idInscripcionField);
        panel.add(idCursoLabel);
        panel.add(idCursoField);
        panel.add(fechaInscripcionLabel);
        panel.add(fechaInscripcionField);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}