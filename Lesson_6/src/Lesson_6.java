import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Lesson_6 {
    public static void main(String[] arg) throws IOException {

        AppData appData = new AppData(3, 2);

        FileInputStream filestream = new FileInputStream("Lesson_6/file.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(filestream));

        int lineNumber = 0;
        String strLine;
        String[] tmp;
        while ((strLine = br.readLine()) != null) {
            if (appData.getHeader()[0] == null) {
                appData.setHeader(strLine.split(";"));
            } else {
                tmp = strLine.split(";");
                for (int i = 0; i < tmp.length; i++) {
                    appData.getData()[lineNumber][i] = Integer.parseInt(tmp[i].trim());
                }
                lineNumber++;
            }
        }

        Path path = Paths.get("Lesson_6/result.csv");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < appData.getHeader().length; i++) {
            String content = appData.getHeader()[i];
            stringBuilder.append(content);
            if (appData.getHeader().length > i + 1) {
                stringBuilder.append(";");
            }
        }
        stringBuilder.append('\n');
        Files.writeString(path, stringBuilder.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        for (int i = 0; i < appData.getData().length; i++) {
            stringBuilder = new StringBuilder();
            for (int j = 0; j < appData.getData()[i].length; j++) {
                int content = appData.getData()[i][j];
                stringBuilder.append(content);
                if (appData.getData()[i].length > j + 1) {
                    stringBuilder.append(";");
                }
            }
            stringBuilder.append('\n');
            Files.writeString(path, stringBuilder.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
        System.out.println("Готово");
    }

}
