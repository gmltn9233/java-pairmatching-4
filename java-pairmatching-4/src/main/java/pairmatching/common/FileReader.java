package pairmatching.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pairmatching.common.enums.FilePath;

public class FileReader {
    public static List<String> readFile(FilePath filePath) {
        List<String> names = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(filePath.getFilePath()));
            while(scanner.hasNext()){
                String name = scanner.next();
                names.add(name);
            }
        }catch (FileNotFoundException e){
            System.out.println("[ERROR] 파일 경로가 올바르지 않습니다.");
        }
        return names;
    }
}
