package enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Elfs {
    @JsonProperty("yellow")
    YELLOW("yellow"),

    @JsonProperty("black")
    BLACK("black"),

    @JsonProperty("pink")
    PINK("pink"),

    @JsonProperty("white")
    WHITE("white");

    private final String value;

    Elfs(final String value) {
        this.value = value;
    }

    /**
     *Converts string to Enum element
     * @param label
     * @return
     */
    public static Elfs valueOfElfLabel(final String label) {
        for (Elfs e : values()) {
            if (e.value.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
