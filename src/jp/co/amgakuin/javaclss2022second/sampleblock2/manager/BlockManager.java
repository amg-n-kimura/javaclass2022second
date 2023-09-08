package jp.co.amgakuin.javaclss2022second.sampleblock2.manager;

import java.util.LinkedList;
import java.util.List;

import jp.co.amgakuin.javaclss2022second.framework.GameController;
import jp.co.amgakuin.javaclss2022second.framework.GameControllerObject;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.Block;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock.BlueBlock;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock.GreenBlock;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock.MagentaBlock;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock.RedBlock;
import jp.co.amgakuin.javaclss2022second.sampleblock2.ui.colorblock.YellowBlock;

public class BlockManager
{
    public final static int BLOCK_HORIZONTAL = 10;
    public final static int BLOCK_VERTICAL = 5;
    public final static int BLOCK_SPACE_HORIZONTAL = 5;
    public final static int BLOCK_SPACE_VERTICAL = 2;
    public final static int BLOCK_SPACE_VERTICAL_HEADER = 20;

    final static int COLOR_TYPE_RED = 0;
    final static int COLOR_TYPE_MAGENTA = 1;
    final static int COLOR_TYPE_YELLOW = 2;
    final static int COLOR_TYPE_GREEN = 3;
    final static int COLOR_TYPE_BLUE = 4;

    /**
     * ゲームコントローラーのインスタンスをもらっておく必要がある
     */
    private GameController gameController;

    /**
     * ブロックリスト
     */
    private List<Block> blockList = null;

    /**
     * シングルトンデザインの実装
     */
    private final static BlockManager me = new BlockManager();

    /**
     * 空のコンストラクタ
     */
    private BlockManager()
    {
    }

    /**
     * インスタンスの取得
     *
     * @return {@link BlockManager}
     */
    public static BlockManager getInstance()
    {
        return me;
    }

    private Block createColorBlock(int colorNo)
    {
        switch (colorNo) {
        case COLOR_TYPE_RED:
            return new RedBlock();
        case COLOR_TYPE_YELLOW:
            return new YellowBlock();
        case COLOR_TYPE_BLUE:
            return new BlueBlock();
        case COLOR_TYPE_GREEN:
            return new GreenBlock();
        case COLOR_TYPE_MAGENTA:
            return new MagentaBlock();
        }
        return null;
    }

    public void initialize(GameController gameController)
    {
        this.gameController = gameController;
        blockList = new LinkedList<>();
        for (int v = 0; v < BLOCK_VERTICAL; v++) {
            for (int h = 0; h < BLOCK_HORIZONTAL; h++) {
                Block block = createColorBlock(v);

                GameControllerObject obj;
                obj = block;

                block.setX(BLOCK_SPACE_HORIZONTAL + h * (Block.BLOCK_WIDTH + BLOCK_SPACE_HORIZONTAL));
                block.setY(BLOCK_SPACE_VERTICAL_HEADER + v * (Block.BLOCK_HEIGHT + BLOCK_SPACE_VERTICAL));
                blockList.add(block);
                gameController.addObject(block);
            }
        }
    }
}
