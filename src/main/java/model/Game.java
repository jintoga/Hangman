/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DAT
 */
public class Game {

    private static final char HIDECHAR = '_';
    private String original = "";
    private String hidden = "";
    private String answer = "";

    public Game(String original) {
        this.original = original;

    }

    public void createHidden() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.original.length(); i++) {
            sb.append(HIDECHAR);
        }
        this.answer = sb.toString();
    }

    public boolean check(char input, String reveal) {
        StringBuilder ans = new StringBuilder(reveal);
        boolean found = false;

        for (int i = 0; i < this.original.length(); i++) {
            if (this.original.charAt(i) == input) {
                found = true;
                ans.setCharAt(i, input);
                this.answer = ans.toString();
            }
        }
        return found;
    }

    public String getAnswer() {
        return answer;
    }

    public String getHidden() {
        return this.hidden;
    }
}