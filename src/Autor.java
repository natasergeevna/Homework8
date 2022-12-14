import java.util.Objects;

public class Autor {
    String nameAutor;
    String surnameAutor;

    public Autor(String nameAutor, String surnameAutor) {
        this.nameAutor = nameAutor;
        this.surnameAutor = surnameAutor;
    }

    public String toString() {
        return " Имя автора: " + nameAutor + " Фамилия автора: " + surnameAutor;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        if (!Objects.equals(surnameAutor, autor.surnameAutor)) return false;
        return nameAutor.equals(autor.nameAutor);
    }

    public int hashCode() {
        return java.util.Objects.hash(nameAutor, surnameAutor);
    }

}
