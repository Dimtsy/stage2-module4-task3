package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser() {
    }

    public LexemeParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] words = string.split(LEXEME_REGEX);
        for (String word : words) {
            AbstractTextComponent abstractTextComponentWord = new TextComponent(TextComponentType.WORD);
            nextParser.parse(abstractTextComponentWord, word);
            abstractTextComponent.add(abstractTextComponentWord);
        }
    }

    // Write your code here!

}
