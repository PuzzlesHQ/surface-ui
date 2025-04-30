package dev.puzzleshq.util;

public class Identifier {

    private final String namespace, name;

    public Identifier(String namespace, String name) {
        this.namespace = namespace;
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public static Identifier of(String str) {
        String[] strings = str.split(":");
        if (strings.length < 2) return new Identifier("cereal", str);

        return new Identifier(strings[0], strings[1]);
    }

}
