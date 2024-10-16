public class Aufgabe3 {
    public int[] sum(int[] n1,int[] n2){
        int[] result= new int[n1.length+1];
        int carry=0;
        for(int i=n1.length-1;i>=0;i--){
            int sum=n1[i]+n2[i]+carry;
            result[i+1]=sum%10;
            carry=sum/10;
        }
        result[0]=carry;
        if (result[0] == 0) {
            int[] short_array = new int[n1.length];
            for (int i = 0; i < n1.length; i++) {
                short_array[i] = result[i + 1];
            }
            return short_array;
        }
        return result;
    }

    public int[] difference(int n1[], int[] n2){
        int[] result=new int[n1.length];
        int borrow=0;
        for(int i=n1.length-1;i>=0;i--){
            int diff=n1[i]-n2[i]-borrow;
            if(diff<0){
                diff+=10;
                borrow=1;
            }else{
                borrow=0;
            }
            result[i]=diff;
        }

        int leadingZero = 0; //finding the place of the first non zero value
        while (leadingZero < result.length && result[leadingZero] == 0) {
            leadingZero++;
        }

        // if the entire result is zero, return a single zero element
        if (leadingZero == result.length) {
            return new int[]{0};
        }

        int[] short_result = new int[result.length - leadingZero];
        for (int i = 0; i < short_result.length; i++) {
            short_result[i] = result[leadingZero + i];
        }

        return short_result;
    }

    public int[] mul(int[] number,int cf){
        int carry=0;
        int[] result=new int[number.length];

        boolean is_negative=(cf<0);
        cf = Math.abs(cf);

        for(int i=number.length-1;i>=0;i--){
            int product=number[i]*cf+carry;
            result[i]=product%10;
            carry=product/10;

        }
        if(carry>0){
            int[] extensie_result=new int[number.length+1];

            if(is_negative) {
                extensie_result[0] = -carry;
            }
            else extensie_result[0]=carry;
            for(int i=0;i<=number.length-1;i++){
                extensie_result[i+1]=result[i];
            }
            return extensie_result;
        }
        return result;
    }

    public int[] div(int[] number,int cf){
        int remainder=0;
        int[] result=new int[number.length];

        boolean is_negativ=(cf<0);
        cf=Math.abs(cf);

        for(int i=0;i<number.length;i++){
            int current=remainder*10+number[i];
            result[i]=current/cf;
            remainder=current%cf;
        }

        int leading_zero=0;
        while(leading_zero<result.length && result[leading_zero]==0){
            leading_zero++;
        }

        int[] final_result=new int[result.length-leading_zero];
        for(int i=0;i<final_result.length;i++){
            final_result[i]=result[leading_zero+i];
        }

        if(is_negativ&&final_result.length>0){
            final_result[0]=-final_result[0];
        }
        return final_result;

    }

}
