package ar.edu.unahur.obj2.paquete;

public class EnvioExress implements EstrategiaDeEnvio{

    @Override
    public Double calcularCosto(Double pesoEnKg) {
        return 400.0 + 60.0 * pesoEnKg;
    }

}
