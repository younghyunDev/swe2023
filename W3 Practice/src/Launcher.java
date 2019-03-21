
public class Launcher{

	public static void main (String[] args){

        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Hippo();
        animals[3] = new Crocodile();

//      animals[2] = new Wolf();
//		animals[3] = new Lion();

        Vet vetJisu = new Vet();

        for (int i=0; i<animals.length; i++) {
            animals[i].makeNoise();
            animals[i].eat();
            animals[i].roam();
            animals[i].sleep();
            System.out.println();

            vetJisu.giveShot(animals[i]);
            System.out.println();

        }
    }
    
}