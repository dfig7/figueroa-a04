package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Website {

    String siteName = "";
    String siteAuthor = "";
    String startingPath = "";

    public String makeIndexHTML(){
        String path = startingPath + siteName + "/index.html";

        File htmlFile = new File(path);

        try{
            FileWriter myWriter = new FileWriter(htmlFile);
            myWriter.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta author=\"" + siteAuthor + "\">\n" +
                    "    <title>" + siteName + "</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    public String makeFolder(){
        String path = startingPath+siteName;
        File newFolder = new File(path);
        newFolder.mkdirs();

        return path;
    }

    public String makeJavaFolder(){
        String path = startingPath+siteName+"/js/";
        File javaFolder = new File(path);
        javaFolder.mkdirs();


        return path;
    }

    public String makeCSSFolder(){
        String path = startingPath+siteName+"/css/";
        File cssFolder = new File(path);
        cssFolder.mkdirs();

        return path;
    }

}
