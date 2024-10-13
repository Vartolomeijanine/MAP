import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static int[] read_vector() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Enter the elements of the vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    private static int read_int() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.printf("Enter the number of the exercise: ");
            int op = scanner.nextInt();

            if (op == 1) {
                int[] v = read_vector();
                Aufgabe1 obj1 = new Aufgabe1();
                System.out.printf("Insufficient grades: [");
                ArrayList<Integer> a = obj1.insufficient(v);
                for (int i = 0; i < a.size(); i++) {
                    if (i == a.size() - 1) {
                        System.out.print(a.get(i));
                    } else System.out.print(a.get(i) + ", ");
                }
                System.out.println("]");

                float a2 = obj1.arithmeticMean(v);
                System.out.printf("Arithmetic Mean: %.2f\n", a2);

                System.out.print("Rounded grades: [");
                ArrayList<Integer> a3 = obj1.rounded_grades(v);
                for (int i = 0; i < a3.size(); i++) {
                    if (i == a3.size() - 1) {
                        System.out.print(a3.get(i));
                    } else System.out.print(a3.get(i) + ", ");
                }
                System.out.println("]");

                int a4 = obj1.highest_rounded_grade(v);
                System.out.printf("Highest rounded grade: %d\n", a4);


            } else if (op == 2) {
                int[] v = read_vector();
                Aufgabe2 obj1 = new Aufgabe2();
                int a = obj1.minim(v);
                System.out.println("Smallest number: " + a);

                int a2 = obj1.maxim(v);
                System.out.println("Biggest number: " + a2);

                int a3 = obj1.max_sum(v);
                System.out.println("Maximum sum: " + a3);

                int a4 = obj1.min_sum(v);
                System.out.println("Minimum sum: " + a4);

            } else if (op == 3) {
                //1
                int[] n1 = read_vector();
                int[] n2 = read_vector();
                Aufgabe3 obj1 = new Aufgabe3();
                int[] a1 = obj1.sum(n1, n2);
                System.out.print("The sum is: [");
                for (int i = 0; i < a1.length; i++) {
                    System.out.print(a1[i]);
                    if (i < a1.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                //2
                int[] n3 = read_vector();
                int[] n4 = read_vector();
                int[] a2 = obj1.difference(n3, n4);
                System.out.print("The difference is: [");
                for (int i = 0; i < a2.length; i++) {
                    System.out.print(a2[i]);
                    if (i < a2.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                //3
                int[] n5 = read_vector();
                int n6 = read_int();
                int[] a3 = obj1.mul(n5, n6);
                System.out.print("The multiplication is: [");
                for (int i = 0; i < a3.length; i++) {
                    System.out.print(a3[i]);
                    if (i < a3.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                //4
                int[] n7 = read_vector();
                int n8 = read_int();
                int[] a4 = obj1.div(n7, n8);
                System.out.print("The division is: [");
                for (int i = 0; i < a4.length; i++) {
                    System.out.print(a4[i]);
                    if (i < a4.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

            } else if (op == 4) {

            } else if (op == 0) {
                t = false;
                scanner.close();
            }
        }


    }

}