import java.util.*; //For Scanner
class ScannerEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("<put 2digits>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Input : " + input);
        System.out.printf("num=%d%n",num);
    }
}