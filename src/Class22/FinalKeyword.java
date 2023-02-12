package Class22;

public class FinalKeyword {
    //final means that you can change the values of the variables
    final double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;

    final void tryChangingGravity(){
        //gravity=1.6; we will get an error bc this variable is marked final.
    }
}
class Child extends FinalKeyword{
    //void  tryChangingGravity(){

}