
public abstract class Animal {

    //instance variable
    String food;
    int hunger;
    String boundaries;
    String lacation;

    //method
    public void makeNoise() {
        System.out.println("!!!");
    }

    public void roam() {
        System.out.println("grrr");
    }
    
    public void eat() {
    	System.out.println("yum yum");
    }

    public void sleep() {
        System.out.println("zzz");
    }

}