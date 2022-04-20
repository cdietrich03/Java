package week12.CodeForHomework12;



public class OurGenericLinkedListTester {


    public static void main(String[] args) {
        GenericNode<Integer> node1 = new GenericNode<>(22);
        GenericNode<Integer> node2 = new GenericNode<>(10);
        node1.setLink (node2);
        GenericNode<Integer> nextNode = node1;
        while (nextNode != null) {
            System.out.print (nextNode + " ");
            nextNode = nextNode.getLink();
        }
        //		System.out.println();
		GenericNode<String> gnode1 = new GenericNode<>("one");
		GenericNode<String> gnode2 = new GenericNode<>("two");
		gnode1.setLink (gnode2);
		GenericNode<String> gnextNode = gnode1;
		while (gnextNode != null) {
			System.out.print (gnextNode + " ");
			gnextNode = gnextNode.getLink();
		}


//        // create and test a linked list
//        OurGenericLinkedList<Integer> list = new OurGenericLinkedList();
//        System.out.println("list is " + list);
//
//
//        list.addNode(4);
//        System.out.println("list is " + list); // 4
//        System.out.println("0th item: "+ list.getValue(0));
//        list.addNode(2);
//        System.out.println(list); // 4 2
//        list.addNode(7);
//        list.addNode(71);
//        list.addNode(6);
//        System.out.println("list should be 4 2 7 71 6: " +  list); // 4 2 7 71 6
//        System.out.println("Size is " + list.size());
//
//        list.insert(3, 10);
//        System.out.println("list should be 4 2 7 10 71 6: " + list); // 4 2 7 10 71 6
//        list.insert(1, 100);
//        System.out.println("list should be 4 100 2 7 10 71 6: " + list); // 4 100 2 7 10 71 6
//        list.insert(0, 5);
//        System.out.println("list should be 5 4 100 2 7 10 71 6: " + list); // 5 4 100 2 7 10 71 6
//        list.insert(-2, -2);
//        System.out.println("list should be -2 5 4 100 2 7 10 71 6: " + list); // -2 5 4 100 2 7 10 71 6
//
//        list.insert(500, -4);
//        System.out.println("list should be -2 5 4 100 2 7 10 71 6 -4: " + list); // -2 5 4 100 2 7 10 71 6 -4
//
//        list.addNode(1000);
//        System.out.println("list should be -2 5 4 100 2 7 10 71 6 -4 1000: " + list); // -2 5 4 100 2 7 10 71 6 -4 1000

    }

}
