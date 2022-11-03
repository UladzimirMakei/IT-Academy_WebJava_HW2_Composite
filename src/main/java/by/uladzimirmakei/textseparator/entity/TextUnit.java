package by.uladzimirmakei.textseparator.entity;

import java.util.List;

public class TextUnit implements TextComponent {
    private String text;
    private TextType textType;

    public TextUnit() {
    }

    public TextUnit(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return new StringBuilder(text).toString();
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public List<TextComponent> getCompositeText() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setCompositeText(List<TextComponent> textComponent) {
        throw new UnsupportedOperationException();
    }


    @Override
    public TextType getTextType() {
        return textType;
    }
}
