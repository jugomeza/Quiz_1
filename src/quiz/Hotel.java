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
public class Hotel {
    private String name;
    private String addres;

    public Hotel(String _name, String _addres) {
        this.name = _name;
        this.addres = _addres;
    }
    
    @Override
    public String toString() {
        String printBoard = "\n Hotel: " + name + "\n Direccion: "+addres;
        return printBoard;}
    
}
