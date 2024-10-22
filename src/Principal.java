import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);


            var consulta = new ConsultaPelicula();
            System.out.println("QUE PELICULA QUIERES CONSULTAR");
            try {
                var numeroDePelicula = Integer.valueOf(lectura.nextLine());
                Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
                System.out.println(pelicula);
                GeneradorDeArchivo generador = new GeneradorDeArchivo();
                generador.guardarJson(pelicula);
            }catch (NumberFormatException | IOException e){
                System.out.println("Numero no encontrado"+e.getMessage());
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizo el programa");
            }

    }
}
