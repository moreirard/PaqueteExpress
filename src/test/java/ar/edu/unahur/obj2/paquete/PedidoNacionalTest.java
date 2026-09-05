package ar.edu.unahur.obj2.paquete;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PedidoNacionalTest {

    @Test 
    public void dadoPedidonacionalValido_alDespachar_generaGuiaNacionalYConfirma(){
        PedidoNacional pedido = new PedidoNacional(2.0, new EnvioEstandar());
        pedido.despachar();
        assertTrue(pedido.getNuemeroDeGuia().startsWith("PED-NAC-"));
    }

}
