package ph.edu.dlsu;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class Main {

    public static void main(String[] args) {
        testInstallation();
        showImage();
    }

    private static void testInstallation(){
        System.out.println("Welcome to OpenCV " + Core.VERSION);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());
    }

    public static void showImage(){
        try {
            // Path to Image file
            String filePath = "/home/cobalt/IdeaProjects/OpenCV/data/Saitama_OK.jpg";
            Mat src = openFile(filePath);
            Mat newImage = Imgcodecs.imread(filePath);
            if(newImage.dataAddr()==0){
                System.out.println("Couldn't open file " + filePath);
            } else{
                ImageViewer imageViewer = new ImageViewer();
                imageViewer.show(newImage, "Loaded image");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Mat openFile(String fileName) throws Exception{
        Mat newImage = Imgcodecs.imread(fileName);
        if(newImage.dataAddr()==0){
            throw new Exception ("Couldn't open file "+fileName);
        }
        return newImage;
    }
}
