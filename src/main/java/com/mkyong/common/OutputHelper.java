package com.mkyong.common;

/**
 * Created by a.shipulin on 14.10.16.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;
    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
