public class Leaf implements isComposite {
    int id;
    String name;

    public Leaf(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("ID : " + this.id );
        System.out.println("Name : " + this.name);
    }

}
