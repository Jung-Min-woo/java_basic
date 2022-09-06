public class ArrayEx16 {
    public static void main(String[] args){
        //!! When there is no args, JVM makes args as empty array(size zero array), not NULL
        System.out.println(args);
        System.out.println("Nparameter : "+args.length);
        for(int i = 0; i<args.length; i++) System.out.println("args["+i+"] = \""+ args[i]+ "\"");
        /* if there is no input for args */
        // Nparameter : 0
        // [Ljava.lang.String;@4aa298b7
        
        /* if there is an input for args */
        // Nparameter : 2
        // [Ljava.lang.String;@4aa298b7
        // args[0] = "Hello"
        // args[1] = "Java"
    }
}