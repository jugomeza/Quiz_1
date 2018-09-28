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
public class TravelAgency {

    private String name;
    private Airport[] airport;
    private Hotel[] knownhotels;
    private Travel[] offeredtravels;

    public TravelAgency(String _name) {
        this.name = _name;
        this.airport = new Airport[4];
        this.knownhotels = new Hotel[5];
        this.offeredtravels = new Travel[10];

    }

    public boolean addAirport(String _name) {
        for (int i = 0; i < 4; i++) {
            if (airport[i] == null) {
                airport[i] = new Airport(_name);
            return true;}

        }
        return false;
    }

    public boolean addKnownhotels(String _name, String _addres) {
        for (int i = 0; i < 5; i++) {
            if (knownhotels[i] == null) {
                knownhotels[i] = new Hotel(_name, _addres);
            return true;}

        }
        return false;
    }

    public boolean addOfferedtravels(String _start, int _duration, int _flithNumber, String _departure, String _arrival, int _airport, int _airport2, int _hotel) {
        for (int i = 0; i < 10; i++) {
            if (offeredtravels[i] == null) {
                offeredtravels[i] = new Travel(_start, _duration, _flithNumber, _departure, _arrival, airport[_airport - 1], airport[_airport2 - 1], knownhotels[_hotel - 1]);
            return true;}

        }
        return false;
    }
    
    public boolean addOfferedtravels(String _start, int _duration, int _flithNumber, String _departure, String _arrival, int _airport, int _airport3, int _hotel,
     int _flithNumber2, String _departure2, String _arrival2, int _airport2, int _airport4) {
        for (int i = 0; i < 10; i++) {
            if (offeredtravels[i] == null) {
                offeredtravels[i] = new Travel(_start, _duration, _flithNumber, _departure, _arrival, airport[_airport - 1], airport[_airport3 - 1], knownhotels[_hotel - 1],
                         _flithNumber2, _departure2, _arrival2, airport[_airport2 - 1], airport[_airport4 - 1]);
            return true;}

        }
        return false;
    }

    public void printall() {
        for (int i = 0; i < 10; i++) {
            if (offeredtravels[i] != null) {
                System.out.println("\n Viaje ofrecido" + offeredtravels[i].toString());
            }
        }
    }

}
