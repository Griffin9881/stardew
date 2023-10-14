public class App {
    
    public static void main(String[] args) {
        int loopCount = 0;
        Clothes myClothes = new Clothes("tee-shirt", "those pants with all the pockets", "sun hat", "ring of growth", "ring of watering", "converse");
        Character me = new Character("white", "Griffin", "Brown", "Brown", "Medium", myClothes);
        do {
            me.move(me.getName());
            if(loopCount > 100) {
                break;
            }
            loopCount++;
        } while (true);
    }
}
