
public class Book extends MediaItem {

   private int numPages;
   private double fontSize;
  
   public Book(String title, String author, String genre, 
                    int numPages, double fontSize){
      super(title, author, genre);
      this.numPages = numPages;
      this.fontSize = fontSize;
   
   
   
   }
   
   public int getNumPages(){
      return numPages;
   }
   
   public double getFontSize(){
      return fontSize;
   }
   
   @Override
   public String toString(){
      return "Book: " + super.toString() + ", " + numPages + ", " + fontSize;
   }
}