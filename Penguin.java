/**
 * This class talks about Penguins
 * @author: All of us
 */
public class Penguin{
    private String title;

    public Penguin(String title){
        this.title = title;
    }

    public void speak(){
        System.out.println("Cheap");
    }

    public String toString(){
        return title + " is a penguin";
        System.out.println("Hello cat");
        System.out.println("How was ur day cat");
        System.out.println("What are you doing now!");
    }

    public static void main(String[] args) {
        Penguin pete = new Penguin("Pete");
        pete.toString();
    }
}