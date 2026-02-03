package utils;

import model.BaseEntity;

import java.util.List;

public class SortingUtils {
    public static void sortByName(List<? extends BaseEntity> list) {
        list.sort((a, b) -> a.getName().compareTo(b.getName()));
    }
}
