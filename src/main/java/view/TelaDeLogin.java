package view;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaDeLogin extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 230);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        // Cor de fundo do painel
        panel.setBackground(new Color(240, 240, 240));

        JLabel titleLabel = new JLabel("Bem-Vindo!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(150, 20, 200, 30);
        panel.add(titleLabel);

        JLabel usernameLabel = new JLabel("Nome de Usuário:");
        usernameLabel.setBounds(50, 60, 120, 20);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField(20);
        usernameField.setBounds(180, 60, 150, 20);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(50, 90, 120, 20);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(180, 90, 150, 20);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 120, 100, 30);
        // Cores de fundo e texto do botão
        loginButton.setBackground(new Color(0, 128, 255)); // Azul
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                // Faça a validação aqui (substitua isso pela lógica real de autenticação)
                if (username.equals("usuario") && String.valueOf(password).equals("senha")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Nome de usuário ou senha incorretos.");
                }
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        frame.setVisible(true);
    }
}

