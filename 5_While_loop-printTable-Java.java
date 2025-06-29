//User function Template for Java
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                System.out.print(n * multiplier + " ");
                multiplier--;
            }
       System.out.println();
	 }
	 public static void main(String args[]){
	     printTable(2);
	 }

}
