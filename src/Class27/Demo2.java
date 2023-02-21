package Class27;

public class Demo2 {
    public static void main(String[] args) {
        String name="George";
        String[] names={"Isabelle","Jorge","Debbie","Rocsana"};
        //Create a method which can search a name from this array return true if present in the array
        System.out.println(contains(name,names));
        String[] arr=new String[2];

        names[4]="Sarah";
    }
    public static boolean contains(String nameToBeSearch, String[] names){
      for (String name:names){

          if (nameToBeSearch.equals(name)){
              return true;
          }
      }
      return false;
    }

}
