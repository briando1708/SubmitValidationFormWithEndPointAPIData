package untils;


public class UniqueData {
    public static String createString(String text, int numberLength){
        return (text + System.currentTimeMillis()).substring(0, numberLength);
    }
    public static String createNo(String No, int numberLength){
        return (No + System.currentTimeMillis()).substring(0, numberLength);
    }
}
