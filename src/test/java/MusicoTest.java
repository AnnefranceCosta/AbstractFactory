import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicoTest {

    @Test
    void deveAfinarInstrumentoClassico() {
        FabricaMusical fabrica = new FabricaClassica();
        Musico musico = new Musico(fabrica);
        assertEquals("Afinando as cordas de crina do Violino.", musico.prepararCorda());
    }

    @Test
    void deveAfinarInstrumentoModerno() {
        FabricaMusical fabrica = new FabricaModerna();
        Musico musico = new Musico(fabrica);
        assertEquals("Afinando guitarra com distorção no pedal.", musico.prepararCorda());
    }

    @Test
    void deveTocarSoproClassico() {
        FabricaMusical fabrica = new FabricaClassica();
        Musico musico = new Musico(fabrica);
        assertEquals("Soprando nota suave na Flauta.", musico.prepararSopro());
    }

    @Test
    void deveTocarSoproModerno() {
        FabricaMusical fabrica = new FabricaModerna();
        Musico musico = new Musico(fabrica);
        assertEquals("Tocando nota vibrante no Saxofone.", musico.prepararSopro());
    }
}