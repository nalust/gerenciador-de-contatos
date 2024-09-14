public enum MenuOption {
    ADD_CONTACT(1),
    SEARCH_CONTACT(2),
    REMOVE_CONTACT(3),
    LIST_CONTACTS(4),
    EXIT(5);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuOption from(final int value) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Opcao invalida: " + value);
    }
}
