public class Bulb {
    public static void bulb(int[] arr){
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                int j =i; int k = arr.length-1;
                while (j<=k){
                    if (j==k){
                        if (arr[j] == 0){
                            arr[j]=1;
                        }else {
                            arr[j] = 0;
                        }
                    }else {
                            if (arr[j] == 0){
                                arr[j]=1;
                            }else {
                                arr[j]=0;
                            }
                            if (arr[k]==0){
                                arr[k]=1;
                            }else{
                                arr[k] = 0;
                            }
                        }

                    j++;
                    k--;
                }
               counter++;

            }

        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
int [] arr = {1,0,1,0,1,0,0, 0,1,0,1,0};
bulb(arr);
    }
}
