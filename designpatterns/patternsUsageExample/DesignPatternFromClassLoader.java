public class DesignPatternFromFileFactory extends DesignPatternFactory {

    private final String className;
    private final PatternCodeExtractor patternCodeExtractor = new PatternCodeExtractor();

    public DesignPatternFromFileFactory(String className) {
        this.className = className;
    }

    @Override
    protected String getPatternCode() {
        ClassLoader classLoader = getClassLoaderFromClassName(this.className);
        return this.patternCodeExtractor.extractFromClassLoader(classLoader);
    }

    private ClassLoader getClassLoaderFromClassName(String className) {
        /* some magic happens here, irrelevant from this example perspective...*/
        return "class loader from class name";
    }
}