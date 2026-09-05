package ar.edu.unahur.obj2.paquete;



public class CalculadorDeCostoDeEnvio {

    public Double calcular(String tipoEnvio, Double pesoEnKg) {
        if (tipoEnvio.equals("ESTANDAR")) {
            return 150.0 + 30.0 * pesoEnKg;
        } else if (tipoEnvio.equals("EXPRESS")){
            return 400.0 + 60.0 * pesoEnKg;
        } else {
            return 0.0;
        }
              
    }

   
}
