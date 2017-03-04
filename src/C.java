
public class C extends A {
    private String c1;
    private String c2;

    public C(String a, String c1, String c2) {
        super(a);
        this.c1 = c1;
        this.c2 = c2;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        C c = (C) o;

        if (!c1.equals(c.c1)) return false;
        return c2.equals(c.c2);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + c1.hashCode();
        result = 31 * result + c2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "C{" +
                "c1='" + c1 + '\'' +
                ", c2='" + c2 + '\'' +
                '}';
    }
}
