public class MyPattern {
    static void Pattern(int size){
        for(int k = 1; k <=size; k++) {
            for (int l = size; l >= 1; l--) {
                if (k >= l) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(4);

    }
}