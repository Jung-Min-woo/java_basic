import java.util.*;
class QueueEx1 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Type \"help\" to see help");
        while(true){
            System.out.print(">>");
            try{

                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();
    
                if("".equals(input)) continue;
                if(input.equalsIgnoreCase("q")){
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")){
                    System.out.println("help - Show help");
                    System.out.println("q Or Q - Quit program");
                    System.out.println("history - Show "+ MAX_SIZE +" recent commands");
                } else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);
    
                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator();
    
                    while(it.hasNext()){
                        System.out.println(++i+"."+it.next());
                    }
                } else{
                    save(input);
                    System.out.println(input);
                } 
            } catch(Exception e){
                System.out.println("Input Error");
            }
        }
    }
    public static void save(String input) {
        //Save in queue
        if(!"".equals(input)) q.offer(input);
        //If size of queue exceeds Maximum size, then remove the first input.
        if(q.size()>MAX_SIZE) q.remove();
    }
}