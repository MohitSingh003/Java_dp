public class IteratorMain {
  public static void main(String[] args) {
    ChannelRepository channelRepository = new ChannelRepository();

    Iterator i = channelRepository.getIterator();
    // ChannelIterator x =new ChannelIterator();
    while (i.hasNext()) {
      String channelname = (String) i.next();
      System.out.println("Name : " + channelname);
    }

  }
}
// First slot
//
// A- 55,61 1 3 36 6 11 18 72 5 58 27 28 20 19 17 22 12 71 15 60
//
// B-14 70 28 4 9 15 62 45 39 12 13 32 33 43 1 16 17 27 31 60 8 23 26 63 51 58
// 72 61 66 40
//
// Second slot
// A- 55,61, 1, 3, 36, 6, 11, 18 ,72, 5, 58, 27, 28, 20, 19, 17 ,22, 12, 71, 15,
// 60,
