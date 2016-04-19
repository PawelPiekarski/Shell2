/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shell2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author użytkownik1
 */
public class MyTextArea extends javax.swing.JTextArea implements CaretListener{

    int poczatekPolecenia;
  //  int poprzedniaPozycjaKursora;
    
    public MyTextArea()
    {
        addCaretListener(this); 
    }
    
    @Override
    public void caretUpdate(CaretEvent e) {
       if(e.getDot()<poczatekPolecenia)
            setCaretPosition(poczatekPolecenia);
    }
    
    String zczytaniePolecenia()
    {
        String polecenie=this.getText().substring(poczatekPolecenia);
        return polecenie;
    }
}
