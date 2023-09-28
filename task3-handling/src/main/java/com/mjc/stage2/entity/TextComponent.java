package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder allText = new StringBuilder();
        //должен разделять объект component (AbstractTextComponent) по порядку и превращать в стринг
//        int size = componentList.size();
        for (AbstractTextComponent component : componentList) {
            allText.append(component.operation());
            if(component.componentType.equals(TextComponentType.WORD)){
                allText.append(" ");
            }



//            if(component.getComponentType()==TextComponentType.SYMBOL){
//
//            }
//
//            component.getComponentType()
//            component.operation();
        }
//        String[] result = sentence.split(" ");
//        for (int i = 0; i < result.length; i++) {
//            worlds.add(new World(result[i]));
//        }
        return allText.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.size();
    }
// Write your code here!
}
