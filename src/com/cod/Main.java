package com.cod;

public class Main {
    public static void main(String[] args) {
        if (visualizar1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (visualizar2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        ;
    }

    public static boolean visualizar1(String u) {
        Auxiliares obx1 = new Auxiliares(u);
        System.out.println("Conectando a " + obx1.IP + ", con el usuario " + u);
        return obx1.con();
    }

    public static boolean visualizar2() {
        Auxiliares obx2 = new Auxiliares();
        System.out.println("Conectando a " + obx2.IP + ", con el usuario " + obx2.usuario);
        return obx2.con();
    }
}
