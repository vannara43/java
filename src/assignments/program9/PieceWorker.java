package Assignments.program9;

// Vannara Thong CIS-18A Chapter 10, p.1001, #10.15
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 05/12/2024 12:30PM
 * Assignment Completion:05/12/2024 7:45PM
 * Total Hours for Assignment: 7.15 Hours
 * Comments: N/A
 **************************************************************/

public class PieceWorker extends Employee {
    private double wage; // to store the employee's wage per piece
    private int pieces; // to store the number of pieces produced

    public PieceWorker(String firstName, String lastName,
            String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) { // checks above 0
            throw new IllegalArgumentException("Wage per piece should be above 0");
        }

        if (pieces < 0.0) { // checks above 0
            throw new IllegalArgumentException("Pieces produced should be above 0");
        }

        this.wage = wage;
        this.pieces = pieces;
    }

    // Set Wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage per piece should be above 0");
        }

        this.wage = wage;
    }

    // Set pieces
    public void setPieces(int pieces) {
        if (pieces < 0.0) {
            throw new IllegalArgumentException("Pieces produced should be above 0");
        }

        this.pieces = pieces;
    }

    // Get wage
    public double getWage() {
        return wage;
    }

    // Get pieces
    public int getPieces() {
        return pieces;
    }

    /**********************************************************
     * Calculate employee earnings by multiplying the number
     * of pieces produced by the wage per piece.
     **********************************************************/
    @Override
    public double earnings() {
        double empEarnings = getPieces() * getWage();
        return empEarnings;
    };

    /**********************************************************
     * This should print out Piece Worker in correct format
     **********************************************************/
    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %d",
                "Piece Worker", super.toString(),
                "Wage Per Piece", getWage(), "Pieces Produced", getPieces());
    }

}
