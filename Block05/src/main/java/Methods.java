public class Methods {
    public static void main(String[] args) {
        max(-8, -8);
    }
    static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        if(a == b){
            return a + b;
        }

        return a;
    }
}
