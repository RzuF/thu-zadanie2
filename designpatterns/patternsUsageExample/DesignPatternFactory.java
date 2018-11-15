package edu.agh.wfiis.designpatterns.patternsUsageExample;

public abstract class DesignPatternFactory {

    public DesignPattern create(PatternName patternName) {
        switch (patternName) {
            case BUILDER: {
                DesignPattern pattern = createBuilder();
                return pattern;
            }
            case DECORATOR: {
                DesignPattern pattern = createDecorator();
                return pattern;
            }
            case STRATEGY: {                
                DesignPattern pattern = createStrategy(); 
                return pattern;
            }
            default: {
                DesignPattern pattern = new UndefinedPattern();
                return pattern;
            }
        }
    }

    public String listAvaliablePatternNames(){
        return PatternName.values().toString();
    }

    enum PatternName {
        BUILDER, DECORATOR, STRATEGY;
    }

    protected abstract String getPatternCode();

    private DesignPattern createBuilder() {
        return DesignPattern.getBuilder()
                            .setName("builder")
                            .setType(DesignPattern.Type.CREATIONAL)
                            .setCode("Some builder code")
                            .setPatternCode(getPatternCode())
                            .setDescription("builder pattern")
                            .build();
    }

    private DesignPattern createStrategy() {
        return DesignPattern.getBuilder()
                            .setName("strategy")
                            .setType(DesignPattern.Type.BEHAVIORAL)
                            .setCode("Some strategy code")
                            .setPatternCode(getPatternCode())
                            .setDescription("strategy pattern")
                            .build(); 
    }

    private DesignPattern createDecorator() {
        return DesignPattern.getBuilder()
                            .setName("decorator")
                            .setType(DesignPattern.Type.CREATIONAL)
                            .setCode("Some decorator code")
                            .setPatternCode(getPatternCode())
                            .setDescription("decorator pattern")
                            .build();
    }
}