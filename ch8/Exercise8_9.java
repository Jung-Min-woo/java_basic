import java.util.*;
class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("This function is not supported",100);
    }
}
class UnsupportedFunctionException extends RuntimeException{
    private final int ERR_CODE;
    public int getErrorCode(){
        return ERR_CODE;
    }
    
    //Constructor
    UnsupportedFunctionException(String msg){
        this(msg, 100);
    }
    UnsupportedFunctionException(String msg, int errCode){
        super(msg);
        ERR_CODE = errCode;
    }

    @Override
    public String getMessage(){
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}
//Result must example
//Exception in thread "main" UnsupportedFunctionException:[100]Invalid function
//at Exercise8_9.main(Exercise8_9.java:5)

//Output
// Exception in thread "main" UnsupportedFunctionException: [100]This function is not supported
//         at Exercise8_9.main(Exercise8_9.java:4)