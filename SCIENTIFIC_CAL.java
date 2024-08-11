import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class ScientificCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private JPanel panel;
    private String[] buttons = {
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "sin",
            "1", "2", "3", "-", "cos",
            "0", ".", "=", "+", "tan",
            "log", "ln", "^", "(", ")",
            "C"
    };
    private JButton[] buttonObjects = new JButton[buttons.length];

    public ScientificCalculator() {
        display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(400, 50));

        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 5, 5, 5));

        for (int i = 0; i < buttons.length; i++) {
            buttonObjects[i] = new JButton(buttons[i]);
            buttonObjects[i].addActionListener(this);
            panel.add(buttonObjects[i]);
        }

        this.setLayout(new BorderLayout());
        this.add(display, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        this.setTitle("Scientific Calculator");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            display.setText(evaluate(display.getText()));
        } else if (command.equals("sqrt")) {
            display.setText(String.valueOf(Math.sqrt(Double.parseDouble(display.getText()))));
        } else if (command.equals("sin")) {
            display.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(display.getText())))));
        } else if (command.equals("cos")) {
            display.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(display.getText())))));
        } else if (command.equals("tan")) {
            display.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(display.getText())))));
        } else if (command.equals("log")) {
            display.setText(String.valueOf(Math.log10(Double.parseDouble(display.getText()))));
        } else if (command.equals("ln")) {
            display.setText(String.valueOf(Math.log(Double.parseDouble(display.getText()))));
        } else {
            display.setText(display.getText() + command);
        }
    }

    private String evaluate(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                StringBuilder num = new StringBuilder();
                while ((Character.isDigit(c) || c == '.') && i < expression.length()) {
                    num.append(c);
                    i++;
                    if (i < expression.length()) {
                        c = expression.charAt(i);
                    }
                }
                i--;
                numbers.push(Double.parseDouble(num.toString()));
            } else if (c == '(') {
                operations.push(c);
            } else if (c == ')') {
                while (operations.peek() != '(') {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.pop();
            } else if (isOperator(c)) {
                while (!operations.isEmpty() && precedence(c) <= precedence(operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return String.valueOf(numbers.pop());
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
            case '^':
                return Math.pow(a, b);
        }
        return 0;
    }
}
