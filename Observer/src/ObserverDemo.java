public class ObserverDemo {
    public static void main(String[] args) {
      Subject subject = new Subject();

      new DisplayBinaryObserver(subject);
      new DisplayHexaObserver(subject);
      new DisplayOctalObserver(subject);
    //  subject.attach(new DisplayOctalObserver(subject));          NOT CORRECT
      

      System.out.println("\nFirst state change: 11");	
      subject.setState(11);
      System.out.println("\nSecond state change: 7");	
      subject.setState(7);
   }
    
}
