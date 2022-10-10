package com.birdsnail.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    // 可以正确的排序
    public static List<Human> sort1(List<Human> humans) {
        return humans.stream()
                .sorted(Comparator.comparing(Human::getName).reversed())
                .collect(Collectors.toList());
    }

    // 编译失败，泛型检测失败
    public static List<Human> sort2(List<Human> humans) {
        return humans.stream()
                .sorted(Comparator.comparing(it -> it.getName()).reversed())
                .collect(Collectors.toList());
    }

    // 可以正确的排序
    public static List<Human> sort3(List<Human> humans) {
        return humans.stream()
                .sorted(Comparator.comparing(it -> it.getName()))
                .collect(Collectors.toList());
    }

}
