public class ChannelRepository implements Container {
   String Channelnames[] = { "Sony Pal", "SAB TV", "History TV", "Discovery TV" };

   @Override
   public Iterator getIterator() {
      return new ChannelIterator();
   }

   private class ChannelIterator implements Iterator {
      int index;

      @Override
      public boolean hasNext() {
         if (index < Channelnames.length)
            return true;
         return false;
      }

      @Override
      public Object next() {
         if (this.hasNext())
            return Channelnames[index++];
         return null;
      }
   }
}