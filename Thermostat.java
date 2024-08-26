import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Thermostat implements ActionListener
{
    private JFrame frame;
    private JPanel panel;
    private JPanel home;
    private JPanel lockscrn;
    private JLabel welcome;
    private JLabel pass;
    private JTextField enter;
    private JLabel enterPass;
    private JTextField inputPass;
    private JButton unlock;
    private JLabel temp;
    private JLabel mode;
    private JLabel blank;
    private JLabel blank2;
    private JLabel blank3;
    private JButton set;
    private JButton up;
    private JButton down;
    private JButton cool;
    private JButton heat;
    private JButton off;
    private int degree;
    private String d;
    private String password;

    public Thermostat()

    {
        Temp temperature = new Temp();
        degree = temperature.getTemp();
        d = Integer.toString(degree);

        frame = new JFrame();

        home = new JPanel();
        home.setBorder(BorderFactory.createEmptyBorder(300,300, 300, 300));
        home.setLayout(new GridLayout(2, 3));

        welcome = new JLabel("Welcome to your Thermostat");
        welcome.setFont(new Font(null, Font.BOLD, 12));

        pass = new JLabel("Enter a 4 Digit Password:");
        enter = new JTextField();
        set = new JButton("Set Password");
        blank2 = new JLabel();
        blank3 = new JLabel();
        home.add(blank2);
        home.add(welcome);
        home.add(blank3);
        home.add(pass);
        home.add(enter);
        home.add(set);
        set.addActionListener(this);
        frame.add(home);

        lockscrn = new JPanel();
        lockscrn.setBorder(BorderFactory.createEmptyBorder(300,300, 300, 300));
        lockscrn.setLayout(new GridLayout(1, 3));

        enterPass = new JLabel("Enter Password to Unlock");
        lockscrn.add(enterPass);

        inputPass = new JTextField();
        lockscrn.add(inputPass);

        unlock = new JButton("Unlock");
        unlock.addActionListener(this);
        lockscrn.add(unlock);

        temp = new JLabel("   " + d);
        temp.setFont(new Font(null, Font.BOLD, 35));

        up = new JButton("+");
        down = new JButton("-");
        up.addActionListener(this);
        down.addActionListener(this);
        
        cool = new JButton("COOL");
        cool.setForeground(Color.BLUE);
        heat = new JButton("HEAT");
        heat.setForeground(Color.RED);
        off = new JButton("OFF");

        mode = new JLabel("Mode");
        mode.setFont(new Font(null, Font.BOLD, 30));

        blank = new JLabel();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300,300, 300, 300));
        panel.setLayout(new GridLayout(2,4));

        panel.add(blank);
        panel.add(down);
        panel.add(temp);
        panel.add(up);

        panel.add(mode);
        panel.add(heat);
        panel.add(cool);
        panel.add(off);

        frame.setTitle("Simple T-Stat");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Thermostat();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == unlock){
           String p = inputPass.getText();
           if(p.equals(password)){
            frame.add(panel);
            lockscrn.setVisible(false);
           }
           else{
            enterPass.setText("Incorrect Password");
            enterPass.setForeground((Color.RED));
           }
        }
        if(e.getSource()== set){
            String input = enter.getText();
            if(CheckDigits(input)){
                password = input;
                frame.add(lockscrn);
                home.setVisible(false);
            }
            else{
                pass.setForeground(Color.RED);
            }
        }

        if(e.getSource() == up){
            if(degree < 90){
                degree +=1;
                d = Integer.toString(degree);
                temp.setText("   " + d);
            }
        }
        else if(e.getSource() == down){
            if(degree > 64){
                degree -=1;
                d = Integer.toString(degree);
                temp.setText("   " + d);
            }
        }

        if(e.getSource() == cool){
            temp.setForeground(Color.BLUE);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

public static boolean CheckDigits(String input){
    if (input == null || input.length() != 4){
        return false;
    }
    for (char c : input.toCharArray()){
        if (!Character.isDigit(c)){
            return false;
        }
    }
    return true;
}
}