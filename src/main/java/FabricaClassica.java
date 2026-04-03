public class FabricaClassica implements FabricaMusical{
    @Override
    public InstrumentoCorda criarInstrumentoCorda() {
        return new Violino();
    }

    @Override
    public InstrumentoSopro criarInstrumentoSopro() {
        return new FlautaDoce();
    }
}
