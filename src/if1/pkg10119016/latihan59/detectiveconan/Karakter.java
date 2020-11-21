package if1.pkg10119016.latihan59.detectiveconan;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan karakter
 * detective conan
 */
public class Karakter extends Manusia {
    private String role, kepribadian;
    
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getKepribadian() {
        return this.kepribadian;
    }
    
    public void setKepribadian(String kepribadian) {
        this.kepribadian = kepribadian;
    }
    
    public void tampilKarakter() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Umur\t\t: " + super.getUmur());
        System.out.println("Kepribadian\t: " + getKepribadian());
        System.out.println("Role\t\t: " + getRole());
        System.out.println();
    }
}