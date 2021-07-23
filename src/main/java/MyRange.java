public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStart() {
        //return this.input.charAt(1) - 48;
        return Integer.parseInt(String.valueOf(this.input.charAt(1)));
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEnd() {
        return Integer.parseInt(String.valueOf(this.input.charAt(3)));
    }
}
