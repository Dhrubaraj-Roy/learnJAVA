public class AryObject {
    public static void main(String[] args) {
        // Food[] testyfood = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Humbarger");
        Food food3 = new Food("Hotdog");
        // testyfood[0] = food1;
        // testyfood[1] = food2;
        // testyfood[2] = food3;

        Food[] testyfood = {food1,food2,food3};
        System.out.println(testyfood[0].name);

        System.out.println(testyfood[1].name);

        System.out.println(testyfood[2].name);




    }
    
}
