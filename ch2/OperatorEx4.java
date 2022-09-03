class OperatorEx4 {
    public static void main(String[] args){
        int i = -10;
        i =+i;
        System.out.println(i); //No action for +VAR
        i=-10;
        i=-i;
        System.out.println(i); // It cannot adjust to datatype 'char' or 'boolean'
    }
}
