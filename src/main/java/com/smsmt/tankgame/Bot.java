/**
 * Created by michaelfagan on 16/05/16.
 */
package com.smsmt.tankgame;
import com.smsmt.tankgame.*;
public class Bot {
    public static void main(String[] args){
        TankProviderInterface tankProvider = new TankProvider();
        TankInterface tankInterface = tankProvider.requestTank("tankgame.recursiveloop.io", 9999, TankColour.YELLOW);
        tankInterface.move(Direction.NORTH);
    }
}
