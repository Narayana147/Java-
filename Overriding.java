package Programs;

public class Overriding {
     public static void main(String[] args) {
     Riding r = new Riding();

     r.so();
      

     }
     public class Over{
     public void so() {
         System.out.println("this is first");
     }
    }
    public class Riding extends Over{
     public void so() {
         System.out.println("this is second");
     }
}

}