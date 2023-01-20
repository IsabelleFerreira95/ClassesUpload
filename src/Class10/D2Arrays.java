package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        //a 2d array which can hold 3 rows one D arrays
        // each of size 3
        String[][] thomsonTrain=new String[3][3];

        String[] cabin0={"Adam", "Zac", "Sam"};
        String[] cabin1={"Nadia", "Pedro", "Samantha"};
        String[] cabin2={"Isac", "Amanda", "David"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        //in the first [] we specify the address of 1 D Array
        System.out.println(thomsonTrain[1][2]);



    }
}
