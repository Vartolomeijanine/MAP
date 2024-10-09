import java.util.ArrayList;
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


            } else if (op == 3) {

            } else if (op == 4) {

            } else if (op == 0) {
                t = false;
                scanner.close();
            }
        }


    }

}