
public class D extends A{
    private String d;
    private String d1;
    private String d2;

    public D(String a, String d, String d1, String d2) {
        super(a);
        this.d = d;
        this.d1 = d1;
        this.d2 = d2;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        D d3 = (D) o;

        if (!d.equals(d3.d)) return false;
        if (!d1.equals(d3.d1)) return false;
        return d2.equals(d3.d2);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + d.hashCode();
        result = 31 * result + d1.hashCode();
        result = 31 * result + d2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                '}';
    }
}
