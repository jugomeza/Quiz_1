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
public class Travel {
    private String start;
    private int duration;
    private BookedFlight  outbound;
    private BookedFlight  retorn;
    private Hotel hotel;

    public Travel(String _start, int _duration, int _flithNumber, String _departure, String _arrival, Airport _airport, Airport _airport2, Hotel _hotel) {
        this.start = _start;
        this.duration = _duration;
        this.hotel = _hotel;
        this.outbound = new BookedFlight( _flithNumber, _departure, _arrival, _airport, _airport2 );};
    
    public Travel(String _start, int _duration, int _flithNumber, String _departure, String _arrival, Airport _airport, Airport _airport3, Hotel _hotel,
     int _flithNumber2, String _departure2, String _arrival2, Airport _airport2, Airport _airport4) {
        this.start = _start;
        this.duration = _duration;
        this.hotel = _hotel;
        this.outbound = new BookedFlight( _flithNumber, _departure, _arrival, _airport, _airport3);
        this.retorn = new BookedFlight(_flithNumber2, _departure2, _arrival2, _airport2, _airport4);
    }

    
    @Override
    public String toString() {
        String printBoard = "\n Inicio: " + start + "\n Duracion: " + duration + " minutos" + outbound + "\n y de regreso: " + retorn;
        return printBoard;}
}
