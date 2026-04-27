import java.util.Scanner;


    static class InvalidInputException extends Exception {
        public String toString() {
            return "Cannot add 8 and 9";
        }
    }

    static class CannotdividebyZeroException extends Exception {
        public String toString() {
            return "Cannot divide by Zero";
        }
    }

    static class MaxInputException extends Exception {
        public String toString() {
            return "Input cannot be greater than 10000";
        }
    }

    static class MaxmultiInputException extends Exception {
        public String toString() {
            return "Input cannot be greater than 7000 while multiplying";
        }
    }

// Class to store user input using Getters & Setter

    public static class custom_calculator {
        private double a;
        private double b;

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        protected double add(double a, double b) throws InvalidInputException, MaxInputException {
            if (a > 10000 || b > 10000)
                throw new MaxInputException();

            if (a == 8 || b == 9)
                throw new InvalidInputException();

            return a + b;
        }

        protected double sub(double a, double b) throws MaxInputException {
            if (a > 10000 || b > 10000)
                throw new MaxInputException();
            return a - b;
        }

        protected double multiply(double a, double b) throws MaxInputException, MaxmultiInputException {
            if (a > 10000 || b > 10000)
                throw new MaxInputException();

            if (a > 7000 || b > 7000)
                throw new MaxmultiInputException();

            return a * b;
        }

        protected double divide(double a, double b) throws CannotdividebyZeroException, MaxInputException {
            if (a > 10000 || b > 10000)
                throw new MaxInputException();

            if (b == 0)
                throw new CannotdividebyZeroException();

            return a / b;
        }

    }

    public static void main(String[] args) throws InvalidInputException, CannotdividebyZeroException, MaxInputException, MaxmultiInputException {
        Scanner sc = new Scanner(System.in);
        custom_calculator calc = new custom_calculator();

        try {
            // User Input
            System.out.print("Enter first number: ");
            calc.setA(sc.nextDouble());

            System.out.print("Enter second number: ");
            calc.setB(sc.nextDouble());

            double a = calc.getA();
            double b = calc.getB();

            // Menu
            System.out.println("Choose Operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            int choice = sc.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    result = calc.add(a, b);
                    break;

                case 2:
                    result = calc.sub(a, b);
                    break;

                case 3:
                    result = calc.multiply(a, b);
                    break;

                case 4:
                    result = calc.divide(a, b);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            System.out.println("Result = " + result);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        sc.close();
    }
