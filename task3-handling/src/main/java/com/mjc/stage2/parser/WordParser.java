package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{
    public WordParser() {
    }

    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] words1 = string.split("");
        for(String words2 : words1){
            SymbolLeaf symbol = new SymbolLeaf(TextComponentType.SYMBOL);
            symbol.setValue(words2.charAt(0));
            abstractTextComponent.add(symbol);
        }
//        SymbolLeaf symbol = new SymbolLeaf(TextComponentType.SYMBOL);
//        symbol.setValue(string.charAt(0));
//        abstractTextComponent.add(symbol);
    }

    // Write your code here!

}
