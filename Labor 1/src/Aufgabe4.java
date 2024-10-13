public class Aufgabe4 {
    public int cheapest(int[] vector){
        int min = vector[0];
        for(int i = 1; i < vector.length; i++){
            if(vector[i] < min){
                min = vector[i];
            }
        }
        return min;
    }

    public int most_expensive(int[] vector1, int[] vector2){
        int max = vector1[0];
        for(int i = 1; i < vector1.length; i++){
            if(vector1[i] > max){
                max = vector1[i];
            }
        }
        for(int j = 1; j < vector2.length; j++){
            if(vector2[j] > max){
                max = vector2[j];
            }
        }
        return max;
    }

    public int most_expensive_in_budget(int[] vector, int budget){
        int min = vector[0];
        for(int i = 1; i < vector.length; i++){
            if(vector[i] < min){
                min = vector[i];
            }
        }
        if(budget < min){
            return -1; //if he can't afford any USB s
        }

        int max = vector[0];
        for(int i = 1; i < vector.length; i++){
            if(vector[i] > max && budget >= vector[i]){
                max = vector[i];
            }
        }
        return max;
    }

    public int max_sum_budget(int budget,int[] keyboards, int[] usbs){
        int max=-1;
        for(int keyboard:keyboards){
            for(int usb:usbs){
                int total=keyboard+usb;
                if(total<=budget && total>max){
                    max=total;
                }
            }
        }
        if(max==-1){
            return -1;
        }
        else{
            return max;
        }
    }

}
