package api.mahasiswa.Models.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbl_mahasiswa")
public class Mahasiswa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nim_mahasiswa", length = 8)
    private String nim;

    @Column(name = "nama_mahasiswa", length = 100)
    private String nama;

    @Column(name = "alamat_mahasiswa", length = 255)
    private String alamat;

    @Column(name = "ttl_mahasiswa", length = 255)
    private String ttl;

    public Mahasiswa() {
    }

    public Mahasiswa(Long id, String nim, String nama, String alamat, String ttl) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
