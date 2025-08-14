package programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author florg
 */
public class ProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Operadores relacionales
        // <, <=, >, >=, ==, !=
        
        //Operadores logicos
        /*
        AND -> &&
        OR -> ||
        NOT -> !
        */
        
        //if- else if- else
        int numero = -3;
        
        if(numero>0){
            System.out.println("Numero positivo");
        }else if (numero<0) {
            System.out.println("Numero negativo");
        }else{
            System.out.println("Cero");
        }

        //switch-case
        int dia = 5;
        
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            default -> System.out.println("Dia no valido");
        }

        //Array
        int[] arreglo1 = {1,2,3,4};
       
        int[] arreglo2 = new int[3]; //[0,0,9]
        
        arreglo2[2] = 9;
        //for
        for (int i = 0; i<arreglo2.length; i++) {
            arreglo2[i] = i;
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println(); //[0,1,2]
        
        //for-each
        for(int elemento : arreglo2){
            System.out.print(elemento + " ");
        }
        System.out.println();
        
        //while
//        while (true) {            
//        }

        //do-while
        
        String passwordIngresada, passwordCorrecta = "123Java";
        
        do{
            System.out.println("Ingrese la password");
            passwordIngresada = sc.nextLine();
            
            if(!passwordIngresada.equalsIgnoreCase(passwordCorrecta)){
                System.out.println("Password incorrecta, intente de nuevo");
            }
            
        }while(!passwordIngresada.equals(passwordCorrecta));
        
        System.out.println("Bienvenido");
        
        //Llamada a metodos
        muestroSuma(5, 7);
        int resultado = sumar(5, 7);
        System.out.println(resultado);
    }
    
    //void
    public static void muestroSuma(int a, int b){
        System.out.println(a+b);
    }
    
    //metodo con return
    public static int sumar(int a, int b){
        return a+b;
    }
 
    /*
    =============================
    EJERCICIO PROPUESTO
    =============================
    Enunciado:
    1. Pedir al usuario la cantidad de frutas que quiere ingresar.
       - Si ingresa un número negativo o cero, volver a pedir hasta que sea válido.
    2. Guardar las frutas en un Array.
    3. Mostrar todas las frutas usando un for-each.
    4. Si alguna fruta es "Banana" (ignorando mayúsculas/minúsculas), mostrar:
       ¡Me encantan las bananas!
    5. Extra (opcional): Modularizar el programa usando funciones.
    */
}
