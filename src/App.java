public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número y le mostrare su tabla de multiplicar: ");
        int numero = Integer.parseInt(System.console().readLine());

        int i = 1;
        while (i <= 10){
            try{
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
            }catch(NumberFormatException e){
                System.out.println("Numero entero introducido.");
            }
        }
    }
}
