package io.bmuskalla.junit5.christmas.decoration;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.extension.Extension;

import java.lang.reflect.Method;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class JUnitChristmasDecorations extends DisplayNameGenerator.Simple implements Extension {
    
    private static final String[] DECORATIONS = {"🎄", "🎅", "🤶", "🦌", "🍪", "🥛", "🌟", "❄️", "⛄", "🎁", "🧦", "🔔", "🎶"};

    public String decorate(String name) {
        return chooseRandomDecoration() + name + chooseRandomDecoration();
    }

    private String chooseRandomDecoration() {
        return ThreadLocalRandom.current().ints(0, DECORATIONS.length)
                .limit(3)
                .mapToObj(i -> DECORATIONS[i]).collect(Collectors.joining());
    }

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return decorate(super.generateDisplayNameForClass(testClass));
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return decorate(super.generateDisplayNameForNestedClass(nestedClass));
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return decorate(super.generateDisplayNameForMethod(testClass, testMethod));
    }
}
