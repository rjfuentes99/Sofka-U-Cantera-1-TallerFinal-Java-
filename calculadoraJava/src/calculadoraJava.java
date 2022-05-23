import java.util.Scanner;

public class calculadoraJava {
/*Declaro las variables para la funcionalidad del codigo*/
    public static int opcion;
    public static double numero1,numero2,resultado;/*Uso double para que me permita usar decimales*/
    public static Scanner input = new Scanner(System.in);

    /*Inicializo la calculadora llamando el numero1 y coloco un bucle para que se use el mismo numero hasta que el usuario lo requiera*/
    public static void main(String[] args) {
        numero1 = capturaNumeroUsuarios();
        do {
            opcion = capturaOpcionMenu();
            evaluarOpcionUsuario(opcion);
        }while (opcion!=6);
    }
    /*Llamo el numero1 e incializo la calculadora*/
    public static float capturaNumeroUsuarios(){
        System.out.println("Bienvenido a la super calculadora");
        System.out.println("Escriba el primer numero");
        return input.nextFloat();
    }
    /*Le pido al usuario una accion a realizar*/
    public static int capturaOpcionMenu(){

        System.out.println("1. Sumar un numero");
        System.out.println("2. Restar un numero");
        System.out.println("3. Multiplicar un numero");
        System.out.println("4. Dividir un numero");
        System.out.println("5. Sacar el modulo de un numero");
        System.out.println("6. Finalizar Calcualdora ");
        return input.nextInt();
    }
    /*Evalua la opcion del usario y funciona la calculadora*/
    public static void evaluarOpcionUsuario(int opcion){
        switch (opcion){
            case 1:
                System.out.println("Escriba el segundo numero");
                numero2 = input.nextDouble();
                resultado = numero1 + numero2;
                numero1 = resultado;
                System.out.println("El resultado es: "+resultado);
                break;
            case 2:
                System.out.println("Escriba el segundo numero");
                numero2 = input.nextInt();
                resultado = numero1 - numero2;
                numero1 = resultado;
                System.out.println("El resultado es: "+resultado);
                break;
            case 3:
                System.out.println("Escriba el segundo numero");
                numero2 = input.nextInt();
                resultado = numero1 * numero2;
                numero1 = resultado;
                System.out.println("El resultado es: "+resultado);
                break;
            case 4:
                System.out.println("Escriba el segundo numero");
                numero2 = input.nextInt();
                if (numero2 == 0){
                    System.out.println("No se puede dividir por 0");
                }else {
                    resultado = (numero1 / numero2);
                    numero1 = resultado;
                    System.out.println("El resultado es: "+resultado);
                }
                break;
            case 5:
                System.out.println("Escriba el segundo numero");
                numero2 = input.nextInt();
                resultado = numero1 % numero2;
                numero1 = resultado;
                System.out.println("El resultado es: "+resultado);
            case 6:
                System.out.println("Gracias por usar la super calculadora");
        }
    }
}
