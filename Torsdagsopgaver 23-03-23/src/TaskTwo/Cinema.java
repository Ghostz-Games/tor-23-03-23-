package TaskTwo;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats]; //Fixed by making the double string array before assigning X on the 0,0 value.

        for(int i = 0; i < this.seats.length; i++){
            for(int j = 0; j < this.seats[i].length; j++){
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        row -= 1;
        seat -=1;
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (String[] seat : seats) {
            result += "|";
            for (String s : seat) {
                result += s + "|";
            }
            result += "\n";
        }
        return result;
    }
}