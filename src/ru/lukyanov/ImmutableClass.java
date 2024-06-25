package ru.lukyanov;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final long id;
    private final String name;
    private final List<String> duties;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getDuties() {
        return new ArrayList<>(duties);
    }

    public ImmutableClass(long id, String name, List<String> duties) {
        this.id = id;
        this.name = name;
        this.duties = new ArrayList<>(duties);
    }
}
