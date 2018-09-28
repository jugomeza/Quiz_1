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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TravelAgency Avitur = new TravelAgency("Avitur");
        Avitur.addAirport("José María Córdoba");
        Avitur.addAirport("El Dorado");
        Avitur.addAirport("Puetas del mar");
        Avitur.addAirport("Joel");
        Avitur.addKnownhotels("San Diego", "Cra. 21a #159A-28"); 
        Avitur.addKnownhotels("Fontanar", "Cra. 21a #159A-28");
        Avitur.addOfferedtravels("22/03/2017", 30, 1345, "22/03/2017", "22/03/2017", 1,3,1,1223,"22/04/2017","22/03/2017",2,4);
        Avitur.printall();
    }
       
}
