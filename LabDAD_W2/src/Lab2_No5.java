import java.io.*;

class Lab2_No5 extends FileReader {
    File file;

    Lab2_No5(File file) throws Exception {
        super(file);
        this.file = file;
    }

    Lab2_No5(String filename) throws Exception {
        super(filename);
        file = new File(filename);
    }

    public String readContent() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(this)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator()); 
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\PC\\eclipse-workspace\\LabDAD_W2\\Welcome.txt";
        try (Lab2_No5 reader = new Lab2_No5(filePath)) {
            System.out.println(reader.readContent());
        }

        try (Lab2_No5 reader2 = new Lab2_No5(new File(filePath))) {
            System.out.println(reader2.readContent());
        }
    }
}
