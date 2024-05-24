package com.gioyis.miprograma.principal;

public class Menu {

    private String menu = """
            Seleccione la opción deseada
            
            1 - GTQ Quetzal => USD Dollar Estadunidense
            2 - USD Dollar Estadunidense => GTQ Quetzal
            3 - GTQ Quetzal => MXN Peso Mexicano
            4 - MXN Peso Mexicano => GTQ Quetzal
            5 - GTQ Quetzal => EUR Euro
            6 - EUR Euro => GTQ Quetzal
            7 - GTQ Quetzal => PEN Sol Peruano
            8 - PEN Sol Peruano => GTQ Quetzal
            0 - salir
            """;

    public void mostarMenu() {
        System.out.println("=".repeat(46) + "\n");
        System.out.println(menu);
        System.out.println("=".repeat(46));
    }
}