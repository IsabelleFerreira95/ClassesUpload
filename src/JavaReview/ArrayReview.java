package JavaReview;

public class ArrayReview {
    public static void main(String[] args) {
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        System.out.println("Size of the array="+arr.length);
        //to get all value from the array?

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        String [] colors={"black", "white", "red","purple","blue"};
        //anytime we have arrays we can use enhanced for loop
        for (String color:colors){//data type+variable+ " : " +name of your array
            System.out.print(color+", ");
        }
        System.out.println();
        System.out.println("----------");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i]+", ");
        }
        System.out.println();
        for (int num:arr){
            System.out.println(num+", ");
        }
        System.out.println("---Printing in reverse---");
        for (int i=colors.length-1; i>=0; i--){
            System.out.print(colors[i]+", ");
        }
    }
}
