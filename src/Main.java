public class Main {
    public static void main(String[] args) {
        System.out.println("Камила: " + Vesy(60,156));
        System.out.println("Нурай: " + Vesy(44,156));
        System.out.println("Саил: " + Vesy(50, 186));

    }
    public static String Vesy(double kg, double high){
        String kgAndHigh;
        if (kg >= 45 && kg <= 50 && high >= 180){
            kgAndHigh = "Вам нужно набрать вес";
        } else if (kg >= 51 && kg <= 85 && high <= 180) {
            kgAndHigh = "Вам нужно похудеть";
        } else if (kg >= 86 && high <= 187) {
            kgAndHigh = "Не жри вообще";
        } else{
            kgAndHigh = "Красава";
        }
        return kgAndHigh;
    }
}