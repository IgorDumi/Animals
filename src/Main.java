
import animal.Bird;
import animal.Eagle;
import animal.Fish;

public class Main {

    public static void main(String[] args) {

        Bird myBird = new Bird();

        myBird.info();
        myBird.move();
        myBird.eat();

        Eagle eagle = new Eagle();
        eagle.info();
        eagle.eat();
        eagle.move();

        Fish myFish = new Fish();
        myFish.info();
        myFish.move();
        myFish.eat();

        Insect fly = new Insect();

        myBird.setFavouriteInsect(fly);
        System.out.println("My bird's favourite insect has: " + myBird.getFavouriteInsert().getNumberOfLegs())
                                                              +

    }

}
