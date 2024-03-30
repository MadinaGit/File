import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {
    public static void createDir(String pathway) {
        File folderDir = new File(pathway);
        Calendar calendar = new GregorianCalendar();
        if (folderDir.mkdir()) {
            text2.append(folderDir).append(" Каталог создан").append('\n').append(calendar.getTime()).append(" ");
        } else text2.append(folderDir).append(" Каталог не создан").append('\n').append(calendar.getTime()).append(" ");
    }

    public static void createFile(String fileName) {
        File newFile = new File(fileName);
        Calendar calendar = new GregorianCalendar();
        try {
            if (newFile.createNewFile()) {
                text2.append(newFile).append(" Файл создан").append('\n').append(calendar.getTime()).append(" ");
            } else text2.append(newFile).append(" Файл не создан").append('\n').append(calendar.getTime()).append(" ");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static StringBuilder text2 = new StringBuilder(new Date() + " ");

    public static void main(String[] args) {

        createDir("D://Games");
        createDir("D://Games/src");
        createDir("D://Games/res");
        createDir("D://Games/res/drawables");
        createDir("D://Games/res/vectors");
        createDir("D://Games/res/icons");
        createDir("D://Games/savegames");
        createDir("D://Games/temp");
        createDir("D://Games/src/main");
        createDir("D://Games/src/test");
        createFile("D://Games/src/main/Main.java");
        createFile("D://Games/src/main/Utils.java");
        createFile("D://Games/temp/temp.txt");

        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(text2.toString());
            writer.append('\n');
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
