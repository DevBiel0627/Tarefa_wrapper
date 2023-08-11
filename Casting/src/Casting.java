public class Casting {
    public static void main(String[] args) {
        
        double piDouble = 3.14159;
        Long valorDePiEmLong = Long.valueOf((long) piDouble);

        System.out.println("Valor de pi em decimal: " + piDouble);
        System.out.println("Valor de pi em inteiro: " + valorDePiEmLong);
        
    }
}
