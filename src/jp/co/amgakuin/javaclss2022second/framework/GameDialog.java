package jp.co.amgakuin.javaclss2022second.framework;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * モーダルダイアログクラス
 * @author kimura
 */
public class GameDialog extends JDialog implements ActionListener, Runnable
{
    private int timer = 0;

    /**
     * モーダルダイアログを表示する
     * @param parent ダイアログオーナーとなる{@link GameController}クラスのインスタンス
     * @param title ダイアログタイトル
     * @param msg 表示内容
     * @param buttonOrTimer 0の時、OKボタン表示、それ以外は指定秒数待ってから自動消滅
     */
    public static void showDialog(GameController parent, String title, String msg, int buttonOrTimer)
    {
        GameDialog dialog = new GameDialog(parent);

        dialog.setTitle("ダイアログ");
        Container pane = dialog.getContentPane();

        pane.add(new JLabel(msg), "Center");
        if (buttonOrTimer == 0) {
            JButton jb = new JButton("OK");
            jb.addActionListener(dialog);
            pane.add(jb, "South");
        } else {
            dialog.timer = buttonOrTimer;
        }
        dialog.pack();
        dialog.setBounds(0, 0, dialog.getWidth() + 40, dialog.getHeight() + 20);

        dialog.setLocation((parent.getWidth() - dialog.getWidth()) / 2, (parent.getHeight() - dialog.getHeight()) / 2);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialog.setResizable(false);
        if (buttonOrTimer != 0) {
            new Thread(dialog).start();
        }
        dialog.setVisible(true);
    }

    private GameDialog(Frame owner)
    {
        super(owner);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        this.dispose();
    }

    @Override
    public void run()
    {
        long start = System.currentTimeMillis();
        try {
            while ((System.currentTimeMillis() - start < timer * 1000)) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {

        }
        this.dispose();
    }
}
