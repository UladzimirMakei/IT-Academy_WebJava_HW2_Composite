package by.uladzimirmakei.textseparator.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private TextType textType;
    private List<TextComponent> compositeText;

    public TextComposite(TextType textType) {
        this.textType = textType;
        compositeText = new ArrayList<>()
        ;
    }

    public TextComposite(String input, TextType textType) {
        this.textType = textType;
        compositeText = new ArrayList<>();
        TextUnit unit = new TextUnit(input);
        compositeText.add(unit);

    }

    public TextType getTextType() {
        return textType;
    }

    public void setTextType(TextType textType) {
        this.textType = textType;
    }

    public void add(TextComposite inputComposite) {
        compositeText.add(inputComposite);
    }

    public void add(String inputString) {
        TextUnit unit = new TextUnit(inputString);
        compositeText.add(unit);
    }

    public void remove(TextComposite input) {
        compositeText.remove(input);
    }

    @Override
    public List<TextComponent> getCompositeText() {
        return compositeText;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (TextComponent unit : compositeText) {
            sb.append(unit);
            sb.append(textType.getDelimiter());
        }
        return sb.toString();
    }

    @Override
    public int count() {
        int countComposite = 0;
        for (TextComponent unit : compositeText) {
            countComposite += unit.count();
        }
        return countComposite;
    }

    @Override
    public void setCompositeText(List<TextComponent> compositeText) {
        this.compositeText = compositeText;
    }
}
