package abstraction.abstractclass.example;

public class Kristo {
//    public void showLoveToGirlFriend(Girlfriend gf) {
//        gf.loveMe();
//    }

//    public void showLoveToDog(Dog dog) {
//        dog.loveWoofWoof();
//    }


    // Here we can use POLYMORPHISM.
    public void showLove(AbstractLovable obj) {
        obj.love();
    }
}
