package actividadobligatuni2;
import java.util.*;

public class ActividadObligatUni2 {
    public static void main(String[] args) {
        Scanner dato= new Scanner (System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=dato.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido=dato.nextLine();
        //Empieza el bucle para pedir edad que sea un
        //numero entre uno y 120 y no sean letras
        String num="";
        boolean entero= false;
        while (entero == false ){
               try{System.out.println("Ingrese su edad:");
                   num= dato.nextLine();
                   int edadNum = Integer.parseInt(num);
                   if (edadNum>0 && edadNum<120 ){
                                 entero =true;
                    }else {
                           System.out.println("Debe ingresar un valor entero y mayor a cero! y menor a 120");
                           entero = false; 
                    }
               }//fin de try
               catch(NumberFormatException e)
	            {System.out.println("Error!! SOLO INGRESE NUMEROS POSITIVOS ENTEROS MAYORES A CERO Y MENORES A 120" );
	            entero = false;
               }   
        }//fin del while  
        System.out.println(" Ingrese su hobbie:");
        String hobi=dato.nextLine();
        System.out.println("Ingrese su editor de código preferido:");
        String editor=dato.nextLine();
        System.out.println("Ingrese su sistema operativo:");
        String sistema=dato.nextLine();
        
        System.out.println("Nombre: "+ nombre );
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ num);
        System.out.println("Hobbie: "+ hobi);
        System.out.println("Editor de código preferido: "+ editor );
        System.out.println("Sistema operativo: "+ sistema);
      
    }// fin de main
}// fin de clase
