package Class2;

public class VariablesDemo {
    public static void main(String[] args) {
        String name = "sam";
        int age = 22;
        String city = "Houston Tx";
        int salary = 120000;
        char gender = 'M';
        String number = "+1571-584-658";
        boolean smart = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(number);
        System.out.println(smart);

    }

    public static class variables {
        public static void main(String[] args) {
            /*
            Below line is reserving a box in the computer's memory.
            We are calling it box1 if we need the information that are storing inside this box
            we can simply say to the computer give us the contents of box1.
            int=> is type of data we want to store
            box1=> is the nae of the box
            = sign will take whatever we wrote after it and will store it inside the box1
            10=> is what we are storing inside the box
             */
            int box1=10;
            // if we are printing something from a box we don't need ""
            System.out.println(box1); // bring the contents of box1 and print them on the console
            /*to store whole numbers (numbers without decimals points) we have 4 different types of box.
            For example 10, 20, 3000, 10000.
            The names for it are:
            1) byte 2)short 3)int 4)long
            Byte-the range for byte is from -128 to 127. If we need to store more, use short.
             */
            byte box2=127;
            byte box3=-128;
            // For short, the range is from -32,768 to 32,767
            short box4=32767;
            short box5=-32768;
            // the most common type of box will be int. the range is from -2,147,483,648 to 2,147,483,647
            int box6=2147483647;
            int box7=-2147483648;
            //it's necessary to put the numbers to the right type of box to don't waste memory.
            short myBox=10000;
            System.out.println(myBox);

        }
    }
}