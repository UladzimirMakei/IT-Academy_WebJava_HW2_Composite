package by.uladzimirmakei.textseparator.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TextUnit implements TextComponent {
    private String text;
    private TextType textType;

    public TextUnit(String text) {
        this.text = text;
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
    public String toString() {
        return new StringBuilder(text).toString();
    }
}
