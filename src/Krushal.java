import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wangjialong
 * @date 2019年04月28日 11:14
 * @description 克鲁斯卡尔算法
 */
public class Krushal {

    public void krushal(MatrixUDG matrixUDG) {
        int index = 0;
        int[] vEnds = new int[matrixUDG.getmEdgeNum()];
        EdgeData[] rets = new EdgeData[matrixUDG.getmEdgeNum()];


        EdgeData[] edgeDatas = getEdges(matrixUDG);
        edgeDatas = sortEdges(edgeDatas);
        for (int i=0;i<matrixUDG.getmEdgeNum();i++) {
            int positionStart = getPosition(matrixUDG.getmVexs(),edgeDatas[i].getStart());
            int positionEnd = getPosition(matrixUDG.getmVexs(),edgeDatas[i].getEnd());
            int start = getEnd(vEnds,positionStart);
            int end = getEnd(vEnds,positionEnd);
            if(start != end) {
                vEnds[start] = end;
                rets[index++] = edgeDatas[i];
            }

        }

        /*统计并打印"kruskal最小生成树"的信息*/
        int length = 0;
        for (int i = 0; i < index; i++) {
            length += rets[i].getWeight();
        }

        System.out.printf("Kruskal=%d: ", length);
        for (int i = 0; i < index; i++) {
            System.out.printf("(%c,%c) ", rets[i].getStart(), rets[i].getEnd());
        }
        System.out.printf("\n");

    }


    private EdgeData[] getEdges(MatrixUDG matrixUDG) {
        int index = 0;
        EdgeData[] edgeData = new EdgeData[matrixUDG.getmEdgeNum()];
        for (int i = 0; i < matrixUDG.getmVexs().length; i++) {
            for (int j = i + 1; j < matrixUDG.getmVexs().length; j++) {
                if (matrixUDG.getmMatrix()[i][j] != MatrixUDG.getINF()) {
                    edgeData[index++] = new EdgeData(matrixUDG.getmVexs()[i], matrixUDG.getmVexs()[j], matrixUDG.getmMatrix()[i][j]);
                }
            }
        }
        return edgeData;
    }

    private EdgeData[] sortEdges(EdgeData[] edgeData) {
        Arrays.sort(edgeData, Comparator.comparingInt(EdgeData::getWeight));
        return edgeData;
    }


    private int  getPosition(char[] mVexs,char data){
        for (int i = 0; i < mVexs.length; i++) {
            if(data == mVexs[i]) {
                return i;
            }
        }
        return -1;
    }


    private int getEnd(int[] vends, int i) {
        if(vends[i] != 0) {
            return vends[i];
        }
        return i;
    }
}
