package api.mahasiswa.Services;

import api.mahasiswa.Models.Entity.Mahasiswa;
import api.mahasiswa.Models.Repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MahasiswaServices {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    //Service Insert Data Mahasiswa
    public Mahasiswa insertMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaRepository.save(mahasiswa);
    }

    //Service Mencari Mahasiswa Berdasarkan ID
    public Mahasiswa cariMahasiswaId(Long id){
        return mahasiswaRepository.findById(id).get();
    }

    //Service Mencari Keseluruhan Data Mahasiswa
    public Iterable<Mahasiswa> cariSeluruhMahasiswa(){
        return mahasiswaRepository.findAll();
    }

    //Service Menghapus Data Mahasiswa
    public void deleteMahasiswa(Long id){
        mahasiswaRepository.deleteById(id);
    }

    //Service Mengupdate Data Mahasiswa
    public Mahasiswa updateMahasiswa(Mahasiswa mahasiswa){
        return mahasiswaRepository.save(mahasiswa);
    }
}
