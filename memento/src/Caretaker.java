import java.util.ArrayList;
class Caretaker {
    private ArrayList<Memento> mementos;
    public Caretaker() {
    mementos = new ArrayList<>();
    }
    
    public void addMemento(Memento m) {
        mementos.add(m);
        System.out.println(mementos);
    }

    public Memento getMemento() {
        Memento m=mementos.get(mementos.size()-1);
        mementos.remove(mementos.size()-1);
        return m;
    }
}
