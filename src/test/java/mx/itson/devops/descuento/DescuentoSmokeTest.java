package mx.itson.devops.descuento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Pruebas basicas que ya venian con el proyecto. */
class DescuentoSmokeTest {

    private final Descuento descuento = new Descuento();

    @Test
    void sinUnidadesNoHayDescuento() {
        Assertions.assertEquals(0, descuento.porcentaje(0));
    }

    @Test
    void pedidoPequenoNoTieneDescuento() {
        Assertions.assertEquals(0, descuento.porcentaje(50));
    }

    @Test
    void cantidadNegativaEsUnError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> descuento.porcentaje(-1));
    }
}
