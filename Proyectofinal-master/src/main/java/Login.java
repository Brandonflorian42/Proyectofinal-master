import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog {
    private JTextField tfUsuario;
    private JPasswordField pfPassword;
    private JButton btnIngresar;
    private JButton btnSalir;
    private JPanel Login;

    public Login(JFrame parent) {
        super(parent);
        setTitle("Inicio de Sesión");
        setContentPane(Login);
        setSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = tfUsuario.getText();
                char[] contrasena = pfPassword.getPassword();

                if (usuario.equals("Brandon") && String.valueOf(contrasena).equals("123")) {
                    openInscripcionesWindow();
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Credenciales incorrectas", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void openInscripcionesWindow() {
        // Crear y mostrar la ventana de Inscripciones
        Inscripciones inscripciones = new Inscripciones();
        inscripciones.setVisible(true);

        // Cerrar la ventana de Login
        this.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login(null); // El padre es null ya que no hay un JFrame principal
                login.setVisible(true);
            }
        });
    }
}
