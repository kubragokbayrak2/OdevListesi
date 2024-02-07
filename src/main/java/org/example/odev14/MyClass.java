package org.example.odev14;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class MyClass<T> {
    private T field;

    public void setValue(T field) {
        this.field = field;
    }

    public T getValue() {
        return this.field;
    }

    public Optional<T> findElement(Collection<T> collection, T element) {
        return collection.stream()
                .filter(e -> e.equals(element))
                .findFirst();
    }


}
