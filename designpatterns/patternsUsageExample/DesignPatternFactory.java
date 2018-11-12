package edu.agh.wfiis.designpatterns.patternsUsageExample;

public class DesignPatternFactory {

    public DesignPattern create(PatternName patternName) {
        switch (patternName) {
            case BUILDER: {
                DesignPattern pattern = DesignPattern.getBuilder()
                                            .setName("builder")
                                            .setType(DesignPattern.Type.CREATIONAL)
                                            .setCode("Some builder code")
                                            .setDescription("builder pattern")
                                            .build();                
                return pattern;
            }
            case DECORATOR: {
                DesignPattern pattern = DesignPattern.getBuilder()
                                            .setName("decorator")
                                            .setType(DesignPattern.Type.CREATIONAL)
                                            .setCode("Some decorator code")
                                            .setDescription("decorator pattern")
                                            .build(); 
                return pattern;
            }
            case STRATEGY: {                
                DesignPattern pattern = DesignPattern.getBuilder()
                                            .setName("strategy")
                                            .setType(DesignPattern.Type.BEHAVIORAL)
                                            .setCode("Some strategy code")
                                            .setDescription("strategy pattern")
                                            .build(); 
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
}