public class Trinagle {
    static void main(){
        triangle(5);
    }



    public static int triangle(int n){
        System.out.println("Entering " + n);
        if(n==1){
            System.out.println("Returning 1");
            return 1;
        }
        else{
            int temp = n + triangle(n-1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
}
