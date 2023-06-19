import java.io.FileWriter;   // Import the FileWriter class

public class Main {
    public static void main(String[] args) {
        FileWriter fs = null;
        try {
            fs = new FileWriter("points.csv");
        } catch (Exception e) {
            System.out.println("File not found.");
        }
        for (int i = 0; i < 10000; i++) {
            int rx = (int) (Math.random() * 1280);
            int ry = (int) (Math.random() * 720);
            String s = Integer.toString(rx) + "," + Integer.toString(ry) + "\n";
            try {
                fs.write(s);
            }catch (Exception e) {
                System.out.println("File not found.");
            }
        }
        try {
            fs.close();
        }catch (Exception e) {
            System.out.println("File not found.");
        }
        App myApp = new App();
        myApp.init();

    }
}