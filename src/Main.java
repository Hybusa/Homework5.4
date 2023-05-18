
public class Main {
    public static void main(String[] args) {
        try{
            myMethod();
        }catch (MyException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}