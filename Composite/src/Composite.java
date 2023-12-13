import java.util.ArrayList;

public class Composite implements isComposite {

    private ArrayList<isComposite> CompList;

    public Composite(){CompList = new ArrayList<>();}

    public void addComposite(isComposite comp) {
        CompList.add(comp);
        System.out.println("New Composite added to " + this.getClass().getName());
    }

    public void removeComposite(isComposite comp) {
        boolean isPresent = false;
        for(isComposite c : CompList){
            if(c == comp){
                isPresent = true;
                CompList.remove(c);
            }
        }
        if(isPresent == false){
            System.out.println("Composite not found");
        }
    }

    @Override
    public void display() {

        for(isComposite c : CompList){
            c.display();
        }
    }
    
}
