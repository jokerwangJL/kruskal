/**
 * @author wangjialong
 * @date 2019年04月28日 11:10
 * @description 图的邻接矩阵数据结构
 */
public class MatrixUDG {

    /*顶点集合*/
    private char[] mVexs;
    /*邻接矩阵*/
    private int[][] mMatrix;
    /*边的数量*/
    private int mEdgeNum;
    /*表示无穷大*/
    private static final int INF = Integer.MAX_VALUE;

    public char[] getmVexs() {
        return mVexs;
    }

    public void setmVexs(char[] mVexs) {
        this.mVexs = mVexs;
    }

    public int[][] getmMatrix() {
        return mMatrix;
    }

    public void setmMatrix(int[][] mMatrix) {
        this.mMatrix = mMatrix;
    }

    public int getmEdgeNum() {
        return mEdgeNum;
    }

    public void setmEdgeNum(int mEdgeNum) {
        this.mEdgeNum = mEdgeNum;
    }

    public static int getINF() {
        return INF;
    }
}
