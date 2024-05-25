package projects.medicationtracker.Models;

public class FilterField<T> {
    public enum FilterOptions {
        BEFORE,
        AFTER,
        EQUALS,
        LESS_THAN,
        GREATER_THAN
    }

    public String field;
    public T value;
    public FilterOptions option;
}
