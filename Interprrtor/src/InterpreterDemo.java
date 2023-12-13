public class InterpreterDemo {

   public static void main(String[] args) {
//      
      Expression isMale = getORExpression();
      Expression isWoman = getANDExpression();

      System.out.println("Robbert is male? " + isMale.interpret("Robert ibjbjbjbj male"));
      System.out.println("Julie is a Woman? " + isWoman.interpret(" Julie john"));
   }
   //Rule: Robert and John are male
   public static Expression getORExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a  women
   public static Expression getANDExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Woman");
      return new AndExpression(julie, married);		
   } 
}
    
    

