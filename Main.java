public class Main{
    public static void main(String[] args){
        for(int i = 1; i<=100;i++){
        if(i%3==0&&i%5==0){    // handles numbers that are multiples of 3 and 5
          System.out.println("FooBaa");
        }
        else if(i%3==0){  // handles numbers that are multiples of 3
          System.out.println("Foo");
        }
        else if(i%5==0){ // handles numbers that are multiples of 5
          System.out.println("Baa");
        }
        else{             // all other cases
          System.out.println(i);
        }
      }
      return;
    }
}
