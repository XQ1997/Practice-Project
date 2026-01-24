import javax.swing.*;

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

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}
