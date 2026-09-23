package mx.itson.devops.descuento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * P2 - Pruebas de frontera.
 *
 * Un fallo por fail("TODO...") solo significa "no escribi la prueba".
 * NO es evidencia de un defecto: eso lo demuestra un fallo con
 * valor esperado y valor obtenido.
 */
class DescuentoFronteraTest {

    private final Descuento descuento = new Descuento();

    @Test
    void sinDescuentoJustoAntesDeLaFrontera() {
        // preparar / ejecutar / comparar
        int obtenido = descuento.porcentaje(99);
        assertEquals(0, obtenido);
    }

    @Test
    void diezPorCientoEnLaFrontera() {
        int obtenido = descuento.porcentaje(100);
        assertEquals(10, obtenido);
    }

    @Test
    void diezPorCientoDespuesDeLaFrontera() {
        int obtenido = descuento.porcentaje(101);
        assertEquals(10, obtenido);
    }

    @Test
    void totalEnLaFronteraAplicaElDescuento() {
        // 100 unidades a $10.00 = $1000.00; con 10 % => $900.00
        assertEquals(90_000L, descuento.totalCentavos(1_000L, 100));
    }
}
