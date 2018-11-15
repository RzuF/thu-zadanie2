public class DesignPatternFromFileFactory extends DesignPatternFactory {

    private final String fileName;
    private final PatternCodeExtractor patternCodeExtractor = new PatternCodeExtractor();

    public DesignPatternFromFileFactory(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected String getPatternCode() {
        File file = getFileFromFileName(this.fileName);
        return this.patternCodeExtractor.extractFromFile(file);
    }

    private File getFileFromFileName(String fileName) {
        /* some magic happens here, irrelevant from this example perspective...*/
        return "file from file name";
    }
}