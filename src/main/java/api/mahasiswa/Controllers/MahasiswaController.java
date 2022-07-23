package api.mahasiswa.Controllers;

import api.mahasiswa.DTO.ResponseData;
import api.mahasiswa.Models.Entity.Mahasiswa;
import api.mahasiswa.Services.MahasiswaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/mahasiswa/api")
public class MahasiswaController {

    @Autowired
    MahasiswaServices mahasiswaServices;

    @PostMapping
    //Controller Menambahkan Data Mahasiswa
    public ResponseEntity<ResponseData<Mahasiswa>> insertMahasiswa(@Valid @RequestBody Mahasiswa mahasiswa, Errors errors){
        ResponseData<Mahasiswa> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for (ObjectError error: errors.getAllErrors()) {
                responseData.getMessage().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayLoad(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayLoad(mahasiswaServices.insertMahasiswa(mahasiswa));
        return ResponseEntity.ok(responseData);
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
