/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csshell;

import java.io.Serializable;

/**
 *
 * @author ace
 */
public class CSShell implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        systemInfo info = new systemInfo();
        String MemInfo = info.MemInfo();
        System.out.println(MemInfo);
    }
    
}
