import java.util.*;
class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("This function is not supported",100);
    }
    class UnsupportedFunctionException extends Exception{
        final private int ERR_CODE = 100;
        public int getErrorCode(){
            return ERR_CODE;
        }
        public String getMessage(){
            
        }
    }
}
