package com.cod;

public class Auxiliares {
    private static Auxiliares instance = null;
    String usuario;
    String IP = "127.0.0.2";

    Auxiliares() {
        usuario = "pepe@danielcastelao.org";
    }

    Auxiliares(String param1) {
        this.usuario = param1;

    }

    public static Auxiliares getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Auxiliares();
        }
        // devuelvo la instancia
        return instance;
    }



    public boolean con() {
        if (usuario != "pepe@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
