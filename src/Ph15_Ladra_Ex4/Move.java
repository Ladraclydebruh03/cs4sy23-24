package Ph15_Ladra_Ex4;
public class Move {
    private final String name;
    
    public Move(String name){
        this.name = name;
    }
	public String getName(){
		return this.name;
	}
    public static int compareMoves(Move m1, Move m2) {
        // This method returns 0 if m1 wins, 1 if m2 wins, and 2 if it's a tie
        String name1 = m1.getName().toLowerCase();
        String name2 = m2.getName().toLowerCase();

        if (name1.equals(name2)) {
            return 2; // It's a tie
        } else if (
            (name1.equals("rock") && name2.equals("scissors")) ||
            (name1.equals("paper") && name2.equals("rock")) ||
            (name1.equals("scissors") && name2.equals("paper"))
        )   {
            return 0; // m1 wins
        } 
        else {
            return 1; // m2 wins
        }
    }

}