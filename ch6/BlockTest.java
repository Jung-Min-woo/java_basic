class BlockTest {
    static{ // Class initialization block
        System.out.println("static ()");
    }
    { // Instance initialization block
        System.out.println("{ }");
    }
    public BlockTest(){ System.out.println("Constructor Called!"); }
    public static void main(String args[]){
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();
        
        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }
    // static ()
    // BlockTest bt = new BlockTest();
    // { }
    // Constructor Called!
    // BlockTest bt2 = new BlockTest();
    // { }
    // Constructor Called!
}
