class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            // TODO: handle exception
            //try {} catch (Exception e) {} // Error: var e is already defined
        } // end line of try-catch

        try{

        } catch (Exception e){

        }
    }    
}
