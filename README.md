# HelloOpenCVIntellij

## Screenshot:

![screenshot](https://github.com/melvincabatuan/HelloOpenCVIntellij/blob/master/Selection001.png)

## Code:

```java
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
```
