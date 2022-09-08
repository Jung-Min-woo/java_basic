class Document{
    static int count = 0;
    String name;

    Document(){this("NoNamed"+ ++count);}
    Document(String name){
        this.name = name;
        System.out.println("Doc \"" +this.name +"\" generated.");
    }
}
class DocumentTest {
    public static void main(String args[]){
        Document d1 = new Document();
        Document d2 = new Document("Java.txt");
        Document d3 = new Document();
        Document d4 = new Document();
        // Doc "NoNamed1" generated.
        // Doc "Java.txt" generated.
        // Doc "NoNamed2" generated.
        // Doc "NoNamed3" generated.
    }
}