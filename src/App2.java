public class App2 {
    static void main(){
        System.out.println(dollarSign("SMILE"));
    }

    public static String dollarSign(String value){
        if(value.equals("")){
            return "";
        }
        else{
            return value.charAt(0) + "$" + dollarSign(value.substring(1));
        }
    }
}
