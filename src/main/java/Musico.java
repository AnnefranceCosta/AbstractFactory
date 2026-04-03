public class Musico {
    private InstrumentoCorda corda;
    private InstrumentoSopro sopro;

    public Musico(FabricaMusical fabrica) {
        this.corda = fabrica.criarInstrumentoCorda();
        this.sopro = fabrica.criarInstrumentoSopro();
    }

    public String prepararCorda() {
        return this.corda.afinar();
    }

    public String prepararSopro() {
        return this.sopro.tocarNota();
    }
}