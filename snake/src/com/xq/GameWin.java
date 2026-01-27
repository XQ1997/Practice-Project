package com.xq;

import javax.swing.*;
import java.awt.*;

/**贪吃蛇小游戏
 * @author 26455
 */
public class GameWin extends JFrame {

    public void launch(){
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口的大小
        this.setSize(600,600);
        //设置窗口的位置在屏幕上居中
        this.setLocationRelativeTo(null);
        //设置窗口的标题
        this.setTitle("贪吃蛇小游戏");
    }

    //重写pint方法
    @Override
    public void paint(Graphics g){
        //灰色背景
        g.setColor(Color.gray);
        //填充矩形
        g.fillRect(0,0,600,600);
        //绘制网格线
        g.setColor(Color.black);
        //网格的本质是多条线相交组成
        //为了批量绘制直线使用for循环
        for(int i= 0;i<=20;i++){
            // 先绘制横线 前两个坐标是起始坐标，后两个是终点坐标
            g.drawLine(0,i * 30,600,i * 30);
            //竖线
            g.drawLine(i * 30,0,i * 30,600);
        }
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}
