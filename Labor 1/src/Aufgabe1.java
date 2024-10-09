import java.util.ArrayList;

public class Aufgabe1 {
    public ArrayList<Integer> insufficient(int[] vector){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < vector.length; i++){
            if (vector[i] <= 38){
                arr.add(vector[i]);
            }
        }
        return arr;
    }
    public float arithmeticMean(int[] vector){
        float sum = 0;
        for (int i = 0; i < vector.length; i++){
            sum += vector[i];
        }
        return sum / vector.length;
    }
    public ArrayList<Integer> rounded_grades(int[] vector) {
        ArrayList<Integer> roundedGrades = new ArrayList<>();

        for (int grade : vector) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    roundedGrades.add(nextMultipleOfFive);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }
        return roundedGrades;
    }
    public int highest_rounded_grade(int[] vector) {
        ArrayList<Integer> arr = rounded_grades(vector);
        int highest = -1;
        for (int i = 0; i < arr.size() -1 ; i++) {
            if (arr.get(i) > highest) {
                highest = arr.get(i);
            }
        }
        return highest;
    }
}
