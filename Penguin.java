public class Penguin{
    private String title;

    public Penguin(String title){
        this.title = title;
    }

    public String toString(){
        return title + " is a penguin";
    }

    public static void main(String[] args) {
        Penguin pete = new Penguin("Pete");
        pete.toString();
    }
}