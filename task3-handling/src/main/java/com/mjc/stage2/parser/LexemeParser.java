package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser() {
    }

    public LexemeParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        //должен разделять string и через abstractTextComponent.add добавлять попорядку
        //как символы так и компоситы
//        AbstractTextComponent abstractTextComponentSentence = new TextComponent(TextComponentType.SENTENCE);
        String[] words = string.split(LEXEME_REGEX);
        for(String word : words){
            AbstractTextComponent abstractTextComponentWord = new TextComponent(TextComponentType.WORD);
            nextParser.parse(abstractTextComponentWord,word);
            abstractTextComponent.add(abstractTextComponentWord);
//            if (word.matches(WORD_REGEX)){
//
//                    nextParser.parse(abstractTextComponentWord,word);
//
//                abstractTextComponent.add(abstractTextComponentWord);
//            }else {
//                SymbolLeaf symbol = new SymbolLeaf(TextComponentType.WORD);
//                nextParser.parse(symbol,word);
//                abstractTextComponent.add(symbol);


//                SymbolLeaf symbol = new SymbolLeaf(TextComponentType.SYMBOL);
//                symbol.setValue(word.charAt(0));
//                abstractTextComponent.add(symbol);
//            }
        }
//        SymbolLeaf symbolLeaf = (SymbolLeaf) abstractTextComponent;
//        symbolLeaf.setValue('d');
//
//        if(string.matches(LEXEME_REGEX)){
//            string.split(abstractTextComponent.getComponentType().getDelimiter());
//        }
//        abstractTextComponent.getComponentType();
//       if(abstractTextComponent.getSize()>0){
//
//       }
    }

    // Write your code here!

}
