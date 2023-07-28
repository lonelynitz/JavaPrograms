public class leapyear {
    public static String leapyearfound(int year){

        if((year%4==0) && (year % 100 != 0) && (year%400 != 0)){
            return "It is leap year";
        }
        return "It is not leap year";
    }

    public static void main(String[] args) {
        
        System.out.println(leapyearfound(2012));
    }
}
