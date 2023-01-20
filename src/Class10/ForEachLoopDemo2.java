package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};

        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                System.out.println(arr[i]);

                if (arr[i]%2!=0){
                    System.out.println(arr[i]);
                }

            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%2!=0){
                    arr[j]=0;
                }
                System.out.println("after replacing all odd numbers with zeros");
                for (int k = 0; k <arr.length ; k++) {
                    System.out.println(arr[k]);

                }





        }}
    }
}
