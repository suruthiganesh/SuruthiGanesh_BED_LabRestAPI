package com.example.students.service;

import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.students.dao.UserRepository;
import com.example.students.model.DomainUserDetails;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class DomainUserDetailsService implements UserDetailsService
{
	
	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		return this.userRepository
							.findByUsername(username)
							.map(DomainUserDetails::new)
							.orElseThrow(() -> new UsernameNotFoundException("bad credentials"));
	}

}


