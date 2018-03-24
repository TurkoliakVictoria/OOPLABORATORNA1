package com.company;

public class LinkedList {
private Node head;
private Node tail;
        /* Конструктор без аргументів */
        public LinkedList() {}
        /* Додати елемент в кінець списку */
        public void add(Integer data) {

            Node node = new Node();
            // новий элемент
           node.setData(data);
           if(tail == null)
            {
                head = node;
                tail = node;
            }
            else {
                tail.setNext(node);
                tail = node;
            }

        }
        /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
        public Integer get(int index) {
            int count=0;
            Node t=head;
            while (t!=null && index<size())
            {
                if(index==count)
                    return t.getData();
                  else{  count++;
                  t=t.getNext();}

            }
            return null;

        }
        /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
        public boolean delete(int index) {
            int count=0;
            Node t=head;
            if (head == null)
                return false;
            while (t!=null && index<size()) {
                if (index == count) {


                    // Store head node
                    Node temp = head;

                    if (index == 0)
                    {
                        head = temp.getNext();   // Change head
                        return true;
                    }

                    // Find previous node of the node to be deleted
                    for (int i = 0; temp != null && i < index - 1; i++)
                        temp = temp.getNext();

                    // If position is more than number of ndoes
                    if (temp == null || temp.getNext() == null)
                        return false;

                    // Node temp->next is the node to be deleted
                    // Store pointer to the next of node to be deleted
                    Node next = temp.getNext().getNext();

                    temp.setNext(next);
                    return true;// Unlink the deleted node from list
                } else {
                    count++;
                    t = t.getNext();
                }
            }



            return  false;
        }
        /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
        public int size() {
            int counter=0;
            Node t = head;       //получаем ссылку на первый элемент
            while (t != null)           //пока элемент существуе
            {
                t = t.getNext();
                counter++;//и переключаемся на следующий
            }
            return counter;
        }


    public static void main(String[] args) {
	// write your code here
       LinkedList t=new LinkedList();
       t.add(12);
       t.add(13);
       t.add(14);
       t.add(111);
       t.add(15);
       int a=t.size();

    }
}
