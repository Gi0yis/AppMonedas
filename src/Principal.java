import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConfigApi configApi = new ConfigApi();
        Scanner datos = new Scanner(System.in);
        Menu miMenu = new Menu();
        DecimalFormat decimalesMoneda = new DecimalFormat("#.##");

        boolean continuar = true;

        while (continuar) {

            try {
                miMenu.mostarMenu();
                int opcion = datos.nextInt();
                boolean conversionValida = true;
                String letraMoneda = "";

                switch (opcion) {
                    case 1:
                        configApi.setPrimerMoneda("GTQ");
                        configApi.setSegundaMoneda("USD");
                        configApi.configDeApi();
                        letraMoneda = "$";
                        break;
                    case 2:
                        configApi.setPrimerMoneda("USD");
                        configApi.setSegundaMoneda("GTQ");
                        configApi.configDeApi();
                        letraMoneda = "Q";
                        break;
                    case 3:
                        configApi.setPrimerMoneda("GTQ");
                        configApi.setSegundaMoneda("MXN");
                        configApi.configDeApi();
                        letraMoneda = "$";
                        break;
                    case 4:
                        configApi.setPrimerMoneda("MXN");
                        configApi.setSegundaMoneda("GTQ");
                        configApi.configDeApi();
                        letraMoneda = "Q";
                        break;
                    case 5:
                        configApi.setPrimerMoneda("GTQ");
                        configApi.setSegundaMoneda("EUR");
                        configApi.configDeApi();
                        letraMoneda = "€";
                        break;
                    case 6:
                        configApi.setPrimerMoneda("EUR");
                        configApi.setSegundaMoneda("GTQ");
                        configApi.configDeApi();
                        letraMoneda = "Q";
                        break;
                    case 7:
                        configApi.setPrimerMoneda("GTQ");
                        configApi.setSegundaMoneda("PEN");
                        configApi.configDeApi();
                        letraMoneda = "S/";
                        break;
                    case 8:
                        configApi.setPrimerMoneda("PEN");
                        configApi.setSegundaMoneda("GTQ");
                        configApi.configDeApi();
                        letraMoneda = "Q";
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        conversionValida = false;
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción entre 0 y 8.");
                        conversionValida = false;
                        continuar = false;

                        break;
                }

                if (conversionValida) {
                    Moneda miMoneda = new Moneda(configApi.getMiMonedaApi());
                    ConvertirMoneda convertirMoneda = new ConvertirMoneda(miMoneda);
                    convertirMoneda.operarMultiplicar();
                    System.out.println("Valor convertido: " + letraMoneda + decimalesMoneda.format(convertirMoneda.getMonedaConvertida()));
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        }
    }
}
