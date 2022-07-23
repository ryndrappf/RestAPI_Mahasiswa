package api.mahasiswa.Controllers;

import api.mahasiswa.Models.Entity.Mahasiswa;
import api.mahasiswa.Services.MahasiswaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mahasiswa/api")
public class MahasiswaController {

    @Autowired
    MahasiswaServices mahasiswaServices;

    @PostMapping
    //Controller Menambahkan Data Mahasiswa
    public Mahasiswa insertMahasiswa(@RequestBody Mahasiswa mahasiswa){
        return mahasiswaServices.insertMahasiswa(mahasiswa);
    }

    @GetMapping("/{id}")
    //Controller Menampilkan Data Mahasiswa Berdasarkan ID
    public Mahasiswa cariMahasiswaID(@PathVariable("id") Long id){
        return mahasiswaServices.cariMahasiswaId( id);
    }

    @GetMapping
    //Controller Menampilkan Data Seluruh Mahasiswa
    public Iterable<Mahasiswa> cariSeluruhMahasiswa(){
        return mahasiswaServices.cariSeluruhMahasiswa();
    }

    @DeleteMapping("/{id}")
    //Controller Menghapus Data Mahasiswa Berdasarkan ID
    public void deleteMahasiswa(@PathVariable("id") Long id){
        mahasiswaServices.deleteMahasiswa(id);
    }

    @PutMapping
    //Controller Mengubah Data Mahasiswa
    public Mahasiswa updateMahasiswa(@RequestBody  Mahasiswa mahasiswa){
        return mahasiswaServices.updateMahasiswa(mahasiswa);
    }
}
