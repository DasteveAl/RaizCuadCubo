public class RaCudCub {
    String numbers;
    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
    public int[] getNumbers() {
        String[] parts = numbers.split(",");
        int[] n1 = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }
        return n1;
    }
}
