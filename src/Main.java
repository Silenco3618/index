public class Main {
    public static void main(String[] args) {
        indexBody service = new indexBody();
        double x = 50;
        double y = 1.65;
        double myIndex = service.index1(x, y);
        System.out.println(myIndex);
    }
}