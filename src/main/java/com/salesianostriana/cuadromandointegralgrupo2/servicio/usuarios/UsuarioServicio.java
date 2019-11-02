package com.salesianostriana.cuadromandointegralgrupo2.servicio.usuarios;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.salesianostriana.cuadromandointegralgrupo2.model.usuarios.Usuario;
import com.salesianostriana.cuadromandointegralgrupo2.repositorio.usuarios.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServicio implements UserDetailsService {
	
	   private final UsuarioRepository repository;


	   @Override
	   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	       Usuario user = repository.findFirstByEmail(username);
	       List<GrantedAuthority> authority = (List<GrantedAuthority>) user.getAuthorities();
	       return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authority);
	   }
}
