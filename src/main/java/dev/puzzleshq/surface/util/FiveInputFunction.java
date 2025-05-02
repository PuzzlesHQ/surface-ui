package dev.puzzleshq.surface.util;

public interface FiveInputFunction<A, B, C, D, E, RETURN> {

    RETURN apply(A a, B b, C c, D d, E e);

}
