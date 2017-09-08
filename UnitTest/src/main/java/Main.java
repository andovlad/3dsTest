public class Main {
	
	
	public String printing(String text){
        return text;
    }
	
	public String printing2(){
        return "test";
    }
	
    public static void main (String args[]) {
        //To make code fail please uncomment next string
        //PrintStream writer = new PrintStream( new File("randInts.txt"));
			Main mn = new Main(); // create a new object of the class Study
			String result = mn.printing("test"); 		
			System.out.println (result);
		
    }
}
