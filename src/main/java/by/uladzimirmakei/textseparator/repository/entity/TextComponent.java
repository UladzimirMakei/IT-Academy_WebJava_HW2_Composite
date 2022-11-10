package by.uladzimirmakei.textseparator.repository.entity;

import java.util.List;

public interface TextComponent {
    int count();

    List<TextComponent> getCompositeText();

    void setCompositeText(List<TextComponent> textComponent);

    TextType getTextType();
}
