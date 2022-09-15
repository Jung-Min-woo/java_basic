import java.io.*;
class ExceptionEx16 {
    public static void main(String[] args) {
        try{
            File f = createFile(args[0]);
            System.out.println(f.getName()+" is successfully generated");
        } catch(Exception e){
            System.out.println(e.getMessage() + " retype filename");
        }
    }
    static File createFile(String fileName) throws Exception{
        if (fileName == null || fileName.equals(""))
            throw new Exception("Invalid File name");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}