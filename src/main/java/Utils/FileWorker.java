package Utils;

import java.io.*;

public class FileWorker {
    private String fileName;
    private Object obj;

    public String getFileName() {
        return fileName;
    }

    public Object getObj() {
        return obj;
    }

    public FileWorker(String fileName, Object obj) {

        this.fileName = fileName;
        this.obj = obj;
    }

    public void writeToFile(){
//        File file  = new File(filename);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
