import java.io.*;

class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);        
        System.out.println(f.getName() + " is successfully generated!");
    }    
    static File createFile(String fileName){
        try {
            if(fileName == null || fileName.equals(""))
                throw new Exception("Invalid filename");
        } catch (Exception e) {
            fileName = "NoName.txt";
        }finally{
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f){
        try{
            f.createNewFile();
        } catch(Exception e){}
    }
}
