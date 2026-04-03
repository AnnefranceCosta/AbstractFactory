public class FabricaModerna implements FabricaMusical{
    @Override
    public InstrumentoCorda criarInstrumentoCorda() {
        return new GuitarraEletrica();
    }

    @Override
    public InstrumentoSopro criarInstrumentoSopro() {
        return new Saxofone();
    }
}
