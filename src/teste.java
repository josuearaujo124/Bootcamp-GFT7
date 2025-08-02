public class teste {


    public static void main(String[] args) {
        String a = "* ";
        int contador = 1,decressor = 0;
        
        while (contador < 10) {
            while (decressor < contador  ) {
               System.out.print(a);
               decressor +=1;

            }
            System.out.println();
            contador +=1;
            decressor = 0;
          
           
        }
        
    }
    
    
}
