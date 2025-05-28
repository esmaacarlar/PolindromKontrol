package bm2.sinif;

public class stack {
    int kapasite;
    int [] stack;
    int ust;
    
    public stack(int kapasite) {
        this.kapasite = kapasite;
        stack = new int[kapasite];
        ust = -1;
    }
    
    boolean dolumu() {
        if(ust == kapasite - 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    boolean bosmu() {
        return ust == -1;
    }
    
    void ekleme(int yeni) {
        if(!dolumu()) {
            ust = ust + 1;
            stack[ust] = yeni;
            System.out.println(yeni);
        }
    }
    
    int cikarma() {
        if(!bosmu()) {
            ust = ust - 1;
            System.out.println(stack[ust + 1]);
            return stack[ust + 1];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        stack s = new stack(10);
        System.out.println("eleman ekleme");
        s.ekleme(4);
        s.ekleme(9);
        s.ekleme(1);
        s.ekleme(7);
        System.out.println("eleman çıkarma");
        s.cikarma();
        s.cikarma();
        s.cikarma();
        s.cikarma();
    }
}