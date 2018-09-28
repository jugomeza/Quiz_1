/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author sebas
 */
public class BookedFlight {
    private int flithNumber;
    private String departure;
    private String arrival;
    private Airport airport;
    private Airport airport2;

    public BookedFlight(int _flithNumber, String _departure, String _arrival, Airport _airport, Airport _airport2) {
        this.flithNumber = _flithNumber;
        this.departure = _departure;
        this.arrival = _arrival;
        this.airport = _airport;
        this.airport2 = _airport2;
    }
    
    
    @Override
    public String toString() {
        String printBoard = "\n Vuelo: " + flithNumber + "\n fecha de salida: " + departure + "\n Aeropuerto: "+ airport + "\n fecha de llegada: " + arrival
        + "Aeropuerto: " + airport2;
        return printBoard;}
    
}
