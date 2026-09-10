public class MiListaDoble implements ListInterface {
    DoubleNode cabeza = null;

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    @Override
    public int getSize() {
        DoubleNode iterador = cabeza;
        int contador = 0;

        while (iterador != null) {
            contador++;
            iterador = iterador.siguiente;
        }
        return contador;
    }

    @Override
    public void clear() {
        cabeza = null;
    }

    @Override
    public Object getHead() {
        if (cabeza == null) {
            return null;
        }
        return cabeza.dato;
    }

    @Override
    public Object getTail() {
        if (cabeza == null) {
            return null;
        }

        DoubleNode iterador = cabeza;
        while (iterador.siguiente != null) {
            iterador = iterador.siguiente;
        }
        return iterador.dato;
    }

    @Override
    public Object get(DoubleNode node) {
        if (node == null) {
            return null;
        }
        return node.dato;
    }

    @Override
    public DoubleNode search(Object object) {
        if (object == null) {
            return null;
        }

        DoubleNode iterador = cabeza;
        while (iterador != null) {
            if (iterador.dato.equals(object)) {
                return iterador;
            }
            iterador = iterador.siguiente;
        }
        return null;
    }

    @Override
    public boolean add(Object object) {
        if (object == null) return false;

        DoubleNode nuevo = new DoubleNode(object);

        if (cabeza == null) {
            cabeza = nuevo;
            return true;
        }

        DoubleNode actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
        nuevo.anterior = actual;

        return true;
    }

    @Override
    public boolean insert(DoubleNode node, Object object) {
        if (node == null || object == null) return false;

        DoubleNode actual = cabeza;
        while (actual != null) {
            if (actual == node) {
                DoubleNode nuevo = new DoubleNode(object);
                DoubleNode siguienteOriginal = node.siguiente;

                nuevo.anterior = node;
                nuevo.siguiente = siguienteOriginal;
                node.siguiente = nuevo;

                if (siguienteOriginal != null) {
                    siguienteOriginal.anterior = nuevo;
                }

                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public boolean insert(Object objectRef, Object object) {
        DoubleNode nodoReferencia = search(objectRef);

        if (nodoReferencia == null) {
            return false;
        }
        return insert(nodoReferencia, object);
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(DoubleNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(DoubleNode node) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public MiListaDoble subList(DoubleNode from, DoubleNode to) {
        return null;
    }

    @Override
    public MiListaDoble sortList() {
        return null;
    }
}
