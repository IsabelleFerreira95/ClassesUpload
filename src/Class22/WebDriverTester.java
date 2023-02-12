package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
       WebDriver webDriver=new Chrome();
       //If I change "Chrome" for any other browser, I will be able to do the same test
       webDriver.startBrowser();
       webDriver.openURL();
       webDriver.testLoginPage();
       webDriver.closeBrowser();

       /*the parent class can hold all the objects from its child
       but the child class can't hold the parent's objects/class.
       ex:Firefox firefox=new WebDriver();
        */

        //An Array of type parent class can hold the objects of all the child classes
        WebDriver[] browsers={new Chrome(),new Safari(),new Firefox()};//This is an Array

        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }




        /* Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLoginPage();
        firefox.closeBrowser();*/
    }
}
