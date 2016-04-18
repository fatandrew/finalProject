package com.company;

/**
 * Created by User on 13.04.2016.
 */
public class LinkedList {
    private static class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry(E element, Entry<E> next, Entry<E> prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Entry() {
            super();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Entry<E> getNext() {
            return next;
        }

        public void setNext(Entry<E> next) {
            this.next = next;
        }

        public Entry<E> getPrev() {
            return prev;
        }

        public void setPrev(Entry<E> prev) {
            this.prev = prev;
        }
    }
}
