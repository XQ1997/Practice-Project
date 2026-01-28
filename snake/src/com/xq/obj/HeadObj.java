package com.xq.obj;

import com.xq.GameWin;
import com.xq.utils.GameUtils;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        //键盘监听事件
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                changeDirection(e);
            }
        });
    }

    //控制移动方向  w -up  a - left   d -right  s-down 将原来的wasd替换成上下左右
    public void changeDirection(KeyEvent e){
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                // 替换原来的 VK_A
                if (!"right".equals(direction)) {
                    direction = "left";
                    img = GameUtils.leftImg;
                }
                break;
            case KeyEvent.VK_RIGHT:
                // 替换原来的 VK_D
                if (!"left".equals(direction)) {
                    direction = "right";
                    img = GameUtils.rightImg;
                }
                break;
            case KeyEvent.VK_UP:
                // 替换原来的 VK_W
                if (!"down".equals(direction)) {
                    direction = "up";
                    img = GameUtils.upImg;
                }
                break;
            case KeyEvent.VK_DOWN:
                // 替换原来的 VK_S
                if (!"up".equals(direction)) {
                    direction = "down";
                    img = GameUtils.downImg;
                }
                break;
            default:
                break;
        }

    }

    //蛇的移动
    public void move(){
        switch (direction){
            case "up":
                y -= height;
                break;
            case "down":
                y += height;
                break;
            case "left":
                x -= width;
                break;
            case "right":
                x += width;
            default:
                break;
        }
    }

    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
        move();
        //越界处理
        if (x < 0){
            x = 570;
        } else if (x > 570){
            x = 0;
        } else if (y < 30){
            y = 570;
        }else if (y > 570){
            y = 30;
        }
    }
}
