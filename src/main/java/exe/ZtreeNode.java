package exe;

public class ZtreeNode {
    private String name;

    private Integer id;

    public static ZtreeNode creat(String name,Integer id){

        ZtreeNode ztreeNode = new ZtreeNode();
        ztreeNode.name = name;
        ztreeNode.id = id;
        return ztreeNode;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ZtreeNode{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
