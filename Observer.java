/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idea;

/**
 *
 * @author Biruk
 */

public abstract class Observer {
   protected ItemSubject subject;
   public abstract void update();
}
