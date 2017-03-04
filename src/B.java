
public class B extends A {
    private String b;

    public B(String a, String b) {
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        B b1 = (B) o;

        return b.equals(b1.b);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                '}';
    }
}
