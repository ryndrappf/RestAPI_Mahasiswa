package api.mahasiswa.Models.Repository;

import api.mahasiswa.Models.Entity.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long> {

}
