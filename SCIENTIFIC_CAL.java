import java.util.Scanner;

public class SCIENTIFIC_CAL {
    static void add() {
        System.out.println("ADDITION OPERATION\n");

        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        b = sc.nextDouble();
        System.out.println("Addition :" + (a + b));
    }

    static void subtract() {
        System.out.println("SUBTRACTION OPERATION\n");

        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        b = sc.nextDouble();
        System.out.println("Subtraction :" + (a - b));

    }

    static void multiply() {
        System.out.println("MULTIPLICATION OPERATION\n");

        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        b = sc.nextDouble();
        System.out.println("Multiplication :" + (a * b));

    }

    static void divide() {
        System.out.println("DIVISION OPERATION \n");
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        b = sc.nextDouble();
        System.out.println("Division :" + (a / b));
    }

    static void power() {
        System.out.println("POWER OPERATION \n");
        double base;
        double exp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        base = sc.nextDouble();
        System.out.println("Enter the Second number:");
        exp = sc.nextDouble();
        System.out.println("Power :" + Math.pow(base, exp));

    }

    static void remainder() {
        System.out.println("REMAINDER OPERATION\n");
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        b = sc.nextDouble();
        System.out.println("Remainder :" + (a % b));

    }

    static void sin() {
        System.out.println("SIN OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double degree = sc.nextDouble();
        double radians = Math.toRadians(degree);
        double sin = Math.sin(radians);
        System.out.println("sin(" + degree + ") = " + sin);
    }

    static void cos() {
        System.out.println("COS OPERATION\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double degree = sc.nextDouble();
        double radians = Math.toRadians(degree);
        double cos = Math.cos(radians);
        System.out.println("cos(" + degree + ") = " + cos);
    }

    static void tan() {
        System.out.println("TAN OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double degree = sc.nextDouble();
        double radians = Math.toRadians(degree);
        double tan = Math.tan(radians);
        System.out.println("tan(" + degree + ") = " + tan);
    }

    static void asin() {
        System.out.println("ASIN OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double degree = sc.nextDouble();
        double radians = Math.toRadians(degree);
        double asin = Math.asin(radians);
        System.out.println("asin(" + degree + ") = " + asin);

    }

    static void acos() {
        System.out.println("ACOS OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double degree = sc.nextDouble();
        double radians = Math.toRadians(degree);
        double acos = Math.acos(radians);
        System.out.println("acos(" + degree + ") = " + acos);

    }

    static void atan() {
        System.out.println("ATAN OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree:");
        double abc = sc.nextDouble();
        double radians = Math.toRadians(abc);
        double atan = Math.atan(abc);
        System.out.println("atan(" + abc + ") = " + atan);

    }

    static void log() {
        System.out.println("NATURAL_LOG OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the log of :");
        double num = sc.nextDouble();
        double natural_log = Math.log10(num);
        System.out.println("Log(" + num + ')' + "= " + natural_log);

    }

    static void exponential_logarithm() {
        System.out.println("EXPONENTIAL_LOG OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the log of :");
        double num = sc.nextDouble();
        double ln = Math.log(num);
        System.out.println("Log(" + num + ')' + "= " + ln);

    }

    static void factorial() {
        System.out.println("FACTORIAL OPERATION\n");
        int i, fact = 1;
        System.out.println("Enter the number (for factroial):");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println(num + "! =" + fact);

    }

    static void square() {
        System.out.println("SQUARE_OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        double res = num * num;
        System.out.println("square " + "= " + res);
    }

    static void squareroot() {
        System.out.println("SQUAREROOT OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        double res = Math.sqrt(num);
        System.out.println("Square_root " + "= " + res);
    }

    static void absolute() {
        System.out.println("ABSOLUTE OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        double res = Math.abs(num);
        System.out.println("Absolute" + "=" + res);
    }

    static void cuberoot() {
        System.out.println("CUBE_ROOT OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        double res = Math.cbrt(num);
        System.out.println("Cube_root" + "=" + res);

    }

    static void exponent() {
        System.out.println("EXPONENT OPERATION\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num = sc.nextDouble();
        double res = Math.exp(num);
        System.out.println("Exponent" + "=" + res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Enter the operation : (\r\n--->(1).< + > , (2).< - > , (3).< X >, (4).< / > ,(5).< % > ,\r\n---> ,(6).< X^Y(POWER TO POWER) >, (7).< square >, (8).< square_root >,  (9).< cube_root >, (10).< absolute > ,\r\r\n--->(11).< sin >,  (12).< cos >,   (13)< tan > , (14).< asin >,  (15).< acos > , (16).< atan >  , \r\n--->(17).< Exponent> , (18).< NATURAL_log() > , (19).< exponential_log() > , (20).< factorial >:");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                remainder();
                break;
            case 6:
                power();
                break;
            case 7:
                square();
                break;
            case 8:
                squareroot();
                break;
            case 9:
                cuberoot();
                break;
            case 10:
                absolute();
                break;
            case 11:
                sin();
                break;
            case 12:
                cos();
                break;
            case 13:
                tan();
                break;
            case 14:
                asin();
                break;
            case 15:
                acos();
                break;
            case 16:
                atan();
                break;
            case 17:
                exponent();
                break;
            case 18:
                log();
                break;
            case 19:
                exponential_logarithm();
                break;
            case 20:
                factorial();
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }

}