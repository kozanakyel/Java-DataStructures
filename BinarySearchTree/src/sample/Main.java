package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        BST<String> tree = new BST<>();

        BorderPane pane = new BorderPane();
        BTView view = new BTView(tree);
        pane.setCenter(view);

        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_CENTER);
        Button btInsert = new Button("Insert");
        Button btDelete = new Button("Delete");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a key: "),
                tfKey, btInsert, btDelete);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);

        btInsert.setOnAction(e -> {
            String key = tfKey.getText();
            if (tree.search(key)){
                view.displayTree();
                view.setStatus(key + " is already in the tree");
            }else{
                tree.insert(key);
                view.displayTree();
                view.setStatus(key + " is inserted in the tree");
            }
        });

        btDelete.setOnAction(e -> {
            String key = tfKey.getText();
            if (tree.search(key)){
                view.displayTree();
                view.setStatus(key+" is not in the tree");
            }else{
                tree.delete(key);
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");
            }
        });

        Scene scene = new Scene(pane, 450, 250);
        primaryStage.setTitle("BSTAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();

         */
    }


    public static void main(String[] args) {
        //launch(args);
    /*
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        printTree(tree);

        System.out.println("\nAfter delete George:");
        tree.delete("George");
        printTree(tree);

        System.out.println("\nAfter delete Adam:");
        tree.delete("Adam");
        printTree(tree);

        System.out.println("\nAfter delete Michael:");
        tree.delete("Michael");
        printTree(tree);
    /*
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());
        System.out.print("\nIs Peter in the tree? " +
                tree.search("Peter"));

        System.out.print("\nA path from the root to Peter is: ");
        java.util.ArrayList<BST.TreeNode<String>> path =
                tree.path("Peter");

        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

        Integer[] numbers = {2,4,3,1,8,5,6,7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();

     */

        //AVLTreeTest

        AVLTree<Integer> tree = new AVLTree<>(new Integer[]{25,20,5});
        System.out.print("After inserting 25, 20, 5:");
        printTree(tree);

        tree.insert(34);
        tree.insert(50);
        System.out.print("\nAfter inserting 34, 50:");
        printTree(tree);

        tree.insert(30);
        System.out.print("\nAfter inserting 30:");
        printTree(tree);

        tree.insert(10);
        System.out.print("\nAfter inserting 10:");
        printTree(tree);

        tree.delete(34);
        tree.delete(30);
        tree.delete(50);
        System.out.print("\nAfter removing 34, 30, 50:");
        printTree(tree);

        tree.delete(5);
        System.out.print("\nAfter removing 5:");
        printTree(tree);

        System.out.print("\nTraverse the elements in the tree: ");
        for (int e: tree){
            System.out.print(e + " ");
        }
    }

    public static void printTree(BST tree){
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());
        System.out.println();
    }
}
