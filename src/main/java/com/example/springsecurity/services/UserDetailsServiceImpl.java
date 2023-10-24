package com.example.springsecurity.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.repository.UserRepository;
import com.example.springsecurity.userdetail.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepository.findByUserName(userName);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found"+ userName));
		return new MyUserDetails(user.get());
	}

}
