public class AppData {

    private String[] header;
    private int[][] data;

    public AppData(int column, int line) {
        this.header = new String[column];
        this.data = new int[line][column];
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
