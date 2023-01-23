package Class12;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north and south america countries, europium countries,
        african countries, asia countries.
        Then print all values from that array using 2 different loops and calculate how many
        countries been stored.
         */
        String[][] countries={{"USA", "Canada", "Mexico"},
                {"Brazil","Argentina", "Peru", "Colombia","Chile"},
                {"Germany", "Italy","France", "Spain", "England"},
                {"China","India","Japan","Russia"},
                {"Egypt", "Nigeria","South Africa","Ethiopia"}
        };
        System.out.println(countries[3].length);

        int counter=0;
        //using normal for loop
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        //using enhanced for loop
        for (String[]country:countries){
            for (String s:country){
                System.out.print(s+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println(("Total countries "+counter));
    }
}
