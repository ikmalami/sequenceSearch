/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sequencesearch;

import java.util.Random;


class Sequence {
    private int [] data;
    private static Random generator = new Random();
    
    Sequence(int size){
        data = new int [size];
            for (int i = 0; i < size; i++) 
            
               data[i] = generator.nextInt(90);

    }
    
    public int searching(int ygDicari){
        int jumlahElemen = 0;
        for (int next = 0; next < data.length; next++) {
            if (data[next] == ygDicari) {
                
                jumlahElemen++;
            }
        }
        return jumlahElemen;
    }
    
    public void sort(){
        long mulai = System.currentTimeMillis();
        int temp;
        for (int next = 0; next < data.length; next++) {
            for (int pemb = 1; pemb < data.length; pemb++) {
                if (data[pemb] < data[pemb - 1]) {
                    temp = data[pemb - 1];
                    data[pemb - 1] = data[pemb];
                    data[pemb] = temp;
                    
                }
            }
        }
    }
    
    
    
    public void cetakArray()
    {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
            
        }
    }
}
