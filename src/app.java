public class app {

    public static void main(String[] arg){

        /*Escribe un programa en Java (Circulo) que tome como dato un número
        que corresponde a la longitud de un radio y nos escribe la longitud de la
        circunferencia, el área del círculo y el volumen de la esfera que
        corresponden con dicho radio (usar la clase Math).*/

        // Declaración de variables
        double radio = 5;

        // Operaciones
        // Formulas: https://www.youtube.com/shorts/yE9mKPjC79Q
        double circunferencia = (double) 2 * Math.PI * radio;
        double areaCirculo = Math.PI * Math.pow(radio,2);
        double volumen = (double) 4/3 * Math.PI * Math.pow(radio,3);

        // Output
        System.out.printf("La circunferencia del círculo es: %.2f \n", circunferencia);
        System.out.printf("El área del círculo es: %.2f \n", areaCirculo);
        System.out.printf("El volumen de la esfera es: %.2f \n", volumen);

    } // public static void main(String[] arg)

} // public class app
