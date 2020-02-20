package arbolesBinarios;

/* Node definition */
class Node {

    String name;
 
    Node leftChild;

    Node rightChild;

    Node(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

}