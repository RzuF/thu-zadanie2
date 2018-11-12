package edu.agh.wfiis.designpatterns.patternsUsageExample;

class UndefinedPattern extends DesignPattern {

    public UndefinedPattern() {
        super(null, DesignPattern.Type.UNDEFINED, null, null);
    }

    @Override
    public String refactor(String badCode){
        return null;
    }

}