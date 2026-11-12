public class PrintTriangle {
    public static void main(String []args){
        PrintTriangle(5);
    }

    public static void PrintTriangle(int s) {
        if (s < 1){
            return;
    }
        PrintTriangle(s-1);
        for(int i = 0; i < s; i++){
            System.out.println("[]");
        }
        System.out.println();
    }
}
