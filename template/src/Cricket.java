public class Cricket extends Game {
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      super.initialize();
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}
// A- 3, 55 36 , 11, 6 , 5 , 4 , 67 68 22 70 71 14 61 20 1 13 28 19 15 12
// B - 1 12 4 9 37 34 70 28 32 2 62 3 15 16 17 45 22 39 42 27 33 31 43 55 48 8
// 23 61 63 13 56 21 66 72 58 50 51 25