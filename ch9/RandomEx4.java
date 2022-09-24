class RandomEx4 {
    final static int RECORD_NUM = 10;
    final static String TABLE_NAME = "TEST_TABLE";
    final static String[] CODE1 = {"010", "011", "017", "018", "019"};
    final static String[] CODE2 = {"MAN", "WOMAN"};
    final static String[] CODE3 = {"In one's twenties", "In one's thirties", "In one's forties"};

    public static void main(String[] args) {
        for(int i=0; i<RECORD_NUM;i++){
            System.out.println("INSERT INTO " +TABLE_NAME + "'"
                    + "VALUES("
                    + "'" + getRandArr(CODE1) + "'"            
                    + ", '" + getRandArr(CODE2) + "'"            
                    + ", '" + getRandArr(CODE3) + "'"            
                    + ", " + getRand(100, 200) 
                    );
        }
    }

    public static String getRandArr(String[] arr) {
           return arr[getRand(arr.length-1)];
    }
    public static int getRand(int n) {
        return getRand(0, n);
    }
    public static int getRand(int from, int to) {
        return (int)(Math.random()*(Math.abs(to-from)+1) + Math.min(from, to));
    }
}