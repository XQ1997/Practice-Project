package com.xq.obj;


import com.xq.GameWin;

import java.awt.*;

/**创建蛇头部
 * @author 26455
 */
public class HeadObj extends GameObj {
    //方向 up down left right
    private String direction = "right";

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public HeadObj(Image img, int x, int y, GameWin frame) {
        super(img, x, y, frame);
    }

    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
    }
}
