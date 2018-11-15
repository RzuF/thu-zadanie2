package edu.agh.wfiis.designpatterns.patternsUsageExample;

import java.io.File;

public class PatternCodeExtractor {
    public String extractFromFile(File file) {
        /* some magic happens here, irrelevant from this example perspective...*/
        return "pattern code from file";
    }

    public String extractFromClassLoader(ClassLoader classLoader){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "pattern code from class loader";
    }
}