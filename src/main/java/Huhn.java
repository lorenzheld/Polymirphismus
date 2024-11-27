public class Huhn extends Vogel {
    @Override
    public void fliegen() {
        System.out.println("Ein Huhn kann nur ein bisschen flattern.");
    }

    public void gackern() {
        System.out.println("Ein Huhn gackert.");
    }
}