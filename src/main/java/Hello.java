public class Hello {
    public static void main(String[] args) {
        // System.out.println("new dawn, new day");
        
    }

    public static void weave(String[][] rug) {
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            System.out.println("");
        }
    }
}