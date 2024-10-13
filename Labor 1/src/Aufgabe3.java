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
        return result;
    }

    public int[] difference(int n1[], int[] n2){
        int[] result=new int[n1.length+1];
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
        return result;
    }

    public int[] mul(int[] number,int cf){
        int carry=0;
        int[] result=new int[number.length];

        for(int i=number.length-1;i>=0;i--){
            int produs=number[i]*cf+carry;

            result[i]=produs%10;
            carry=produs/10;

        }
        if(carry>0){
            int[] extensie_result=new int[number.length+1];
            extensie_result[0]=carry;
            for(int i=0;i<=number.length;i++){ //copiem cifrele in noul array
                extensie_result[i]=result[i];
            }
            return extensie_result;
        }
        return result;
    }

    public int[] div(int[] number,int cf){
        int remainder=0;
        int[] result=new int[number.length];

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
        return final_result;

    }

}
