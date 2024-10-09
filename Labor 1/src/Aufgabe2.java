public class Aufgabe2 {
    public int minim(int [] vector){
        int min = vector[0];
        for(int i = 1; i < vector.length; i++){
            if (vector[i] < min){
                min = vector[i];
            }
        }
        return min;
    }
    public int maxim(int [] vector){
        int max = vector[0];
        for(int i = 1; i < vector.length; i++){
            if (vector[i] > max){
                max = vector[i];
            }
        }
        return max;
    }
    public int max_sum(int [] vector){
        int minn = minim(vector);
        int sum = 0;
        for(int i = 0; i < vector.length ; i++){
            sum += vector[i];
        }
        sum = sum - minn;
        return sum;
    }

    public int min_sum(int [] vector){
        int maxx = maxim(vector);
        int sum = 0;
        for(int i = 0; i < vector.length ; i++){
            sum += vector[i];
        }
        sum = sum - maxx;
        return sum;
    }
}
