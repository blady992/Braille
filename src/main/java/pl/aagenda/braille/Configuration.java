/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.aagenda.braille;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mryohan
 */
public class Configuration {
    private Font font;
    private char keyLT;
    private char keyLM;
    private char keyLB;
    private char keyRT;
    private char keyRM;
    private char keyRB;
    
    public Configuration() {
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("braille.ttf"));
            font = font.deriveFont(Font.PLAIN, 15);
        } catch (FontFormatException | IOException ex) {
            font = new Font("Dialog", Font.PLAIN, 15);
        }
        keyLT = 'e';
        keyLM = 'd';
        keyLB = 'c';
        keyRT = 'o';
        keyRM = 'k';
        keyRB = 'm';
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public char getKeyLT() {
        return keyLT;
    }

    public void setKeyLT(char keyLT) {
        this.keyLT = keyLT;
    }

    public char getKeyLM() {
        return keyLM;
    }

    public void setKeyLM(char keyLM) {
        this.keyLM = keyLM;
    }

    public char getKeyLB() {
        return keyLB;
    }

    public void setKeyLB(char keyLB) {
        this.keyLB = keyLB;
    }

    public char getKeyRT() {
        return keyRT;
    }

    public void setKeyRT(char keyRT) {
        this.keyRT = keyRT;
    }

    public char getKeyRM() {
        return keyRM;
    }

    public void setKeyRM(char keyRM) {
        this.keyRM = keyRM;
    }

    public char getKeyRB() {
        return keyRB;
    }

    public void setKeyRB(char keyRB) {
        this.keyRB = keyRB;
    }
}