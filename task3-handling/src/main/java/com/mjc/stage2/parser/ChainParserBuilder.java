package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        // Write your code here!
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser abstractTextParser = null;
        for (AbstractTextParser component : parsers) {
            if(abstractTextParser==null){
                abstractTextParser= component;
            }else {
                component.setNextParser(abstractTextParser);
                abstractTextParser =component;
            }

        }
        // Write your code here!
        return abstractTextParser;
    }
}
