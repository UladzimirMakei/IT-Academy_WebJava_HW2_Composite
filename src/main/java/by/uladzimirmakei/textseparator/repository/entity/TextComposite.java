package by.uladzimirmakei.textseparator.repository.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class TextComposite implements TextComponent {
    private TextType textType;
    private List<TextComponent> compositeText;

    public TextComposite(TextType textType) {
        this.textType = textType;
        compositeText = new ArrayList<>();
    }

    public TextComposite(String input, TextType textType) {
        this.textType = textType;
        compositeText = new ArrayList<>();
        TextUnit unit = new TextUnit(input);
        compositeText.add(unit);

    }

    @Override
    public int count() {
        int countComposite = 0;
        for (TextComponent unit : compositeText) {
            countComposite += unit.count();
        }
        return countComposite;
    }

    public void add(TextComposite inputComposite) {
        compositeText.add(inputComposite);
    }

    public void add(String inputString) {
        TextUnit unit = new TextUnit(inputString);
        compositeText.add(unit);
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
}
