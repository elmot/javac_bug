package xyz.elmot.sjavac_bug_8_144;

import com.vaadin.ui.AbstractComponent;

import java.util.Locale;
import java.util.function.Supplier;

public class FluentComponent<T extends AbstractComponent> implements Supplier<T> {

    protected final T component;

    public FluentComponent(final T component) {
        this.component = component;
    }

    @Override
    public T get() {
        return component;
    }

}
