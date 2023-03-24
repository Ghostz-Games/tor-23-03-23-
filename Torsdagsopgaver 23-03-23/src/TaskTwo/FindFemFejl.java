package TaskTwo;

public class FindFemFejl {

    public static void main(String[] args) {

        /*Fejl fundet:
         1. The double array was not initialized before trying to fill it
         2. The double array was not filled before trying to change the content
         3. The numberOfRows and the numberOfSeats variables were holding the length of the arrays, and not the amount of indexes
         4. When canceling a reservation, and checking for a reserved seat, this "x" was not capitalized, also the O was a zero.
         5. The system did not print the cinema again after making the changes
         6. The system was printing the first result as NULL, changed by making the string empty rather than defining it as nothing
         7. Row and seat is 1 unit higher, than expected, due to the arrays starting on 0-index*/

        Cinema biogrande = new Cinema(20, 10);


        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);


        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);

    }
}