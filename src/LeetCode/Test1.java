package LeetCode;


import java.io.File;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {
        findFiles("/home/rahul/workspace/datastructure/src/LeetCode", ".txt");

    }


    private static void findFiles(String dir, String ext) {
        File file = new File(dir);
        if (file.exists()) {
            String[] filenames = file.list((dir1, name) -> {
                return name.toLowerCase().endsWith(ext);
            });

            for (String str : filenames) {
                System.out.println(str);
            }
        } else {

        }
    }
}
