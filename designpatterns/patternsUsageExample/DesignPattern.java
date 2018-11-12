package edu.agh.wfiis.designpatterns.patternsUsageExample;

class DesignPattern {
    private final String name;
    private final String patternCode;
    private final String description;
    private final String example;
    private final DesignPattern.Type type;

    public enum Type {
        UNDEFINED,
        CREATIONAL,
        STRUCTURAL,
        BEHAVIORAL;
    }

    public String refactor(String badCode){
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/

        String goodCode = "this code is very good";
        return goodCode;
    }

    public String showExample() {
        return this.example;
    }

    public boolean isSameType(DesignPattern designPattern) {
        return designPattern.type == this.type;
    }

    public static WithName getBuilder() {
        return new Builder();
    }

    private DesignPattern(
            String name,
            String type,
            String code,
            String description,
            String example) {
        this.name = name;
        this.type = type;
        this.code = code;
        this.description = description;
        this.example = example;
    }

    private static class Builder implements BuildingDesignPattern {
        private String name;
        private DesignPattern.Type type;
        private String code;
        private String description;
        private String example;

        @Override
        public WithType setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public WithCode setType(DesignPattern.Type type) {
            this.type = type;
            return this;
        }

        @Override
        public WithOptional setCode(String code) {
            this.code = code;
            return this;
        }

        @Override
        public WithOptional setDescription(String description) {
            this.description = description;
            return this;
        }

        @Override
        public WithOptional setExample(String example) {
            this.example = example;
            return this;
        }

        @Override
        public DesignPattern build() {
            return new DesignPattern(name, type, code, description, example);
        }
    }

    interface BuildingDesignPattern extends WithName, WithType, WithCode, WithOptional {}

    interface WithName {
        WithType name(String name);
    }

    interface WithType {
        WithCode type(DesignPattern.Type type);
    }

    interface WithCode {
        WithOptional code(String code);
    }

    interface WithOptional extends Build {
        WithOptional description(String description);
        WithOptional example(String example);
    }

    interface Build {
        DesignPattern build();
    }
}