import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Agrega el valor de numero 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Agrega el valor de numero 2: "));
        Operaciones opera1=new Operaciones ();
        int suma= opera1.sumar(n1,n2);
        int resta= opera1.restar(n1,n2);
        int multiplicacion= opera1.multiplicar(n1,n2);
        int division= opera1.dividir(n1,n2);
        int modulo= opera1.modular(n1,n2);
        opera1.MostrarResultado(suma,resta,multiplicacion,division,modulo);
        System.out.println("---------------------------------");
        opera1.MostrarResultado(opera1.sumar(n1,n2),opera1.restar(n1,n2),opera1.multiplicar(n1,n2),opera1.dividir(n1,n2),opera1.modular(n1,n2));   
    }
}