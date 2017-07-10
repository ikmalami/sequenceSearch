/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sequencesearch;

/**
 *
 * @author Asus
 */
public class SequenceSearch {
    public static void main(String[] args) {
        Sequence ikmal = new Sequence(99);
        System.out.println("Data :");
        ikmal.cetakArray();
        ikmal.sort();
        System.out.println("\nSetelah di sort :");
        ikmal.cetakArray();
        
    }
    
}
