package Programs;
public class Poly {
    public static void main(String[] args) {
        
        Poly pl = new Poly();
        pl.login(22, "name");
        pl.login(77, "hell", "34login");

    }
    public void login(String s , String p) {
        System.out.println("login using name and password");
    }
    public void login (int i , String p) {
        System.out.println("login using number and password");
    }
    public void login (int i , String s , String p) {
        System.out.println("login using 3 components");
    }
}
