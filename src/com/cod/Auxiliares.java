package com.cod;

public class Auxiliares {
    String usuario;
    String IP = "127.0.0.2";

    Auxiliares() {
        usuario = "pepe@danielcastelao.org";
    }

    Auxiliares(String param1) {
        this.usuario = param1;
    }

    public boolean con() {
        if (usuario != "pepe@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
