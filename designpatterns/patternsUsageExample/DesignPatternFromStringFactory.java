public class DesignPatternFromStringFactory extends DesignPatternFactory {

    private final String patternCode;

    public DesignPatternFromStringFactory(String patternCode) {
        this.patternCode = patternCode;
    }

    @Override
    protected String getPatternCode() {
        return this.patternCode;
    }
}