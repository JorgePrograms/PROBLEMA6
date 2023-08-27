package ejercicio6;


import java.util.Scanner;



public class Ejercicio6 {    

public static void main(String[] args){       
Scanner entrada =new Scanner(System.in);
int n;
    System.out.print("Digite un numero: ");
n=entrada.nextInt();


for(int i=1;i<=n;i++){
    for (int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println("");
}

}    

}
