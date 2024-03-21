import javax.swing.JOptionPane;
public class Operaciones {
//Método de suma
    public int  sumar(int numero1,int numero2){
        int sumar=numero1+numero2;
        return sumar;
    }
//Método de resta
public int  restar(int numero1,int numero2){
    int restar=numero1-numero2;
    return restar;
    }
//Método de multiplicación
public int  multiplicar(int numero1,int numero2){
    int multiplicar=numero1*numero2;
    return multiplicar;
    }
//Método de division
public int  dividir(int numero1,int numero2){
    int dividir=numero1/numero2;
    return dividir;
    }
//Método de módulo
public int  modular(int numero1,int numero2){
    int modular=numero1%numero2;
    return modular;
    }    
//Método de visualizar el resultado
public void MostrarResultado(int suma, int resta, int multiplicacion, int division, int modulo) {
    System.out.println("El resultado de la suma es: "+ suma);
    System.out.println("El resultado de la resta es: "+ resta);
    System.out.println("El resultado de la multiplicación es: "+ multiplicacion);
    System.out.println("El resultado de la división es: "+ division);
    System.out.println("El resultado del módulo es: "+ modulo);
}
}    