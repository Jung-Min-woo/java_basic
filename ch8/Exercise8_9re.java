class Exercise8_9re {
    public static void main(String[] args) {
        throw new UnsupportedFunction("Invalid input", 100);
    }        
}
class UnsupportedFunction extends RuntimeException{
    private final int ERR_CODE;

    UnsupportedFunction(){
        ERR_CODE = 100;
    }
    UnsupportedFunction(String msg, int ERR_CODE){
        super(msg);
        this.ERR_CODE = ERR_CODE;
    }
    public int getErrorCode(){
        return ERR_CODE;
    }
    @Override
    public String getMessage() {
        return "["+ERR_CODE+"]" + super.getMessage();
    }
}