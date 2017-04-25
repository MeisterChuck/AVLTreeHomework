public class AVLTreeHomework {

    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<Integer>();
        AVLTree<String> tree2 = new AVLTree<String>();
        
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(0);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        
        System.out.println("\n" + tree.contains(15));
        System.out.println(tree.contains(100));
        
        System.out.println("---------------");
        
        tree2.insert("allo");
        tree2.insert("sup");
        tree2.insert("tree");
        tree2.insert("bye");
        tree2.insert("bollywood");      
        
        System.out.println("\n" + tree2.contains("bollywood"));
        System.out.println(tree2.contains("hell"));
    }
    
}
