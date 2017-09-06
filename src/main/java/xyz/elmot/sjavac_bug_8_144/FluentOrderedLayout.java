package xyz.elmot.sjavac_bug_8_144;

import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Component;
import xyz.elmot.sjavac_bug_8_144.FluentComponent;

import java.util.stream.Stream;

public class FluentOrderedLayout<T extends AbstractOrderedLayout> extends FluentComponent<T> {

    public FluentOrderedLayout(T component) {
        super(component);
    }

    public FluentOrderedLayout<T> add(Stream<Component> components) {//todo file a javac bug
//        components.forEach(c->this.component.addComponent(c));
        components.forEach(this.component::addComponent);
        return this;
    }
}
