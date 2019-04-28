/**
 * @author wangjialong
 * @date 2019年04月28日 11:08
 * @description Kruskal算法边数据结构
 */
public class EdgeData {
    /*边的起点*/
    private char start;
    /*边的终点*/
    private char end;
    /*边的权重*/
    private int weight;


    public EdgeData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public char getStart() {
        return start;
    }

    public void setStart(char start) {
        this.start = start;
    }

    public char getEnd() {
        return end;
    }

    public void setEnd(char end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
