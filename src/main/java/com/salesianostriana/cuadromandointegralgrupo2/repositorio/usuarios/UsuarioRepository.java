package com.salesianostriana.cuadromandointegralgrupo2.repositorio.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.cuadromandointegralgrupo2.model.usuarios.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findFirstByEmail(String email);
}
