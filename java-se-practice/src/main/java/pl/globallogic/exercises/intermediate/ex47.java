package pl.globallogic.exercises.intermediate;
public abstract class ex47 {
    protected ex47 rightLink = null;
    protected ex47 leftLink = null;
    protected Object value;

    public ex47(Object value) {
        this.value = value;
    }

    abstract ex47 next();
    abstract ex47 setNext(ex47 item);
    abstract ex47 previous();
    abstract ex47 setPrevious(ex47 item);
    abstract int compareTo(ex47 item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Node extends ex47 {
    public Node(Object value) {
        super(value);
    }

    @Override
    ex47 next() {
        return this.rightLink;
    }

    @Override
    ex47 setNext(ex47 item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ex47 previous() {
        return this.leftLink;
    }

    @Override
    ex47 setPrevious(ex47 item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ex47 item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}

interface NodeList {
    ex47 getRoot();
    boolean addItem(ex47 item);
    boolean removeItem(ex47 item);
    void traverse(ex47 root);
}

class MyLinkedList implements NodeList {
    private ex47 root = null;

    public MyLinkedList(ex47 root) {
        this.root = root;
    }

    @Override
    public ex47 getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ex47 newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ex47 currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ex47 item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ex47 currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ex47 root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

class SearchTree implements NodeList {
    private ex47 root = null;

    public SearchTree(ex47 root) {
        this.root = root;
    }

    @Override
    public ex47 getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ex47 newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ex47 currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ex47 item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ex47 currentItem = this.root;
        ex47 parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                performRemoval(currentItem, parentItem);
                return true;
            } else if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
        }
        return false;
    }

    private void performRemoval(ex47 item, ex47 parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ex47 current = item.next();
            ex47 leftMostParent = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ex47 root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
