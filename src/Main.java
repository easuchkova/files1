import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File scrDir = new File("/Users/ekaterina/Games/scr");
        File resDir = new File("/Users/ekaterina/Games/res");
        File savegamesDir = new File("/Users/ekaterina/Games/savegames");
        File tempDir = new File("/Users/ekaterina/Games/temp");

        File mainDir = new File("/Users/ekaterina/Games/src/main");
        File testDir = new File("/Users/ekaterina/Games/src/test");

        File item1 = new File("/Users/ekaterina/Games/src/main/Main.java");
        File item2 = new File("/Users/ekaterina/Games/src/main/Utils.java");

        File drawablesDir = new File("/Users/ekaterina/Games/res/dravables");
        File vectors = new File("/Users/ekaterina/Games/res/vectors");
        File icons = new File("/Users/ekaterina/Games/res/icons");

        File item3 = new File("/Users/ekaterina/Games/temp/temp.txt");

        StringBuilder temp = new StringBuilder();

        if (scrDir.mkdir()) temp.append("Директория " + scrDir.getName() + " создана\n");
        else temp.append("Директория " + scrDir.getName() + " не была создана\n");

        if (resDir.mkdir()) temp.append("Директория " + resDir.getName() + " создана\n");
        else temp.append("Директория " + resDir.getName() + " не была создана\n");

        if (savegamesDir.mkdir()) temp.append("Директория " + savegamesDir.getName() + " создана\n");
        else temp.append("Директория " + savegamesDir.getName() + " не была создана\n");


        if (tempDir.mkdir()) temp.append("Директория " + tempDir.getName() + " создана\n");
        else temp.append("Директория " + tempDir.getName() + " не была создана\n");

        if (mainDir.mkdir()) temp.append("Директория " + mainDir.getName() + " создана\n");
        else temp.append("Директория " + mainDir.getName() + " не была создана\n");

        if (testDir.mkdir()) temp.append("Директория " + testDir.getName() + " создана\n");
        else temp.append("Директория " + testDir.getName() + " не была создана\n");

        if (drawablesDir.mkdir()) temp.append("Директория " + drawablesDir.getName() + " создана\n");
        else temp.append("Директория " + drawablesDir.getName() + " не была создана\n");

        if (vectors.mkdir()) temp.append("Директория " + vectors.getName() + " создана\n");
        else temp.append("Директория " + vectors.getName() + " не была создана\n");

        if (icons.mkdir()) temp.append("Директория " + icons.getName() + " создана\n");
        else temp.append("Директория " + icons.getName() + " не была создана\n");

        try {
            if (item1.createNewFile()) temp.append("Файл " + item1.getName() + " был создан\n");
        } catch (IOException e) {
            temp.append("Файл " + item1.getName() + " не был создан. " + e.getMessage() + "\n");
        }

        try {
            if (item2.createNewFile()) temp.append("Файл " + item2.getName() + " был создан\n");
        } catch (IOException e) {
            temp.append("Файл " + item2.getName() + " не был создан. " + e.getMessage() + "\n");
        }

        try {
            if (item3.createNewFile()) temp.append("Файл " + item3.getName() + " был создан\n");
        } catch (IOException e) {
            temp.append("Файл " + item3.getName() + " не был создан. " + e.getMessage() + "\n");
        }

        String tempFin = String.valueOf(temp);

        try (FileWriter writer = new FileWriter("/Users/ekaterina/Games/temp/temp.txt")) {
            writer.write(tempFin);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
