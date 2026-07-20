import java.io.FileReader;
   public class FileInputOutput{
   public static void main(String[] file0) {
      try {
         FileReader file = new FileReader("Hello.txt");
         file.read();
         System.out.println("File edited successfully");
         file.close();
      } 
      catch (Exception file1) {
         System.out.println("An error Occured");
         file1.printStackTrace();
      }
   }
   }
