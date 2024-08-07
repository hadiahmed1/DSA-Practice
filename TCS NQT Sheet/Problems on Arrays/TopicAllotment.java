public class TopicAllotment {
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){
            System.out.print("Topic"+i+":");
            for(int j=i;j<=130;j+=15){
                System.out.print(j+", ");
            }
            System.out.print("L"+i+", B"+i);
            System.out.println();
            System.out.println();
            
        }
    }
}
