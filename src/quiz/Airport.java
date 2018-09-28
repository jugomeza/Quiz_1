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
public class Airport {
    private String description;
    public Airport (String _description){
    this.description = _description;
    }

    @Override
    public String toString() {
        String printBoard = "\n Descripcion: " + description;
        return printBoard;}
    
}
