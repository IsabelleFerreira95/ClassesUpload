package Class23;

public class Task1 {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
    public static void main(String[] args) {
        int a=(int)12.5;
        Computer[] computers={new Apple(), new HP()};
        for (Computer c:computers){
            c.playVideo();
            c.browserInternet();
            if (c instanceof Apple){//we are checking if the variable c contains the object of an Apple class
                Apple apple=(Apple)c;//converting the variable c back to an apple object
                apple.installApp();
                apple.playVideo();
            }

        }
    }

}
class Computer{
    int RAM;
    int store;
    String OS;

    void playVideo(){
        System.out.println("Video is playing");
    }
    void browserInternet(){
        System.out.println("Browser internet");
    }
}
class Apple extends Computer{
    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Editing on iMovies");
    }
    void installApp(){
        System.out.println("installing the apps from Apple Store");
    }
}
class HP extends Computer{
    @Override
    void browserInternet() {
        System.out.println("Browser using chrome");
    }

    @Override
    void playVideo() {
        System.out.println("Playing the video using VLC player");
    }
    void installApp(){
        System.out.println("Installing apps");
    }
}