package poslovna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import poslovna.model.Narudzbenica;

public interface NarudzbenicaRepository extends JpaRepository<Narudzbenica, Long>{

	List<Narudzbenica> findByPoslovniPartnerIdAndKompanijaId(Long idPP, Long idKompanije);

}
