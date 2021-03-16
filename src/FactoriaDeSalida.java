public class FactoriaDeSalida {
    public static DatosDeSalida getproductosalida(int opcion){

        switch (opcion){
            case 1:
                return new Consola();
            case 2:
                return new Ventana();

            default:
                return null;




        }

    }
}
